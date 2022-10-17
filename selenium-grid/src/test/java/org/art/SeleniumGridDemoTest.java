package org.art;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumGridDemoTest {

    @Test
    public void googleSearch() throws InterruptedException, MalformedURLException {

//        System.setProperty("webdriver.chrome.driver",
//                           "/Users/anduser/Documents/_Projects/fromLessons/at-Tools-java/selenium-grid/grid/driver/chromedriver");
//
//        WebDriver driver = new ChromeDriver();

        // для запуска на Grid:
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setBrowserName("safari");

        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.111.214:4444"), caps);

        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("Selenium Grid 4");
        driver.findElement(By.name("q")).submit();

        Thread.sleep(3000);

        driver.quit();
    }

}
