package alerts;

import org.base.BaseTest;
import org.testng.annotations.Test;
import pages.AlertPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class AlertTest extends BaseTest {
    //validate click on ok at first alert
    @Test
    public void confirmAlertTest(){
      AlertPage alertP= homePage.clickOnAlertPage();
      alertP.ClickOnButtonOk();
      alertP.acceptAlert();
      assertTrue(alertP.validateResultMessage().contains("You successfully clicked an alert"),"alert don't work correct");

    }
    //validate click on cancel at second alert
    @Test
    public void cancelAlertTest(){
        AlertPage alertP= homePage.clickOnAlertPage();
        alertP.ClickOnButtonConfirm();
        alertP.dismissAlert();
        assertTrue(alertP.validateResultMessage().contains("Cancel"),"you don't cancel alert");

    }
    //validate enter value at prompt pf third alert
    @Test
    public void sendTextToAlertTest(){
        String text="hello from prompt";
        AlertPage alertP= homePage.clickOnAlertPage();
        alertP.ClickOnButtonPrompt();
        alertP.sendTextToAlertPrompt(text);
        alertP.acceptAlert();
        assertTrue(alertP.validateResultMessage().contains("hello"),"you don't enter any thing at prompt");

    }
    //validate text appear at alerts
    @Test
    public void textAppearAlertTest(){
        String expected="I am a JS Alert";
        AlertPage alertP= homePage.clickOnAlertPage();
        alertP.ClickOnButtonOk();
        String actual= alertP.getTextFromAlert();
        assertEquals(actual,expected);
    }
}
