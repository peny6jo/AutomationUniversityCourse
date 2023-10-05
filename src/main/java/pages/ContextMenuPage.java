package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class ContextMenuPage {
    private WebDriver driver;
    private By contextMenuBox = By.id("hot-spot");

    public ContextMenuPage(WebDriver driver) {
        this.driver = driver;
    }

    public void RightClickContextMenuBox(){
       Actions action = new Actions(driver);
        WebElement target = driver.findElement(contextMenuBox);
       action.contextClick(target).perform();
    }

    public void AcceptAlert(){
        driver.switchTo().alert().accept();
    }

    public String  GetTextFromAlert(){
        return driver.switchTo().alert().getText();

    }



}
