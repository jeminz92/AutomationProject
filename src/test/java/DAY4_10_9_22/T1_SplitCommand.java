package DAY4_10_9_22;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T1_SplitCommand {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized","incognito");
        WebDriver driver = new ChromeDriver(options);

        //declare a string variable
        String message = "Hello good morning my fellow people";
        //extract out John by using String array
        String[] splitMessage = message.split(" ");
        System.out.println(splitMessage[2]);

        //extracting each character from a string
        String message2 = "abc";
        String [] splitMessage2 = message2.split("");
        System.out.println("Index 3 is: " + splitMessage2[1]);

        String stringEx = "hello world";
        String[] splitThis = stringEx.split(" ");

        String printThisOut = driver.findElement(By.xpath("//*[@class='ssJ7i PZPZlf B5dxMb']")).getText();


        System.out.println(printThisOut);


    }
}
