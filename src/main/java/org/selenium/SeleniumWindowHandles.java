package org.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class SeleniumWindowHandles {

    @Test
    public void handlingWindowHandles() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.leafground.com/window.xhtml");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]")).click();
        Thread.sleep(2000);
        String parentWindow= driver.getWindowHandle();  // Storing the parent window
        System.out.println("Parent Window "+parentWindow);

        Set<String>  handles=driver.getWindowHandles();
        handles.remove(parentWindow); // remove the parent window


        Iterator<String> iterator=handles.iterator();
        while (iterator.hasNext()) {
            String  firstWindow=iterator.next();
            System.out.println(driver.switchTo().window(firstWindow).getTitle());  // Swtiching to chi
            System.out.println(driver.switchTo().window(firstWindow).getCurrentUrl());  // Swtiching to chi
            driver.switchTo().window(firstWindow);
        }
        Thread.sleep(4000);
        driver.findElement(By.xpath("//span[normalize-space()='Customer Analytics Table']")).getText();

        Thread.sleep(2000);

        driver.switchTo().defaultContent();

        System.out.println("-------------pparent---------"+driver.getTitle());


    }


}
