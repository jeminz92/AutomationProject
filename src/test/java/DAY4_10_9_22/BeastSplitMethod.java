package DAY4_10_9_22;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BeastSplitMethod {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized","incognito");
        WebDriver driver = new ChromeDriver(options);

        driver.get("http://google.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@class='gLFyf']")).sendKeys("Street Fighter 6\n");

        String getThisText = driver.findElement(By.xpath("//*[@class='ssJ7i PZPZlf B5dxMb']")).getText();
        String[] streetFighter = getThisText.split(" ");
        System.out.println(streetFighter[1] + " " + streetFighter[2]);

        Thread.sleep(2000);
        driver.quit();


    }
}
