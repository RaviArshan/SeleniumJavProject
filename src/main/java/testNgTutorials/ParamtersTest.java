package testNgTutorials;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamtersTest
{
    @Test
    @Parameters({"browserName","url"})  // The same name should be used in the testng.xml file
    public void invokeChromBrowser(String browser,String url) throws InterruptedException {
        if(browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get(url);
            Thread.sleep(5000);
        }
        else
        if(browser.equalsIgnoreCase("mozile")) {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new FirefoxDriver();
            driver.get(url);
            Thread.sleep(5000);
        }


    }
}
