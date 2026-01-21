package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseTest {

    private WebDriver driver;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        //driver.manage().window().maximize();

        //List<WebElement> Links = driver.findElements(By.tagName("a"));
        //System.out.println(Links.size());

        //WebElement inputsLink = driver.findElement (By.linkText("Inputs"));
        //inputsLink.click();

        WebElement inputsLink = driver.findElement (By.linkText("Shifting Content"));
        inputsLink.click();

        WebElement inputsLink1 = driver.findElement (By.linkText("Example 1: Menu Element"));
        inputsLink1.click();

        List<WebElement> Links = driver.findElements(By.tagName("li"));
        System.out.println(Links.size());

        System.out.println(driver.getTitle());
        //driver.quit();
    }
    public static void main(String args[]){
        BaseTest test = new BaseTest();
        test.setUp();
    }
}
