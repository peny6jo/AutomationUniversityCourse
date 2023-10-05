package PopsUp;

import Base.BaseTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class FileUploadTest extends BaseTest {

    @Test
    public void TestFileUpload(){
       String file = "C:\\Users\\penel\\Downloads\\Sql interview questions.pdf";
       var uploadPage =  homePage.clickFileUploadLink();
       uploadPage.ChooseFileUpload(file);
       var uploadedFilePage = uploadPage.ClickUploadButton();
       String result = uploadedFilePage.GetUploadedFiles();
       assertEquals(result,"Sql interview questions.pdf" , "Result doesn't match");
    }
}
