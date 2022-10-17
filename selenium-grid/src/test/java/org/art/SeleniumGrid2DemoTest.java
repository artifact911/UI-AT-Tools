package org.art;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumGrid2DemoTest {

    @Test
    public void googleSearch() throws InterruptedException, MalformedURLException {

        // для запуска на Grid:
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setBrowserName("firefox");

        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.100.40:4444"), caps);

        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("Java");
        driver.findElement(By.name("q")).submit();

        Thread.sleep(3000);

        driver.quit();
    }

    @Test
    public void googleSearch2() throws InterruptedException, MalformedURLException {

        // для запуска на Grid:
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setBrowserName("firefox");

        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.100.40:4444"), caps);

        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("Groovy");
        driver.findElement(By.name("q")).submit();

        Thread.sleep(3000);

        driver.quit();
    }

    @Test
    public void googleSearch3() throws InterruptedException, MalformedURLException {

        // для запуска на Grid:
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setBrowserName("firefox");

        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.100.40:4444"), caps);

        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("Gradle");
        driver.findElement(By.name("q")).submit();

        Thread.sleep(3000);

        driver.quit();
    }
}
