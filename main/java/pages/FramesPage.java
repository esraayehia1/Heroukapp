package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage {
    WebDriver driver;
    By nestedFramePageLink=By.linkText("Nested Frames");
    By iFramePageLink=By.linkText("iFrame");

    private String frameTextId = "mce_0_ifr";

    public FramesPage(WebDriver driver){
        this.driver=driver;
    }
    public NestedFramePage navigatToNestedFramePage(){
       driver.findElement(nestedFramePageLink).click();
        return new NestedFramePage(driver);
    }
    public IFramePage navigatToiFramePage(){
        driver.findElement(iFramePageLink).click();
        return new IFramePage(driver);
    }

}
