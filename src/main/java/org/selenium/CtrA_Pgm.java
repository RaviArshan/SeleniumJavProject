package org.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CtrA_Pgm {
    @Test
    public void enterKeyInGooogle() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement ele = driver.findElement(By.name("q"));
        // Create Actions instance
        Actions actions = new Actions(driver);

        // Click on input, type uppercase "RAVI" using SHIFT, then Ctrl+A to select all
        actions.click(ele)
                .keyDown(Keys.SHIFT).sendKeys("ravi").keyUp(Keys.SHIFT)
                .keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL)
                .build().perform();
        Thread.sleep(4000);
        driver.close();
    }
}
