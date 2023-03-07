package PageObjectTest;

import Page_Object_Model.BaseClass;
import Reusable_Library.Reusable_Annotations;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class deltaDentalNavigate extends Reusable_Annotations {

    @Test
    public void enterDentistAndSubmit() throws InterruptedException {
        driver.navigate().to("http://deltadental.com");
        BaseClass.deltaHomePage().searchAKeyword("Dentist");
        BaseClass.deltaHomePage().setSubmitSearch();
        Thread.sleep(5000);

        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

        WebDriverWait wait = new WebDriverWait(driver,20);

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='id']")));

        // "//*[@id='id']"  //*[text()='Text here'] //*[contains



    }//end of test


}//end of class
