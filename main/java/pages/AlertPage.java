package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPage {
    WebDriver driver;
    By alertButtonOk= By.xpath(".//button[text()=\"Click for JS Alert\"]");
    By alertButtonConfirm=By.xpath(".//button[text()=\"Click for JS Confirm\"]");
    By alertButtonPrompt=By.xpath(".//button[text()=\"Click for JS Prompt\"]");
    By result=By.id("result");
    public AlertPage(WebDriver driver){
        this.driver=driver;
    }
    public void ClickOnButtonOk()
    {
        driver.findElement(alertButtonOk).click();
    }
    public void ClickOnButtonConfirm()
    {
        driver.findElement(alertButtonConfirm).click();
    }
    public void ClickOnButtonPrompt()
    {
        driver.findElement(alertButtonPrompt).click();
    }
    //alerts handel
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }
    public void dismissAlert(){
        driver.switchTo().alert().dismiss();
    }
    public String getTextFromAlert(){
       return driver.switchTo().alert().getText();
    }
    public void sendTextToAlertPrompt(String text){
         driver.switchTo().alert().sendKeys(text);
    }
    //At DOM page: validate success of clicking on alert
    public String validateResultMessage()
    {
        return driver.findElement(result).getText();
    }

}
