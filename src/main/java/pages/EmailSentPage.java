package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EmailSentPage {
    private WebDriver driver;


    public EmailSentPage(WebDriver driver){
        this.driver = driver;

    }

    public String getAlertTex(){
       //return the text in the page
       WebElement error_text =  driver.findElement(By.cssSelector("h1"));
       return error_text.getText();


    }

}
