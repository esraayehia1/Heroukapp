package frames;

import org.base.BaseTest;
import org.testng.annotations.Test;
import pages.WysiwygEditorPage;

import static org.testng.Assert.assertEquals;

public class WysiwygEditorTest extends BaseTest {
    @Test
    public void testFrame(){
        String text="hello from frame";
        WysiwygEditorPage pg=homePage.clickOnWYSIWYGEditorPage();
        pg.clearTextArea();
        pg.enterTextArea(text);
        pg.clickJustifytext();
        assertEquals(pg.getTextOfTextArea(),text," text don't match expected text");
    }
}
