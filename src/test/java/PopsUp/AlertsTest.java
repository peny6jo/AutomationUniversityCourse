package PopsUp;

import Base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
public class AlertsTest extends BaseTest {

//    private AlertPage alertPage = homePage.clickAlert();

    @Test
    public void TestAlertSuccessfullyClick(){
        var alertPage = homePage.clickAlertLink();
        alertPage.ClickAlertButton();
        alertPage.AcceptAlert();
        String result = alertPage.GetResult();
        assertEquals(result,"You successfully clicked an alert", "Result doesn't match");

    }
    @Test
    public void TestConfirmAlert(){
        var alertPage = homePage.clickAlertLink();
        alertPage.ClickJSConfirmButton();
        alertPage.AcceptAlert();
        String result = alertPage.GetResult();
        assertEquals(result,"You clicked: Ok", "Result doesn't match");

    }

    @Test
    public void TestDismissAlert(){
        var alertPage = homePage.clickAlertLink();
        alertPage.ClickJSConfirmButton();
        alertPage.DismissAlert();
        String result = alertPage.GetResult();
        assertEquals(result,"You clicked: Cancel", "Result doesn't match");

    }

    @Test
    public void TestPrompt(){
        var alertPage = homePage.clickAlertLink();
        String text= "Hello";
        alertPage.ClickPromptButton();
        alertPage.TypePrompt(text);
        alertPage.AcceptAlert();
        String result = alertPage.GetResult();
        assertEquals(result,"You entered: Hello", "Result doesn't match");

    }


}
