package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {

    private WebDriver driver;
    private By input = By.id("target");
    private By result = By.id("result");

    public KeyPressesPage(WebDriver driver) {
        this.driver  = driver;
    }
    public void pressKey(Keys key){
        driver.findElement(input).sendKeys(key);

    }

    public String retrieveResult(){
        return driver.findElement(result).getText();
    }
}
