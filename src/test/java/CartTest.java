import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.NoSuchElementException;
import pages.CartPage;
import pages.HomePage;
import pages.LoginPage;

import static configure.DriverFactory.closeDriver;

public class CartTest {
    private HomePage page = new HomePage();
    private LoginPage Lpage = new LoginPage();
    private CartPage Cpage = new CartPage();

    @Before
    public void Init() {
        Lpage.openSite();
        Lpage.writeEmail("standard_user");
        Lpage.writePassword("secret_sauce");
        Lpage.clickLogIn();

    }

    @After
    public void close() {
        closeDriver();
    }

    @Test
    public void testCaseAddCart() {
        page.clickAddCartButton();
        page.clickCartIcon();
        Assert.assertEquals("Sauce Labs Bike Light", page.asserTextProduct());
    }

    @Test
    public void testCaseRemoveFromCArt() {
        page.clickAddCartButton();
        page.clickCartIcon();
        Cpage.clickRemoveButton();
        try {
            Cpage.clickRemoveButton();

            Assert.fail("The Element Exist");
            
        } catch (NoSuchElementException e){

        }
    }
}