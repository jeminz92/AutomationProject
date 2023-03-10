package DAY9_10_29_22;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class T2_ImplicitWait {
    public static void main(String[] args) throws InterruptedException {

        //setting up chrome driver
        WebDriverManager.chromedriver().setup();
        //initializing options for Chrome
        ChromeOptions options = new ChromeOptions();
        //adding options to start full screen & incogito
        options.addArguments("Start-maximized", "Incognito");
        //creating instance of web driver with options enabled
        WebDriver driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //navigate to usps home page
        driver.navigate().to("https://www.usps.com");
        Thread.sleep(2000);

        //hover over to Send tab
        WebElement sendTab = driver.findElement(By.xpath("//*[@id='mail-ship-width']"));
        //declare mouse actions
        Actions actions = new Actions(driver);
        //always end with .perform()
        actions.moveToElement(sendTab).perform();

        Thread.sleep(1000);
        //click on calculate a price using mouse click
        WebElement calculatePrice = driver.findElement(By.xpath("//li[@class='tool-calc']"));
        actions.moveToElement(calculatePrice).click().perform();

        Thread.sleep(2000);
        //double click on usps home logo
        WebElement uspsHome = driver.findElement(By.xpath("//*[@alt='USPS.com home']"));
        //right-clicking on usps home logo
        actions.moveToElement(uspsHome).contextClick().perform();
        //double-clicking on usps home logo
        actions.moveToElement(uspsHome).doubleClick().perform();


    }//end of main
}//end of class
