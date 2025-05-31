package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropDownPage {
    WebDriver driver;
    private By dropDown= By.id("dropdown");

    public DropDownPage(WebDriver driver){
        this.driver=driver;
    }
 public void selectOption(String option){
        //Select select=new Select(driver.findElement(dropDown));
     //select.selectByVisibleText(option)
     //replace last line by method which find drop down reterun Select obj
     findDropDown().selectByVisibleText(option);
 }

 /*public  List<WebElement> getOptionsSelected(){
     Select select= findDropDown();
     return select.getAllSelectedOptions();

 }*/
 public  List<String> getOptionsSelected(){
     List<WebElement> selectedElement = findDropDown().getAllSelectedOptions();
     return selectedElement.stream().map(e->e.getText()).collect(Collectors.toList());

 }
    private Select findDropDown(){
        return new Select(driver.findElement(dropDown));
    }
}
/* explain of this code:
1. selectedElement.stream()
This turns the list of WebElements into a stream — a way to process each element one by one.

2. .map(e -> e.getText())
map means: "for each element (e) in the stream, do something to it."

e -> e.getText() means: "take each WebElement (e) and get its text content (like 'Option 1')."

So this changes the stream from WebElements to Strings.

3. .collect(Collectors.toList())
This takes the stream of Strings and collects them into a new list.

So you end up with List<String> like ["Option 1", "Option 2"].
Traditional Way:
public List<String> getOptionsSelected() {
    List<WebElement> selectedElements = findDropDown().getAllSelectedOptions();
    List<String> selectedTexts = new ArrayList<>();

    for (WebElement element : selectedElements) {
        selectedTexts.add(element.getText());
    }

    return selectedTexts;
}

 */