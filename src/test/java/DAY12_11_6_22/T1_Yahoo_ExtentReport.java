package DAY12_11_6_22;

import PageObjectTest.ReusableLibrary.ReusableActions;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class T1_Yahoo_ExtentReport {
    WebDriver driver;
    ExtentReports reports;
    ExtentTest logger;

    @BeforeSuite
    public void SetChromeDriver() {
        driver = ReusableActions.setUpDriver();
        reports = new ExtentReports("src/main/java/HTML_Report/Automation_Report");
    }//end of set driver method


    @AfterSuite
    public void quitTheSession() {
        driver.quit();
        reports.flush(); // writing the logs back to the report
    }//end of after suite


    @Test(priority = 1)
    public void tc001_verifySignedInOptionIsChecked() throws InterruptedException {
        //set the name of the test case to the report by using logger concept
        logger = reports.startTest("tc001_verifySignedInOptionIsChecked");

        //first navigate to yahoo homepage
        driver.navigate().to("https://www.yahoo.com");
            //next we need to click on sign in button
                Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@class = '_yb_1933e']")).click();
        logger.log(LogStatus.PASS, "Successfully clicked on Sign in button");

        //we need to verify that signed in option is checked
        boolean isSignInChecked = driver.findElement(By.xpath("//*[@id= 'persistent']")).isSelected();
        System.out.println("The checkbox check condition is: " + isSignInChecked);
        logger.log(LogStatus.INFO, "The checkbox check condition is: " + isSignInChecked);

        //end the logger for test 1
        reports.endTest(logger);
    }//end of test 1


    @Test(dependsOnMethods = "tc001_verifySignedInOptionIsChecked")
    public void tc002_verifySignedInOptionIsUnChecked() {
        //set the name of the test case to the report by using logger concept
        logger = reports.startTest("tc002_verifySignedInOptionIsUnChecked");
        //click on check box to uncheck it
        driver.findElement(By.xpath("//*[@class= 'stay-signed-in checkbox-container']")).click();
        logger.log(LogStatus.PASS, "Successfully unchecked on checkbox");

        //we need to verify that signed in option is checked
        boolean isSignInChecked = driver.findElement(By.xpath("//*[@id= 'persistent']")).isSelected();
        System.out.println("The checkbox check condition is: " + isSignInChecked);
        logger.log(LogStatus.INFO, "The checkbox check condition is: " + isSignInChecked);
    }//end of test 2


}// end of class



