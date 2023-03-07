package Page_Object_Model;

import Reusable_Library.ReusableActions_Logger_POM;
import Reusable_Library.Reusable_Annotations;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends Reusable_Annotations {
    ExtentTest logger;
    public HomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger = Reusable_Annotations.logger;
    }//end of constructor class

    //define all the web elements you need for your test from this page
    //each of the web element needs its own find by annotation
    @FindBy(xpath = "//*[@name='q']")
    WebElement searchField;
    @FindBy(xpath = "//*[@name='btnK']")
    WebElement googleSearchButton;
    @FindBy(xpath = "//*[@name='btgK']")
    List<WebElement> links;

    //create a method of searching a keyword
    public void searchAkeyword(String userValue){
        ReusableActions_Logger_POM.sendKeysAction(driver,searchField,userValue,logger,"Search Field");
    }//end of method

    //create a method for submitting the keyword
    public void submitOnGoogleSearch(){
        ReusableActions_Logger_POM.submitAction(driver,googleSearchButton,logger,"Google Search Button");
    }//end of submitOnGoogleSearch method
    public void clickOnAboutOrStore(int index){
        ReusableActions_Logger_POM.clickAction(driver,links.get(index),logger,"link");

    }//end of clickOnAboutOrStore method


}//end of class
