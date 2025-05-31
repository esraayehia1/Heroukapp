package javaScript;

import org.base.BaseTest;
import org.testng.annotations.*;

public class JavaScriptTests extends BaseTest {
    @Test
    public void testScrollToTable(){
        homePage.clickLargeAndDeepDom().scrollToTable();
    }
}
