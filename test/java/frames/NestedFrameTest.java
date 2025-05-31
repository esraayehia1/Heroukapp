package frames;

import org.base.BaseTest;
import org.testng.annotations.Test;
import pages.FramesPage;
import pages.NestedFramePage;

import static org.testng.Assert.assertEquals;

public class NestedFrameTest extends BaseTest {
    @Test
    public void testFramesContent(){
        String bottomFrame="frame-bottom";
        String leftFrame="frame-left";
        FramesPage framesp =homePage.clickOnFramesPage();
        NestedFramePage nestedp = framesp.navigatToNestedFramePage();
       String actualBottom= nestedp.getFrameText(bottomFrame);
       assertEquals(actualBottom,"BOTTOM");
       String actualLeft= nestedp.getFrameText(leftFrame);
       assertEquals(actualLeft,"LEFT");


    }
}
