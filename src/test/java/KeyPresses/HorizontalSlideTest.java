package KeyPresses;

import Base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class HorizontalSlideTest extends BaseTest {

    @Test
    public void testMoveSlide(){
       var horizontalSlide =  homePage.clickHorizontalslideLink();
       horizontalSlide.moveSlideToRight("4");
       String text = horizontalSlide.getSlideText();
       assertEquals(text,"4", "The slide doesn't move to the desire number" );

    }


}
