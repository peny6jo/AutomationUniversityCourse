package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPage {

    WebDriver driver;
    private By triggerJSAlertButton = By.xpath(".//button[text()='Click for JS Alert']");
    private By triggerJSConfirmButton = By.xpath(".//button[text()='Click for JS Confirm']");

    private By triggerPromptButton = By.xpath(".//button[text()='Click for JS Prompt']");
    private By resultOutput = By.id("result");


    public AlertPage(WebDriver driver) {
        this.driver= driver;
    }

    public void ClickAlertButton(){
        driver.findElement(triggerJSAlertButton).click();
    }
    public  void ClickJSConfirmButton(){
        driver.findElement(triggerJSConfirmButton).click();
    }
    public void ClickPromptButton(){
        driver.findElement(triggerPromptButton).click();
    }
    public void AcceptAlert(){
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    public void DismissAlert(){
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }

    public void TypePrompt(String text){
        Alert alert = driver.switchTo().alert();
        alert.sendKeys(text);
    }

    public String GetResult(){
        return driver.findElement(resultOutput).getText();
    }


}
