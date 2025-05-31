package fileUpload;

import org.base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class FileUploadTest extends BaseTest {
    @Test
    public void UploadFileTest(){
        String path="E:\\1_ITI\\Intake45\\QA\\workshop\\week3\\Desgin\\Registeration_NegativeSequence.png";
        var filePage=homePage.clickOnFileUploadPage();
        filePage.chooseFile(path);
        filePage.clickUploadFile();
        assertTrue(filePage.checkFileuploaded().contains("Registeration_NegativeSequence"));


    }

}
