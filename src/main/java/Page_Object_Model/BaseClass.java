package Page_Object_Model;

import Reusable_Library.Reusable_Annotations;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseClass extends Reusable_Annotations {

    public BaseClass(WebDriver driver){
        PageFactory.initElements(driver,this);
    }//end of constructor class

    //create static reference for google home page
    public static HomePage homePage() {
        HomePage homePage = new HomePage(driver);
        return homePage;
    }//end of googleHomePage method

    public static SearchResults searchResults(){
        SearchResults searchResults = new SearchResults(driver);
        return searchResults;
    }//end of SearchResults method

    public static DeltaHomePage deltaHomePage(){
        DeltaHomePage deltaHomepage = new DeltaHomePage(driver);
        return deltaHomepage;
    }//end of deltaHomepage method

    public static YouTubePage youTubePage(){
        YouTubePage youTubePage = new YouTubePage(driver);
        return youTubePage;
    }//end of youTubePage return

    public static SiteSearchResult siteSearchResult(){
        SiteSearchResult siteSearchResult = new SiteSearchResult(driver);
        return siteSearchResult;
    }
    }//end of class


