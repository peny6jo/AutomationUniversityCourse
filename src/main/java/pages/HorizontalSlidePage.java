package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HorizontalSlidePage {
    private WebDriver driver;
    private By slideInput = By.tagName("input");
    private By slideContainer = new By.ByClassName("sliderContainer");
    private By slideValue = By.id("range");

    private Actions action ;

    public HorizontalSlidePage(WebDriver driver) {
        this.driver = driver;
        action = new Actions(driver);
    }

    public void moveSlideToRight(String steps){
       WebElement slide=  driver.findElement(slideInput);

       while(!getSlideText().equals(steps)){
           slide.sendKeys(Keys.RIGHT);
        }


    }

    public String getSlideText(){
        return driver.findElement(slideValue).getText();
    }





}