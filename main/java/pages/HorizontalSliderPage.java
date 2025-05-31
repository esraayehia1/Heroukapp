package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;

public class HorizontalSliderPage {
    WebDriver driver;
    By slider= By.cssSelector("input[type=\"range\"]");
    By rangeNum=By.id("range");
    public HorizontalSliderPage(WebDriver driver){
        this.driver=driver;
    }
    public void  dragSlider(float n){
        while(parseFloat(driver.findElement(rangeNum).getText())!=n){
    driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
    }
    }

    public Boolean checkSlider(float n){
        float ran=parseFloat(driver.findElement(rangeNum).getText());
       return n==ran;

    }

}
