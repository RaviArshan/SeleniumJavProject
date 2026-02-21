package testNgTutorials;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

    @Test(dataProvider = "dataProviderMethod")
    public void invokeChromBrowser(String browser,String url) throws InterruptedException {
        if(browser.equalsIgnoreCase("chrome")) {
            System.out.println("This is Chrome");
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get(url);
            Thread.sleep(5000);
        }
        else
        if(browser.equalsIgnoreCase("mozila")) {
            System.out.println("This is Mozila");
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new FirefoxDriver();
            driver.get(url);
            Thread.sleep(5000);
        }
    }

    @DataProvider(name = "dataProviderMethod")
    public Object[][] dataProviderToTest()
    {
       return new  Object[][] {{"chrome","https://www.google.com/"},{"mozila","https://www.gmail.com/"}};

    }

}
