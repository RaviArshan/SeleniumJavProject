package Docker;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumDocker {

    @Test
    public void dockerMethod() throws InterruptedException, MalformedURLException {
        /*WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver()*/;
        URL u = new URL("http://localhost:4444/wd/hub");
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("browserName", Browser.CHROME);
        RemoteWebDriver driver = new RemoteWebDriver(u,dc);
        driver.get("http://host.docker.internal:8080/login");
       // driver.get("https://qamain1.seatseller.travel/ssui/NewLoginPage-iFrm");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        driver.close();
    }
}
