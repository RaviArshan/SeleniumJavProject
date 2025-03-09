package org.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class diffCloseAndQuit {
    WebDriver driver;
    @Test
    public void invokeBrowser() throws InterruptedException {
        System.out.println("---------before invoke browser ------");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://leafground.com/window.xhtml");
        System.out.println("---------after invoke browser ------");
        driver.manage().window().maximize();
        driver.findElement((By.xpath("//span[text()='Open Multiple']"))).click();
        Thread.sleep(4000);
       // driver.close(); // This is the very basic and a very frequently asked questions in Selenium interview.
        // Almost everyone can recite the differences between quit and close.  But most of us have misunderstood
        // that, the current browser window in the sense which is active and is on focus for the close method.
        // This is not the case. The close method will close the browser which the driver has focus. Unless we
        // switch the focus to the newly opened window, the driver has focused on the old window and the close
        // method will close the old window only not the newly opened one.
        driver.quit();



    }
}
