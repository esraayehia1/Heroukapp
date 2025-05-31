package horizontalSlider;

import org.base.BaseTest;
import org.testng.annotations.Test;
import pages.HorizontalSliderPage;

import static org.testng.Assert.assertTrue;

public class HorizontalSliderTest extends BaseTest {
    @Test
    public void clickOnslider(){
        HorizontalSliderPage hpage= homePage.clickHorizontalSlider();
        hpage.dragSlider(4);
        assertTrue(hpage.checkSlider(4));


    }
}
