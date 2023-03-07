package Page_Object_Model;

import Reusable_Library.ReusableActions_Logger_POM;
import Reusable_Library.Reusable_Annotations;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResults extends Reusable_Annotations {
    ExtentTest logger;
    public SearchResults(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger = Reusable_Annotations.logger;
    }//end of constructor class

    @FindBy(xpath = "//*[@id='resul-stats']")
    WebElement searchResultElement;
    public void getSearchNumber(){
        String results = ReusableActions_Logger_POM.getTextAction(driver, searchResultElement,logger,"searchResultElement");
        String[] arrayResult = results.split("");
        logger.log(LogStatus.INFO, "Search Number is " + arrayResult[1]);
        System.out.println("Search Number is " + arrayResult[1]);
    }//end of getSearchNumber method
}//end of class
