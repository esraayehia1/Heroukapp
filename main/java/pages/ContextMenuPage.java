package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {
    WebDriver driver;
    By box= By.id("hot-spot");
    public ContextMenuPage(WebDriver driver){
        this.driver=driver;
    }
    public void clickOnBox(){
        Actions action=new Actions(driver);
        //using contextClick for press mouse right click.
        //using perform() method--> for execute the action without it no press.
        action.contextClick(driver.findElement(box)).perform();
    }
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }
    public String getAlerText(){
        return driver.switchTo().alert().getText();
    }
}
