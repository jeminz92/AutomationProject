package QAStudy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class DriverCommands {
    public static void main(String[] args) {
        //setting up driver without chrome options
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // how to find an element        xpath syntax is always //*[@id='practice'] in quotes
        driver.findElement(By.xpath("//*[@id='practice']"));
        // how to click
        driver.findElement(By.xpath("//*[@id='practice']")).click();
        // how to sendKeys (type in search bar or field) the \n mimics the enter button on your keyboard
        driver.findElement(By.xpath("//*[@id='practice']")).sendKeys("UserValue\n");
        // how to submit which is the same as using \n
        driver.findElement(By.xpath("//*[@id='practice']")).submit();
        // how to get text from the element you are inspecting
        driver.findElement(By.xpath("//*[@id='practice']")).getText();
        // in order to print this you would have to put it into a string variable
        String printGetText = driver.findElement(By.xpath("//*[@id='practice']")).getText();
        // then turn it into a print statement
        System.out.println("This is my element " + printGetText);
        // how to verify if a checkbox is selected  isSelected() can also be used
        driver.findElement(By.xpath("//*[@id='practice']")).isSelected();

        driver.navigate().to("http://www.google.com");
        // how to get the title of the webpage you are on
        driver.getTitle();
        // to print out the title you would have to turn it into a string variable and print it
        String actualTitle = driver.getTitle();
        // verifying if your title is equal to your expected title, usually this would be a test case
        String expectedTitle = "Google";
        // how to use boolean to print true or false with getTitle();
        boolean Verify = expectedTitle.equalsIgnoreCase(actualTitle);
        System.out.println(Verify);
        /* setting up implicit wait, this sets a global time up till a maximum of seconds set in the arguments
         where it will wait for the elements to load, sometimes you want to wait for your elements to load because
         everything could be loading so fast and your commands may not work because the elements didn't load in time
         this is similar to using Thread.sleep(); */
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        // explicit wait, only sets delay to find element for given element
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='practice']"))).click();
    }//end of main
}//end of class
