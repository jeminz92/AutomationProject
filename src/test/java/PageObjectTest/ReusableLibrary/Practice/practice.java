package PageObjectTest.ReusableLibrary.Practice;

import java.util.ArrayList;

public class practice {
    public static void main(String[] args) {

       // WebDriverManager.chromedriver().setup();
       // ChromeOptions options = new ChromeOptions();
         //       options.addArguments("maximized","incognito");
           //     WebDriver driver = new ChromeDriver(options);

              //  WebElement Practice.practice = driver.findElement(By.xpath("//*[@Practice.practice='Practice.practice']"));

               // Practice.practice.click();
               // Practice.practice.clear();
               // Practice.practice.getText();

               // String StringEX = driver.findElement(By.xpath("//*[@Practice.practice='Practice.practice']")).getText();
       // System.out.println("My String is: " + StringEX);

        ArrayList<String> cars = new ArrayList<>();
        cars.add("cars");

        ArrayList<String> cities = new ArrayList<>();
        cities.add("queens");
        cities.add("brooklyn");
        cities.add("manhattan");

        for(int i = 0; i < cities.size(); i++) {
            System.out.println("My Cities are: " + cities.get(0)+ " " + cities.get(1));
        }//end of loop






    }
}