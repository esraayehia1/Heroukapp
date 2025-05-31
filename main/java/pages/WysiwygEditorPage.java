package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WysiwygEditorPage {
    WebDriver driver;
    private String frameTextId = "mce_0_ifr";

    WebElement frameTextArea=driver.findElement(By.id("tinymce"));
    By justifyButton=By.cssSelector("button[title=\"Justify\"]");
    public WysiwygEditorPage(WebDriver driver){
        this.driver=driver;
    }
 private void switchToFrame(){
     driver.switchTo().frame(frameTextId);

 }
    private void exitFromFrame(){
   driver.switchTo().parentFrame();
    }
    public void clearTextArea(){
        switchToFrame();
        frameTextArea.clear();
        frameTextArea.sendKeys(Keys.DELETE);
        exitFromFrame();
    }
    public void enterTextArea(String text){
        switchToFrame();
        frameTextArea.sendKeys(text);
        exitFromFrame();
    }
    public void clickJustifytext(){
        driver.findElement(justifyButton).click();
    }
    public  String getTextOfTextArea(){
        switchToFrame();
        String text=frameTextArea.getText();
        exitFromFrame();
        return text;
    }
}
