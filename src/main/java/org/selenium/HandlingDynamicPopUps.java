package org.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HandlingDynamicPopUps {
    WebDriver driver;

    //sol 1
    public void sol1()
    {
        try
        {
            WebDriverWait wait=new WebDriverWait(driver, Duration.ofMillis(200));
            if(wait.until(ExpectedConditions.alertIsPresent())==null)
            {
             System.out.println("alert is not present");
            }
            else {
                driver.switchTo().alert().accept();
            }

        }catch (Exception e)
        {

        }
    }

    public  void sol2()
    {
        try
        {
            Alert al=driver.switchTo().alert();
        }
        catch (NoAlertPresentException ne)
        {
         System.out.println("No alert present");
        }
    }
}
