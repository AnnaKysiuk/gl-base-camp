import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GoogleSearch {
    private WebDriver driver;
    private String baseUrl;

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseUrl = "https://www.google.com";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testGoogleSearch() throws Exception {
        driver.get(baseUrl);
        WebElement findSearch = driver.findElement(By.id("lst-ib"));
        findSearch.sendKeys("Selenium Webdriver");

        WebElement button = driver.findElement(By.xpath("//input[@name='btnK']"));
        button.click();
    }

     @After
     public void tearDawn() throws Exception {
        driver.close();
    }
}
