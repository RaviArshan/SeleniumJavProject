package org.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumAlerts {
    WebDriver driver;
    @BeforeTest
    public void invokeBrowser()
    {
        System.out.println("---------before invoke browser ------");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.leafground.com/alert.xhtml");
        System.out.println("---------after invoke browser ------");
        driver.manage().window().maximize();

    }
    @Test
    public void simpleDialogAlert() throws InterruptedException {
     Thread.sleep(2000);
     System.out.println("Thread one "+Thread.currentThread().getId() );
    driver.findElement(By.xpath("(//button/span[text()='Show'])[1]")).click();
    Alert alert = driver.switchTo().alert();
    Thread.sleep(2000);
    Assert.assertEquals(alert.getText(),"I am simple alert.","Alert text is not matching");
    alert.accept();
    Thread.sleep(2000);
    }

    @Test
    public void confirmDialog() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Thread tw0 "+Thread.currentThread().getId() );
        driver.findElement(By.xpath("(//button/span[text()='Show'])[2]")).click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        if(alert.getText().equals("Did you  me?"))
        {
            alert.accept();
        }
        else
        {
            alert.dismiss();
            System.out.println("Clicked dismiss");
        }
    }

    @Test
    public void promptAlert() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Thread three "+Thread.currentThread().getId() );
        Assert.assertEquals(driver.findElement(By.xpath("(//div[@class='card'])[5]/h5")).getText()
        ,"Alert (Prompt Dialog)","Prompt Message not matching");
     driver.findElement(By.xpath("(//button/span[text()='Show'])[5]")).click();
     Thread.sleep(2000);
     Alert alert=driver.switchTo().alert();
     String str="";
        Thread.sleep(2000);
     alert.sendKeys("Hi Welcome");Thread.sleep(2000);
     alert.accept();
     Thread.sleep(3000);
     String expectedString="User entered name as:" +str;
     System.out.println(expectedString);
     Assert.assertEquals(driver.findElement(By.xpath("//span[@id='confirm_result']")),expectedString);
    }

    @AfterTest
    public void closeBrowser()
    {
        driver.close();
    }
}
