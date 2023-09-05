package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {

    private WebDriver driver;

    private By emailField = By.id("email");
    private By submitButton = By.id("form_submit"); //"#forgot_password button"

    public void setEmailField(String email){
        driver.findElement(emailField).sendKeys(email);

    }
    public void clickSubmitButton(){
        driver.findElement(submitButton).click();
    }

}
