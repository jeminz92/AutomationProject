package DAY1_10_1_22.Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class ForLoop  {
    public static void main(String[] args) throws InterruptedException {
            //creating chrome driver
        WebDriverManager.chromedriver().setup();
        //creating options
        ChromeOptions options = new ChromeOptions();
        //adding options arguments
        options.addArguments("start-maximized");
        //creating driver with options
        WebDriver driver = new ChromeDriver(options);

            //creating arraylist with cars
        ArrayList<String> cars = new ArrayList<>();
        cars.add("bmw");
        cars.add("mercedes");
        cars.add("honda");


        //for loop method
        for(int i = 0; i<cars.size(); i++){

            //navigate to google.com
            driver.navigate().to("http://www.google.com");
            //enter keys in search bar
            driver.findElement(By.xpath("//*[@name='q']")).sendKeys(cars.get(i) + "\n");

            //delay
            Thread.sleep(3000);
            //click first link
            driver.findElement(By.xpath("//*[@class='LC20lb MBeuO DKV0Md']")).click();
            //delay
            Thread.sleep(5000);
            //quit
        }//end of for loop
        driver.quit();
    }//end of main method
}//end of class
