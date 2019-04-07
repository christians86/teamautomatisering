package tests;

import Utils.globalparams;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;


import java.util.concurrent.TimeUnit;

public class basetest {
    public static WebDriver driver;
    public static WebDriverWait wait;

    public WebDriver getDriver() {
        return driver;
    }

    @BeforeSuite
    public void setup () {
        System.setProperty("webdriver.chrome.driver", globalparams.driverChromePath);
        driver = new ChromeDriver ();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get ( globalparams.baseURL );
    }

    @BeforeMethod
    public void categorieSetup(ITestContext iTestContext){
        //String testnamefromxml = iTestContext.getCurrentXmlTest().getName();
        //System.out.println("test report in categorieSetup: " + testnamefromxml);
        //ExtentTestManager.getTest().log(LogStatus.INFO,"test report in categorieSetup");
        //ExtentTestManager.getTest().assignCategory(testnamefromxml);

    }

    @AfterMethod
    public void categoriePutAfterMethod(ITestContext iTestContext){
        //String testnamefromxml = iTestContext.getCurrentXmlTest().getName();
        //ExtentTestManager.getTest().assignCategory(testnamefromxml);
    }

    @AfterSuite
    public void teardown () {
        //driver.manage().deleteAllCookies();
        //driver.quit();
        //ExtentTestManager.getTest().log(LogStatus.INFO, "Test finished");
    }


}
