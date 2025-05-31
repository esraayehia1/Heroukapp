package contextMenu;

import org.base.BaseTest;
import org.testng.annotations.Test;
import pages.ContextMenuPage;

import static org.testng.Assert.assertEquals;

public class ContextMenuTest extends BaseTest {
    @Test
    public void test(){
        ContextMenuPage contextp=homePage.clickOnContextMenuPage();
        contextp.clickOnBox();
        assertEquals(contextp.getAlerText(),"You selected a context menu","alert message not as expected");
        contextp.acceptAlert();
    }
}
