package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramePage {
    WebDriver driver;
    private String topFrame = "frame-top";
    By frameBody=By.tagName("body");
    public NestedFramePage(WebDriver driver){
        this.driver=driver;
    }
    private void switchToFrame(String frameName) {
        // For left, middle, and right — first switch to "frame-top"
        if (frameName.contains("frame-left") || frameName.contains("frame-middle") || frameName.contains("frame-right"))
        {
            driver.switchTo().frame(topFrame);
        }
        driver.switchTo().frame(frameName);
    }
    private void excitFromframe()
    {
        driver.switchTo().defaultContent();
    }
    public String getFrameText(String frameName){
        switchToFrame(frameName);
        String text=driver.findElement(frameBody).getText();
        excitFromframe();
        return text;
    }
}
