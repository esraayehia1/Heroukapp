package hover;

import org.base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.HoversPage;
import static org.testng.Assert.*;

public class HoverTests extends BaseTest {

    @Test
    public void testHoverUser1(){

        var hoversPage = homePage.clickHovers();
        var caption = hoversPage.hoverOverFigure(1);

        assertTrue(caption.isCaptionDisplayed(), "Caption not displayed");
        assertEquals(caption.getTitle(), "name: user1", "Caption title incorrect");
        assertEquals(caption.getLinkText(), "View profile", "Caption link text incorrect");
        assertTrue(caption.getLink().endsWith("/users/1"), "Link incorrect");
    }
}