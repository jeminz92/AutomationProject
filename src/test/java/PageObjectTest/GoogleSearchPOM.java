package PageObjectTest;

import Page_Object_Model.BaseClass;
import Reusable_Library.Reusable_Annotations;
import org.testng.annotations.Test;

public class GoogleSearchPOM extends Reusable_Annotations {

    @Test
    public void SearchForBMW(){
        driver.navigate().to("https://www.google.com");
        BaseClass.homePage().searchAkeyword("BMW");
        BaseClass.homePage().submitOnGoogleSearch();
        BaseClass.searchResults().getSearchNumber();

    }//end of test

    @Test
    public void clickonAboutAndStore(){
        //click on about
        driver.navigate().to("https://www.google.com");
        BaseClass.homePage().clickOnAboutOrStore(0);

        //click on store
        driver.navigate().to("https://www.google.com");
        BaseClass.homePage().clickOnAboutOrStore(1);

    }//end of test


}//end of class



