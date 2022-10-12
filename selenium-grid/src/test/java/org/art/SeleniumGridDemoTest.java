package org.art;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumGridDemoTest {

    @Test
    public void googleSearch() {

        System.setProperty("webdriver.chrome.driver",
                           "/Users/anduser/Documents/_Projects/fromLessons/at-Tools-java/selenium-grid/grid/driver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
    }

}
