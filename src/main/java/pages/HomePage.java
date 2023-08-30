package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;


public class HomePage {

     private WebDriver driver;
     private By formAuthenticatorLink = By.linkText("Form Authentication");

     public HomePage(WebDriver driver){

         this.driver = driver;
     }

     public LoginPage clickFormAuthenticatorLink(){

         driver.findElement(formAuthenticatorLink).click();
         return new LoginPage(driver);
     }



}
