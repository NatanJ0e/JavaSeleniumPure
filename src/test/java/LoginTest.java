import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pages.LoginPage;

import static configure.DriverFactory.closeDriver;



public class LoginTest{

    private LoginPage page = new LoginPage();


    @Before
    public void Init(){
        page.openSite();

    }

    @After
    public void close() {
        closeDriver();
    }

    @Test
    public void testCaseLogin() {
        page.writeEmail("standard_user");
        page.writePassword("secret_sauce");
        page.clickLogIn();
        Assert.assertEquals("Products", page.assertText());
    }

    @Test
    public void testCaseInvalidLogin(){
        page.writeEmail("problem_user_invalid");
        page.writePassword("secret_sauce");
        page.clickLogIn();
        Assert.assertEquals("Epic sadface: Username and password do not match any user in this service", page.assertTextError());
    }



}