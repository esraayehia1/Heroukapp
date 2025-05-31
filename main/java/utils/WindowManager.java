package utils;

import org.openqa.selenium.WebDriver;

public class WindowManager {

    private WebDriver driver;
    // The navigate() method is defined in the WebDriver interface.
    // It returns an object of type WebDriver.Navigation,
   // So we define 'navigate' as WebDriver.Navigation to store that returned object.
    private WebDriver.Navigation navigate;

    public WindowManager(WebDriver driver){
        this.driver = driver;
    navigate = driver.navigate();
}

public void goBack(){
    navigate.back();
}

public void goForward(){
    navigate.forward();
}

public void refreshPage(){
    navigate.refresh();
}

public void goTo(String url){
    navigate.to(url);
}
    public void switchToTab(String tabTitle){
// getWindowHandles(): returns a Set of all currently opened window handles
        var windows = driver.getWindowHandles();

        //System.out.println("Number of tabs: " + windows.size());

        //System.out.println("Window handles:");
        //windows.forEach(System.out::println);
        for(String window : windows){
            //System.out.println("Switching to window: " + window);
            driver.switchTo().window(window);
            //System.out.println("Current window title: " + driver.getTitle());
            if(tabTitle.equals(driver.getTitle())){
                break;
            }
        }
    }
}
