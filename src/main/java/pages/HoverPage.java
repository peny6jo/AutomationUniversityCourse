package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.List;

public class HoverPage {

    private WebDriver driver;
    private By figureBox = By.className("figure");
    private  By figureCaption = By.className("figcaption");

    public HoverPage(WebDriver driver){
        this.driver = driver;

    }

    /**
     *
     * @param index: starts at 1
     */
    public FigureCaption hoverOverFigure(int index){
        Actions actions = new Actions(driver);
        List<WebElement> allFigures = driver.findElements(figureBox);
        WebElement figure = allFigures.get(index-1);
        actions.moveToElement(figure).perform();
        return new FigureCaption(figure.findElement(figureCaption));
    }


    public class FigureCaption{
        private WebElement caption;
        private By name =  By.tagName("h5");
        private By link = By.tagName("a");
        public FigureCaption(WebElement caption){
            this.caption = caption;

        }

        public boolean isDisplay(){
            return caption.isDisplayed();
        }
        public String getText(){
           return caption.findElement(name).getText();

        }

        public String getLinkName(){
            return caption.findElement(link).getText();
        }

        public String getLink(){
            return caption.findElement(link).getAttribute("href");
        }


    }

}
