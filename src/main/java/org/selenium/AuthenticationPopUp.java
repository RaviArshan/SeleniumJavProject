package org.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AuthenticationPopUp {
    @Test
    public void authenticationPop() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        Thread.sleep(5000);
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        Thread.sleep(5000);
    }
}
