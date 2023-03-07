package PageObjectTest;

import Page_Object_Model.BaseClass;
import Reusable_Library.Reusable_Annotations;
import org.testng.annotations.Test;

public class YoutubePage extends Reusable_Annotations {

    @Test
    public void youtubeSearch() throws InterruptedException {
        driver.navigate().to("http://youtube.com/");
        BaseClass.youTubePage().clickYoutubeSearchBar();
        BaseClass.youTubePage().setYoutubeSearchBar("Street Fighter 6\n");
        Thread.sleep(5000);
    }//end of test

}//end of class
