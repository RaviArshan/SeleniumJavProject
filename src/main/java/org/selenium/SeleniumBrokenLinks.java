package org.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

public class SeleniumBrokenLinks {

    @Test
    public void brokenLinks() throws InterruptedException, IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://in3.seatseller.travel/ssui/loginpage/");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        List<WebElement> links= driver.findElements(By.tagName("a"));
        System.out.println("Total Links "+links.size());
        List<String> list=new ArrayList<>();

        for(WebElement ele:links)  // Get the links and add all the in the list
        {
         String url=ele.getAttribute("href");
         System.out.println("URL "+url);
         list.add(url);
         checkBrokenLink(url);
        }

    }
    public static void checkBrokenLink(String brokenLink) throws IOException {
        URL url=new URL(brokenLink);
        //URLConnection -  We dont have the getResponseCode so we need to use HttpURLConnection
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(5000);
        httpURLConnection.connect();

        if(httpURLConnection.getResponseCode() >=400)
        {
            System.out.println("broken "+httpURLConnection.getResponseMessage());
        }
        else
        {
            System.out.println("Url "+httpURLConnection.getResponseMessage());
        }

    }

}
