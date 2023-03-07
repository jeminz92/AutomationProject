package Page_Object_Model;

import Reusable_Library.ReusableActions_Logger_POM;
import Reusable_Library.Reusable_Annotations;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YouTubePage extends Reusable_Annotations {
    ExtentTest logger;

    public YouTubePage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger = Reusable_Annotations.logger;
    }//end of constructor class

    @FindBy (xpath = "//*[@class='ytd-searchbox']")
    WebElement youtubeSearchBar;
    @FindBy (xpath = "//*[@class='ytd-searchbox']")
    WebElement clickSearchBar;

    public void clickYoutubeSearchBar(){
        ReusableActions_Logger_POM.clickAction(driver,clickSearchBar,logger,"click");
    }//end of method
    public void setYoutubeSearchBar(String userValue){
        ReusableActions_Logger_POM.sendKeysAction(driver,youtubeSearchBar,userValue,logger,"searchKeys");
    }//end of method

}//end of class
