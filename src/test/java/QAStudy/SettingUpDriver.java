package QAStudy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class SettingUpDriver {
    public static void main(String[] args) {

        //if the code is red hover over it and click on import class
        //Calling in chromedriver setup method from selenium
        WebDriverManager.chromedriver().setup();
        //adding options method
        ChromeOptions options = new ChromeOptions();
        //telling /options/ which options you want it to use
        options.addArguments("start-maximized","incognito");
       /*start-maximized: Opens Chrome in maximize mode
        incognito: Opens Chrome in incognito mode
        headless: Opens Chrome in headless mode
        disable-extensions: Disables existing extensions on Chrome browser
        disable-popup-blocking: Disables pop-ups displayed on Chrome browser
        make-default-browser: Makes Chrome default browser
        version: Prints chrome browser version
        disable-infobars: Prevents Chrome from displaying the notification ‘Chrome is being controlled by automated software*/
        WebDriver driver = new ChromeDriver(options);



    }//end of main
}//end of class