package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropDownPage {
 private WebDriver driver;
 private By dropdown = By.id("dropdown");
    public DropDownPage(WebDriver driver){
        this.driver = driver;

    }

    public void SelectOptionFromDropdown( String option){
        Select dropdownElement =  FindDropdownElement();
        dropdownElement.selectByVisibleText(option);
    }

    public List<String> GetAllSelectedOptions(){
        Select dropdownElement = FindDropdownElement();
        List<WebElement> selectedOptions = dropdownElement.getAllSelectedOptions();
        return selectedOptions.stream().map(e->e.getText()).collect(Collectors.toList()); //create a list with the strings in the text of each option.

    }

    private Select FindDropdownElement(){
        return new Select(driver.findElement(dropdown));
    }
}
