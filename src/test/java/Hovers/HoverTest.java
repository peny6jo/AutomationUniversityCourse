package Hovers;

import Base.BaseTest;
import org.testng.annotations.Test;
import pages.HoverPage;
import static org.testng.Assert.*;

public class HoverTest extends BaseTest {


    @Test
    public void testHover1(){
        HoverPage hoverPage = homePage.clickHoversLink();
        HoverPage.FigureCaption figureCaption = hoverPage.hoverOverFigure(1);

        assertTrue(figureCaption.isDisplay(),"Caption is not Displayed");

        assertEquals(figureCaption.getText(),"name: user1", "Text not expected");

        assertEquals(figureCaption.getLinkName(),"View profile", "link not expected");

        assertTrue(figureCaption.getLink().endsWith("/users/1"),"Invalid Link");

    }




}
