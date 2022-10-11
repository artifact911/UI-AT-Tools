package org.art.orange.driver;

import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.open;

public class HelperClass {

    private static HelperClass helperClass;
    private static WebDriver driver = new ChromeDriver();
    public final static int TIMEOUT = 10;

    private HelperClass() {
//       WebDriverRunner.setWebDriver(new ChromeDriver());
//       driver = new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
       driver.manage().window().maximize();
    }

    public static void openPage(String url) {
        open(url);
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setUpDriver() {
        if(helperClass == null) {
            helperClass = new HelperClass();
        }
    }

    public static void tearDown() {
        if(driver!=null) {
            driver.close();
            driver.quit();
        }
        helperClass = null;
    }
}
