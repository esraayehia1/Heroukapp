package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
   private WebDriver driver;
   private By usernameField= By.id("username");
    private By passwordField= By.id("password");
    private By loginButton= By.cssSelector("button[type=\"submit\"]");


    public LoginPage(WebDriver driver){
        this.driver=driver;
    }
    public void setUsername(String username){
        driver.findElement(usernameField).sendKeys(username);
    }
    public void setPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }
    public SecureAreaPage clickLoginButton(){
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver);
    }

}
