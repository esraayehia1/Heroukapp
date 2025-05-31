package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    WebDriver driver;
    By chooseFileButton= By.id("file-upload");
    By uploadButton=By.id("file-submit");
    By sucessUpload=By.id("uploaded-files");
    public FileUploadPage(WebDriver driver)
    {this.driver=driver;
    }
    public void chooseFile(String filePath)
    {
        driver.findElement(chooseFileButton).sendKeys(filePath);
    }
    public void clickUploadFile(){
        driver.findElement(uploadButton).click();

    }
    public  String  checkFileuploaded(){
        return driver.findElement(sucessUpload).getText();
    }

}
