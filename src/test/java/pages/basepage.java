package pages;


import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

public class basepage {
    public final WebDriver driver;
    public final WebDriverWait wait;

    public basepage ( WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 15);
    }

    //*********Page Variables*********
    //*********Web Elements********************************************************
    //*********Page Methods********************************************************

    //isControlVisible
    void waitElementVisible(WebElement element){
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
        }catch (WebDriverException w){}
    }

    void clickElement(WebElement element) {
        try {
            wait.until ( ExpectedConditions.visibilityOf ( element ) );
            wait.until ( ExpectedConditions.elementToBeClickable ( element ) );
            element.click ();
        } catch (WebDriverException w) {
            //ExceptionUtils.getStackTrace(e)
            System.out.println ( "Test feilet" );
        }
    }

        void clickElementwithscroll(WebElement element) {
            try {
                wait.until ( ExpectedConditions.visibilityOf ( element ) );
                wait.until ( ExpectedConditions.elementToBeClickable ( element ) );
                JavascriptExecutor executor = ( JavascriptExecutor ) driver;
                executor.executeScript ( "arguments[0].scrollIntoView(true);", element );
                element.click ();
            } catch (WebDriverException w) {
                //ExceptionUtils.getStackTrace(e)
                System.out.println ( "Test feilet" );
            }
        }


    //Click
    //Sendkey
    //Clear
    //isDisplayed
    //isEnabled
    //isEmpty
    //isSelected
    //isNotDisplayed
    //isNotEnabled
    //isNotEmpty
    //isNotSelected
    //EqualTo
    //NotEqualTo


}