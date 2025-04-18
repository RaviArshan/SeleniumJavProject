package org.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

public class EnterKey {
    @Test
    public void enterKeyInGooogle() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement ele = driver.findElement(By.name("q"));
       /* ele.sendKeys("Ravi");
        ele.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        driver.close();  */

        Actions action=new Actions(driver);
        action.click(ele);
        Thread.sleep(2000);
        action.keyDown(Keys.SHIFT);
        action.sendKeys("Ravi");
        action.keyUp(Keys.SHIFT);
        Thread.sleep(2000);
        action.sendKeys(Keys.ENTER).
                build().perform();
        Thread.sleep(3000);
        driver.close();

    }
}
