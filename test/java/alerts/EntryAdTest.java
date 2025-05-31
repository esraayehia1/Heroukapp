package alerts;

import org.base.BaseTest;
import org.testng.annotations.Test;
import pages.EntryAdPage;

import static org.testng.Assert.assertTrue;

public class EntryAdTest extends BaseTest {
    @Test
    public void closeModalTest() {
        EntryAdPage entrypage = homePage.clickOnEntryAdPage();
        entrypage.closeModal();
        assertTrue(entrypage.validateModalClosed().contains("Entry Ad"));


    }
}
