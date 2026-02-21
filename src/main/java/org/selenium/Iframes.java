package org.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Iframes {
    @Test
    public void iframes() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/frame.xhtml");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        driver.switchTo().frame(1);
        driver.findElement(By.xpath(""));
    }
}
