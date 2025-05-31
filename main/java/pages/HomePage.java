package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
   private WebDriver driver;
    public  HomePage( WebDriver driver){
        this.driver=driver;
    }
    public LoginPage clickFormAuthentication(){
        clickOnLink("Form Authentication");
        return new LoginPage(driver);
    }
    public DropDownPage clickDropDown(){
        clickOnLink("Dropdown");
        return new DropDownPage(driver);
    }
    private void clickOnLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();

    }
    public HoversPage clickHovers(){
        clickOnLink("Hovers");
        return new HoversPage(driver);
    }
    public KeyPressesPage clickKeyPresses(){
        clickOnLink("Key Presses");
        return new KeyPressesPage(driver);
    }
    public HorizontalSliderPage clickHorizontalSlider(){
        clickOnLink("Horizontal Slider");
        return new HorizontalSliderPage(driver);
    }
    public AlertPage clickOnAlertPage(){
        clickOnLink("JavaScript Alerts");
        return  new AlertPage(driver);
    }
    public FileUploadPage clickOnFileUploadPage(){
        clickOnLink("File Upload");
        return  new FileUploadPage(driver);
    }

    public EntryAdPage clickOnEntryAdPage(){
        clickOnLink("Entry Ad");
        return  new EntryAdPage(driver);
    }
    public ContextMenuPage clickOnContextMenuPage(){
        clickOnLink("Context Menu");
        return  new ContextMenuPage(driver);
    }

    public WysiwygEditorPage clickOnWYSIWYGEditorPage(){
        clickOnLink("WYSIWYG Editor");
        return  new WysiwygEditorPage(driver);
    }
    public FramesPage clickOnFramesPage(){
        clickOnLink("Frames");
        return  new FramesPage(driver);
    }
    public LargeAndDeepDomPage clickLargeAndDeepDom(){
        clickOnLink("Large & Deep DOM");
        return new LargeAndDeepDomPage(driver);
    }
    public MultipleWindowsPage clickMultipleWindows(){
        clickOnLink("Multiple Windows");
        return new MultipleWindowsPage(driver);
    }
}
