package Page_Object_Model;

import Reusable_Library.Reusable_Annotations;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SiteSearchResult extends Reusable_Annotations {
    ExtentTest logger;

    public SiteSearchResult (WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger = Reusable_Annotations.logger;
    }//end of constructor class

    @FindBy (xpath = "//*[@id='siteSearchResultTitleLink1']")
    WebElement rootCanal;

}
