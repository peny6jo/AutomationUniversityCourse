package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WYSIWYGEditorPage {
    private WebDriver driver;
    private String editorIframeId = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By increaseIndentButton = By.cssSelector("button[aria-label='Increase indent']");


    public WYSIWYGEditorPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clearEditorTextArea(){
        switchToIframeEditor();
        driver.findElement(textArea).clear();
        switchToParent();
    }
    public void setText(String text){
        switchToIframeEditor();
        driver.findElement(textArea).sendKeys(text);
        switchToParent();
    }

    public String getText(){
        switchToIframeEditor();
        String text = driver.findElement(textArea).getText();
        switchToParent();
        return text;
    }
    public void increaseIndent(){
        driver.findElement(increaseIndentButton).click();
    }

    private void switchToIframeEditor(){
        driver.switchTo().frame(editorIframeId);
    }

    private void switchToParent(){
        driver.switchTo().parentFrame();
    }
}
