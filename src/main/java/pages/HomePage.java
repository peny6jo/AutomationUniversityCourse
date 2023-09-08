package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;


public class HomePage {

     private WebDriver driver;
     public HomePage(WebDriver driver){

         this.driver = driver;
     }

     public LoginPage clickFormAuthenticatorLink(){

         clickLink("Form Authentication");
         return new LoginPage(driver);
     }
     public DropDownPage clickDropDownLink(){
         clickLink("Dropdown");
         return new DropDownPage(driver);
     }

     public ForgotPasswordPage clickForgotPasswordLink(){
         clickLink("Forgot Password");
         return new ForgotPasswordPage(driver);
     }
     public HoverPage clickHoversLink(){
         clickLink("Hovers");
         return new HoverPage(driver);
     }

     public KeyPressesPage clickKeyPressesLink(){
         clickLink("Key Presses");
         return new KeyPressesPage(driver);

     }

     private void clickLink( String linkName){
         driver.findElement(By.linkText(linkName)).click();

     }



}
