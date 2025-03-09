package org.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class WriteScriptInAOpenBrowser {

    @Test
    public void chromeOpenBrowser()
    {
        //https://chromedevtools.github.io/devtools-protocol/

        // Go to the chrome Location C:\Program Files\Google\Chrome\Application(right click on chrome and chrom)
        //OPen Command Prompt ->  go to that chrome locations ->
        //chrome.exe --remote-debugging-port=9202 --user-data-dir=C:\chromData

        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.setExperimentalOption("debuggerAddress","localhost:9222");
        WebDriver driver=new ChromeDriver(chromeOptions);
        driver.get("https://chromedevtools.github.io/devtools-protocol/");
    }
}
