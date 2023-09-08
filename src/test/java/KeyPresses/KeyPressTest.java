package KeyPresses;

import Base.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.KeyPressesPage;
import static org.testng.Assert.*;



public class KeyPressTest extends BaseTest {

    @Test
    public void testALTRecognition(){
        KeyPressesPage keyPage = homePage.clickKeyPressesLink();
        keyPage.pressKey(Keys.ALT);

        assertEquals(keyPage.retrieveResult(),"You entered: ALT", "Not recognized the ALT key");
    }


}
