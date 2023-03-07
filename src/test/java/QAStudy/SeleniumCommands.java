package QAStudy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class SeleniumCommands {
    public static void main(String[] args) {

        //Setting up a WebDriver with Options (Options meaning how you want Chrome to run when you run your test)
       // WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized","incognito");
      //  WebDriver driver = new ChromeDriver(options);
/*
        //How to navigate to the website you are testing
        driver.navigate().to("http://google.com");
        //How to get element from website
        driver.findElement(By.xpath("//*[@id='myId']"));
        //How to find element and give it a function to do
        //clicks on element
        driver.findElement(By.xpath("//*[@id='myId']")).click();
        //sends keys on element usually search bar
        driver.findElement(By.xpath("//*[@id='myId']")).sendKeys("Keys");
        //So what you see here you are sending keys followed by \n <--- this mimics you pressing enter on your keyboard
        driver.findElement(By.xpath("//*[@id='myId']")).sendKeys("Keys \n");
        //similar to putting \n in your String argument for sendKeys method
        driver.findElement(By.xpath("//*[@id='myId']")).submit();
        //gets the text for the element
        driver.findElement(By.xpath("//*[@id='myId']")).getText();
        //if you wanted to get the text you would have to store it into a string variable so you can print it out, like this
        String printElement = driver.findElement(By.xpath("//*[@id='myId']")).getText();
        System.out.println(printElement);
        //how to get title of the webPage that you are viewing
        driver.getTitle();
        //if you needed to verify the websites title
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();
        Assert.assertEquals("Prints True",actualTitle,expectedTitle);
            */

    }
}
