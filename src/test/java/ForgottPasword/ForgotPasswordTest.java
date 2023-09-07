package ForgottPasword;

import Base.BaseTest;
import org.testng.annotations.Test;
import pages.EmailSentPage;
import pages.ForgotPasswordPage;
import static org.testng.Assert.*;

public class ForgotPasswordTest extends BaseTest {

    @Test
    public void testForgotPasswordButton(){
        ForgotPasswordPage  forgotPasswordPage = homePage.clickForgotPasswordLink();
        forgotPasswordPage.setEmailField("tau@example.com");
        EmailSentPage emailSentPage = forgotPasswordPage.clickSubmitButton();
        String error_text = emailSentPage.getAlertTex();

        assertTrue(error_text.contains("Internal Server Error"));

    }
}
