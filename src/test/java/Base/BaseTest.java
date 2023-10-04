package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import pages.LoginPage;
import pages.SecureAreaPage;

import javax.lang.model.element.Element;
import java.util.List;

public class BaseTest {
    private WebDriver driver;
    protected HomePage homePage;
   @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        goToHome();

        homePage =  new HomePage(driver);

    }
    @AfterClass
    public void tearDown(){

       driver.quit();
    }

    @BeforeMethod
    public void goToHome(){
        driver.get("https://the-internet.herokuapp.com/");
    }

//    public void findElementPracticeChapter2(){
//        WebElement shiftLink = driver.findElement(By.linkText("Shifting Content"));
//        shiftLink.click();
//        WebElement menuElement = driver.findElement(By.linkText("Example 1: Menu Element"));
//        menuElement.click();
//        List<WebElement> elements = driver.findElements(By.tagName("li"));
//        System.out.println(elements.size());
//        System.out.println(driver.getTitle());// }
//
//
//}

//    public static void main(String args[]){
//            BaseTest test = new BaseTest();
////            test.setUp();
//
//       }
    }
