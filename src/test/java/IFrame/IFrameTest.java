package IFrame;

import Base.BaseTest;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class IFrameTest extends BaseTest {
    @Test
    public void testWYSIWYGEditor(){
       var pageEditor =  homePage.clickWYSIWYGLink();
       String text1 = "Hello ";
       String text2 = "world";

       pageEditor.clearEditorTextArea();
       pageEditor.setText(text1);
       pageEditor.increaseIndent();
       pageEditor.setText(text2);


       assertEquals(pageEditor.getText(),text1+text2,"result doesn't match");

    }
}
