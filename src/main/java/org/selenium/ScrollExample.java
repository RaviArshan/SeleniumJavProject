package org.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollExample {

    @Test
    public void scroll() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://in3.seatseller.travel/ssui/loginpage/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        JavascriptExecutor executor=(JavascriptExecutor) driver;
       /* executor.executeScript("window.scroll(0,1000)","");  // scroll down
        Thread.sleep(3000);
        executor.executeScript("window.scroll(0,-1000)",""); // scroll up
        Thread.sleep(3000);
        executor.executeScript("window.scroll(0,document.body.scrollHeight)",""); //scroll to bottom
        Thread.sleep(3000);
        executor.executeScript("window.scroll(0,0)",""); //scroll to top
        Thread.sleep(3000);   */
        //scroll to specific element
        Thread.sleep(3000);
        WebElement ele=driver.findElement(By.xpath("//a[@class='how_work']"));
        executor.executeScript("arguments[0].scrollIntoView(true)",ele);
        Thread.sleep(3000);



        driver.quit();

    }
}
