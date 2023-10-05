package PopsUp;

import Base.BaseTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;


public class ContextMenuAlertTest extends BaseTest {

    @Test
    public void TestRightClickAlert(){
        var contextMenuPage = homePage.clickContextMenuLink();
        contextMenuPage.RightClickContextMenuBox();
        String alertText = contextMenuPage.GetTextFromAlert();
        contextMenuPage.AcceptAlert();

        assertEquals( alertText, "You selected a context menu","Result doesn't match");

    }
}
