package QAStudy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreatingWebElements {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        /*Creating a WebElement is like reusable code, instead of doing the driver.findElement syntax over and over
        again you can just put it into a WebElement, you basically store an Element into a variable*/
        //this is the tedious way
        driver.findElement(By.xpath("//*[@id='practice']"));
        //but with WebElement you can...
        WebElement soMuchEasier = driver.findElement(By.xpath("//*[@id='practice']"));
        //and you can do the same things you can with driver.findElement()
        soMuchEasier.click();
        soMuchEasier.submit();
        soMuchEasier.sendKeys("UserValue");
        soMuchEasier.isSelected();
        soMuchEasier.isDisplayed();
        soMuchEasier.getText();
        //type in soMuchEasier and the period, it will show you all the methods available to use on the variable

    }//end of main
}//end of class
