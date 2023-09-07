package Dropdown;

import Base.BaseTest;
import org.testng.Assert.*;
import org.testng.annotations.Test;
import pages.DropDownPage;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropDownTest extends BaseTest {

    @Test
    public void testOptionSelection(){
       DropDownPage dropdownPage = homePage.clickDropDownLink();
       String option = "Option 1";
       dropdownPage.SelectOptionFromDropdown(option);
       List<String> selectedOptions = dropdownPage.GetAllSelectedOptions();
       assertEquals(selectedOptions.size(),1,"Incorrect number of Selected Options");
       assertTrue(selectedOptions.contains(option),"The option selected is not the desire");


    }
}
