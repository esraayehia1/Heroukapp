package keys;

import org.base.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class KeysTests extends BaseTest {

    @Test
    public void testBackspace(){
        var keyPage = homePage.clickKeyPresses();
        //Keys--> selenium class for using any button
        keyPage.enterText("A" + Keys.BACK_SPACE);

    }
    @Test
    public void testPi(){
        var keyPage = homePage.clickKeyPresses();
        keyPage.enterPi();
    }

}