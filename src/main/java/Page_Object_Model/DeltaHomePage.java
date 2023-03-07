package Page_Object_Model;

import Reusable_Library.ReusableActions_Logger_POM;
import Reusable_Library.Reusable_Annotations;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeltaHomePage extends Reusable_Annotations {
    ExtentTest logger;

    public DeltaHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = Reusable_Annotations.logger;

    }//end of constructor class

    @FindBy(xpath = "//*[@name='q']")
    WebElement searchBar;
    @FindBy(xpath = "//*[@aria-label='Submit Search']")
    WebElement submitSearch;

    public void searchAKeyword(String userValue) {
        ReusableActions_Logger_POM.sendKeysAction(driver, searchBar, userValue, logger, "searchingDentist");
    }//end of searchAKeyword method
    public void setSubmitSearch(){
        ReusableActions_Logger_POM.submitAction(driver,submitSearch,logger,"submit");
    }//end of submit search method

}//end of class
