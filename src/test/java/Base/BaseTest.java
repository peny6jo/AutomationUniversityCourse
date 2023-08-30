package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

import javax.lang.model.element.Element;
import java.util.List;

public class BaseTest {
    private WebDriver driver;
    protected HomePage homePage;
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        homePage =  new HomePage(driver);

    }

    public void tearDown(){
        driver.quit();
    }

    public void findElementPracticeChapter2(){
        WebElement shiftLink = driver.findElement(By.linkText("Shifting Content"));
        shiftLink.click();
        WebElement menuElement = driver.findElement(By.linkText("Example 1: Menu Element"));
        menuElement.click();
        List<WebElement> elements = driver.findElements(By.tagName("li"));
        System.out.println(elements.size());
//        System.out.println(driver.getTitle());

    }

    public static void main(String[] args){
        BaseTest base = new BaseTest();
        base.setUp();
        //base.findElementPracticeChapter2();



    }
}
