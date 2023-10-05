package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploaderPage {
    private WebDriver driver;
    private By chooseFileInput = By.id("file-upload");
    private By uploadButton = By.id("file-submit");
    public FileUploaderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void ChooseFileUpload(String filePath){
        driver.findElement(chooseFileInput).sendKeys(filePath);
    }

    public FileUploadedPage ClickUploadButton(){
        driver.findElement(uploadButton).click();
        return new FileUploadedPage(driver);

    }


}
