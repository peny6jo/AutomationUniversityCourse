package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadedPage {
    private WebDriver driver;
    private By uploadedFiles = By.id("uploaded-files");
    public FileUploadedPage(WebDriver driver) {
        this.driver = driver;
    }

    public String GetUploadedFiles(){
        return driver.findElement(uploadedFiles).getText();

    }
}
