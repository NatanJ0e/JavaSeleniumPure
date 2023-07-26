package configure;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
    private static WebDriver driver;

    private DriverFactory() {
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            driver = new ChromeDriver();
            return driver;
        }
        return driver;
    }
        public static void closeDriver () {
            if(driver != null){
                driver.quit();
                driver = null;
            }
    }
}


