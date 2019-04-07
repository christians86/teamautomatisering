package pages;


import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

    void synlighet_element(WebElement element){
        try{
            wait.until(ExpectedConditions.visibilityOf(element));
            wait.until(ExpectedConditions.elementToBeClickable(element));
            element.click();
        }catch (WebDriverException w){
        }
    }
    //isControlVisible
    void waitElementVisible(WebElement element){
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
        }catch (WebDriverException w){}
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