import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.HashMap;
import java.util.Map;

public class DisablePopUp {
    public static void main(String[] args) {
        // Set Chrome preferences
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("profile.default_content_settings.popups", 0); // Block pop-ups

        // Set ChromeOptions
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);

        // Launch Chrome with pop-up blocking
        WebDriver driver = new ChromeDriver(options);

        // Open a website for testing
        driver.get("https://www.example.com");

        // Perform actions...
        System.out.println("Pop-ups are blocked!");

        // Close browser
        driver.quit();
    }
}