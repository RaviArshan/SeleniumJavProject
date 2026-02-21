package Docker;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumDocker1 {

    @Test
    public void dockerMethod() throws InterruptedException, MalformedURLException {
        /*WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver()*/;
        URL u = new URL("http://localhost:4444/wd/hub");
        DesiredCapabilities  dc = new DesiredCapabilities ();
        dc.setCapability("browserName", "chrome");
        RemoteWebDriver driver = new RemoteWebDriver(u,dc);
        // driver.get("http://host.docker.internal:8080/login");
        driver.get("https://google.com/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        driver.close();
    }
}
