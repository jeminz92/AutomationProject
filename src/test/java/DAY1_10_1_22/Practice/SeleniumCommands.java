package DAY1_10_1_22.Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SeleniumCommands {
    public static void main(String[] args) {



        // how to setup chrome driver from selenium
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments();
        WebDriver driver = new ChromeDriver(options);

        driver.findElement(By.xpath("//*[@id='eyedee']"));

        //using boolean datatype to print figure out if true or false
        //whether the xpath is selected or not
        boolean isSelected = driver.findElement(By.xpath("//*[@id='eyedee']")).isSelected();



        //select method
        WebElement selectMethod = driver.findElement(By.xpath("//*[@id='eyedee']"));
        Select select = new Select(selectMethod);
        select.selectByVisibleText("Example");

        JavascriptExecutor jse = (JavascriptExecutor)driver;

        jse.executeScript("arguments[0].scrollIntoView(True);", selectMethod);

        //implicit wait
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        //explicit wait object
        WebDriverWait wait = new WebDriverWait(driver, 5);
        //giving an element the wait method
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@xpath='xpath']")));







    }
}
