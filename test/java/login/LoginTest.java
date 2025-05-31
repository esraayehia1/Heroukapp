package login;

import org.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.*;

public class LoginTest extends BaseTest {
    @Test
    public void LoginSuccessful(){
       LoginPage login= homePage.clickFormAuthentication();
       login.setUsername("tomsmith");
       login.setPassword("SuperSecretPassword!");
       SecureAreaPage secureAreaPage=login.clickLoginButton();
       String label= secureAreaPage.getAlertText();
       assertTrue(label.contains("You logged into a secure area!"),"in correct alert at login successful");
    }
}
