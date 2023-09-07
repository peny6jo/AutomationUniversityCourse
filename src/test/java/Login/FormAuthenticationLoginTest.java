package Login;
import static  org.testng.Assert.*;

import Base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;
import org.testng.Assert.*;
public class FormAuthenticationLoginTest extends BaseTest {

   @Test
   public void testLogin(){

      LoginPage loginPage = homePage.clickFormAuthenticatorLink();
      loginPage.setUserNameField("tomsmith");
      loginPage.setPasswordField("SuperSecretPassword!");
      SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
      assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"), "Alert Text is not the expected");


   }
}
