package pages;


import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class basepage {
    public final WebDriver driver;
    public final WebDriverWait wait;

    public
    basepage ( WebDriver driver ) {
        this.driver = driver;
        PageFactory.initElements ( driver, this );
        wait = new WebDriverWait ( driver, 15 );
    }

    //*********Page Variables*********
    //*********Web Elements********************************************************
    //*********Page Methods********************************************************

    void waitElementVisible ( WebElement element ) {
        try {
            wait.until ( ExpectedConditions.visibilityOf ( element ) );
        } catch (WebDriverException stacktrace) {
            System.out.println ( " Wait element Test feilet" + stacktrace );

        }
    }

    void clickElement ( WebElement element ) {
        try {
            wait.until ( ExpectedConditions.visibilityOf ( element ) );
            //wait.until ( ExpectedConditions.elementToBeClickable ( element ) );
            element.click ();
        } catch (WebDriverException stacktrace) {
            //ExceptionUtils.getStackTrace(e)
            System.out.println ( "Click element Test feilet" + stacktrace);
        }
    }

    void clickElementwithscroll ( WebElement element ) {
        try {
            wait.until ( ExpectedConditions.visibilityOf ( element ) );
            wait.until ( ExpectedConditions.elementToBeClickable ( element ) );
            JavascriptExecutor executor = ( JavascriptExecutor ) driver;
            executor.executeScript("arguments[0].scrollIntoView(true);", element);
            element.click ();
        } catch (WebDriverException stacktrace) {
            //ExceptionUtils.getStackTrace(e)
            System.out.println ( "clickElementwithscroll feilet" + stacktrace );
        }

    }

    void sendkeys ( WebElement element, String text ) {
        try {
            element.click ();
            element.sendKeys ( text );
        } catch (WebDriverException stacktrace) {
            //ExceptionUtils.getStackTrace(e)
            System.out.println ( "Send keys Test feilet"+stacktrace);
        }
    }

    void mouseover (WebElement element){
        try {
            Actions action = new Actions(driver);
            action.moveToElement(element).build().perform();
        } catch (WebDriverException stacktrace) {
            //ExceptionUtils.getStackTrace(e)
            System.out.println ( "Mouseover feilet" + stacktrace );
        }
    }
    void navigateback(){
        driver.navigate ().back ();
    }
}


