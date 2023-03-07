package QAStudy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumMethods {
    public static WebDriver SeleniumDriver(){


        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("maximized","incognito");
        WebDriver driver = new ChromeDriver(options);
        return driver;




    }
}
