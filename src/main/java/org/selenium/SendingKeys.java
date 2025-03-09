package org.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SendingKeys {
    @Test
    public void sendKeysDifferent() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement ele=driver.findElement(By.name("q"));
        //ele.sendKeys("Ravi");
        JavascriptExecutor js=(JavascriptExecutor) driver;
        //Without pssing the webElement
        //js.executeScript("document.getElementsByName('q')[0].value='Ravi'","");
        //passing the webelement
        js.executeScript("arguments[0].value='Ravi'",ele);
        Thread.sleep(2000);
        driver.quit();


    }
}
