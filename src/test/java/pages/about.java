package pages;

import Utils.config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class about extends basepage{ public about ( WebDriver driver ) { super ( driver ); }

    //Webelementer
    //---------------------------------------------------------------
    @FindBy (how = How.ID, using = config.Instagram)
    private WebElement instagram;

    @FindBy (how = How.ID, using = config.Facebook)
    private WebElement facebook;

    @FindBy (how = How.ID, using = config.Twitter)
    private WebElement twitter;

    //Methods for siden
    //---------------------------------------------------------------

    public void Instagramlink(){
        instagram.click (); }

    public void Facebooklink(){
        facebook.click (); }

    public void Twitterlink(){
        twitter.click (); }

}


