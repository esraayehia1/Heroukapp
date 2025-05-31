package org.base;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;
import org.testng.ITestResult;
import org.testng.annotations.*;
import pages.HomePage;
import utils.EventReporter;
import utils.WindowManager;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    private WebDriver driver;
    protected HomePage homePage;
    @BeforeClass
    public  void setup(){
        WebDriver originalDriver = new ChromeDriver(getChromeOptions());
        WebDriverListener listener = new EventReporter();  // implement this interface
        driver = new EventFiringDecorator(listener).decorate(originalDriver);
        //implicit wait--> will wait 30 sec before every find element , if element appear before 30 sec complete it will interact with it, if not find element until 30 sec ended will throw no such element exception
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        goHomePage();
        setCookie();
        driver.manage().window().maximize();
        //run at size of iphone for example
       // driver.manage().window().setSize(new Dimension(375,812));
        homePage=new HomePage(driver);

    }
    @BeforeMethod
    public void goHomePage(){
        driver.get("https://the-internet.herokuapp.com/");
    }

@AfterClass
    public void TearDown(){
    driver.quit();

}
//Taking screen shot
@AfterMethod
/*public void takeScreenshot(){

    var camera = (TakesScreenshot)driver;
    File screenshot = camera.getScreenshotAs(OutputType.FILE);

    try{
        Files.move(screenshot, new File("resources/screenshots/test.png"));
    }catch(IOException e){
        e.printStackTrace();
    }
}*/
public void recordFailure(ITestResult result) {
    if (ITestResult.FAILURE == result.getStatus()) {
        var camera = (TakesScreenshot) driver;
        File screenshot = camera.getScreenshotAs(OutputType.FILE);

        try {
            Files.move(
                    screenshot.toPath(),
                    new File("resources/screenshots/" + result.getName() + ".png").toPath()
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

//general method not related to after annotation: when call it use for giving handel to window manager
    public WindowManager getWindowManager(){
        return new WindowManager(driver);
    }
//private method for chrom options
    //ChromeOptions class at selenium can manage by it chrome options
private ChromeOptions getChromeOptions(){
    ChromeOptions options = new ChromeOptions();
    //this argument Removes the automation notification from the browser
    options.addArguments("disable-infobars");
    //it'll run our tests without actually opening our browser up.
    //options.setHeadless(true); /at new version
    options.addArguments("--headless");
    return options;
}
    private void setCookie(){
        Cookie cookie = new Cookie.Builder("tau", "123")
                .domain("the-internet.herokuapp.com")
                .build();
        driver.manage().addCookie(cookie);
    }
}
