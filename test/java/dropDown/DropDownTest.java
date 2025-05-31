package dropDown;

import org.base.BaseTest;
import org.testng.annotations.Test;
import pages.DropDownPage;

import java.util.List;

import static org.testng.Assert.*;

public class DropDownTest extends BaseTest {

    @Test
    public void selectOptionOne(){
        String option="Option 1";
        DropDownPage dropDown=homePage.clickDropDown();
      dropDown.selectOption(option);
        //String actualSelectedOption=dropDown.getOptionSelected();
       // assertTrue(actualSelectedOption.contains(option),"incorrect selected option");
        //List < WebElement> options =dropDown.getOptionsSelected();
        //assertEquals(options.size(),1);
        //tre2a deh s7 bs hage hna msh h3raf ageb el text 3shan kda h3ml lamba
        //assertTrue(options.contains(option));
        List<String> selectOptions=dropDown.getOptionsSelected();
        //var selectOptions=dropDown.getOptionsSelected();
        assertEquals(selectOptions.size(),1,"select more thn one option");
        assertTrue(selectOptions.contains(option));


    }

}
