package org.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class SelectClass {

    @Test
    public void selectClass() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/select.xhtml");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement element = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
        element.click();
        Thread.sleep(2000);

        Select select=new Select(element);
        /*select.selectByVisibleText("Puppeteer");
        Thread.sleep(3000);  */

      //  select.selectByValue(); // <opt==ion value="opt1">Option 1</option>


        //select.selectByIndex(2);  // Selects the third option

        //List<WebElement> selectedOptions = select.getAllSelectedOptions();

        //🔹 7. deselectByIndex, deselectByValue, deselectByVisibleText, deselectAll()


        List<WebElement> element1 = select.getOptions();
        for(WebElement ele:element1)
        {
            System.out.println(ele.getText());
            if(ele.getText().equalsIgnoreCase("Playwright"))
            {
                ele.click();
                Thread.sleep(3000);

            }
        }




        driver.close();

    }
}
