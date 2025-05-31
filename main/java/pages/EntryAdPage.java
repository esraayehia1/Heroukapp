package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EntryAdPage {
    WebDriver driver;
    By closeButton= By.xpath("//p[text()=\"Close\"]");
    By textAtPage= By.xpath("//div/h3[text()=\"Entry Ad\"]");
    public EntryAdPage(WebDriver driver){
        this.driver=driver;
    }
    public void closeModal(){
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(closeButton)).click(); // Wait until it's visible
        FluentWait wait=new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);
       wait.until(ExpectedConditions.visibilityOfElementLocated(closeButton));
               driver.findElement(closeButton).click();


    }
    public  String  validateModalClosed(){
       return driver.findElement(textAtPage).getText();
    }
}
