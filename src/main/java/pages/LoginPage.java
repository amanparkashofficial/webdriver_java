package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private static WebDriver driver;
    private static By usernameField = By.id("username");
    private static By passwordField = By.id("password");
    private By loginButton = By.cssSelector("#login button");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public static void setUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }
    public static void setPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }
    public SecureAreaPage clickLoginButton() {
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver);
    }
}
