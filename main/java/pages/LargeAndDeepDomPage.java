package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LargeAndDeepDomPage {
    private WebDriver driver;
    private By table = By.id("large-table");

    public LargeAndDeepDomPage(WebDriver driver){
        this.driver = driver;
        driver.navigate();
    }
    //that when element already at page not need to scroll to appear elment
    //This causes the browser to scroll the page until the table is visible.
    public void scrollToTable(){
        WebElement tableElement = driver.findElement(table);
        //arguments[0] is a placeholder in JavaScript — it means that the first argument passed to the script will be used as the element to scroll to.
        String script = "arguments[0].scrollIntoView();";
        //his line casts the driver to a JavascriptExecutor, so we can run raw JavaScript
        //Passes the tableElement as the first argument (arguments[0]) to the JavaScript.
        ((JavascriptExecutor)driver).executeScript(script, tableElement);
    }

}
