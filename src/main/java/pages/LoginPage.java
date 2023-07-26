package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static configure.DriverFactory.getDriver;


public class LoginPage extends BasePage {

    WebDriverWait wait = new WebDriverWait(getDriver(),10);

    public void openSite() {
        openWeb("https://www.saucedemo.com/");
    }

    public void writeEmail(String email) {
        writeElementID("user-name", email);
    }

    public void writePassword(String Pass) {
        writeElementID("password", Pass);
    }

    public void clickLogIn() {
        clickElementID("login-button");
    }

    public String assertText() {
        return getTextXpath("//*[@id=\"header_container\"]/div[2]/span");
    }

    public String assertTextError(){
        String loc = "//*[@id=\"login_button_container\"]/div/form/div[3]";
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(loc)));
        return getTextXpath(loc);
    }

}