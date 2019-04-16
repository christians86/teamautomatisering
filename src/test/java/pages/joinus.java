package pages;

import Utils.config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static Utils.config.fornavn;

public class joinus extends basepage{ public joinus ( WebDriver driver ) { super ( driver ); }

    //Webelementer
    //---------------------------------------------------------------
    @FindBy (how = How.ID, using = fornavn)
    private WebElement Fornavn;

    @FindBy (how = How.ID, using = config.etternavn)
    private WebElement Etternavn;

    @FindBy (how = How.ID, using = config.by)
    private WebElement By;

    @FindBy (how = How.ID, using = config.nasjonalitet)
    private WebElement Nasjonalitet;

    @FindBy (how = How.ID, using = config.alder)
    private WebElement Alder;

    //Methods for siden
    //---------------------------------------------------------------

    public void skjemafylling(){
        waitElementVisible ( Fornavn );
        Fornavn.click ();
        sendkeys (Fornavn, "Marie");
        waitElementVisible ( Etternavn );
        Etternavn.click ();
        sendkeys ( Etternavn, "Hansen" );
        waitElementVisible ( By );
        By.click ();
        sendkeys ( By, "Oslo" );
        waitElementVisible ( Nasjonalitet );
        Nasjonalitet.click ();
        sendkeys ( Nasjonalitet, "Norsk" );
        waitElementVisible ( Alder );
        Alder.click ();
        sendkeys ( Alder, "16" ); }

}


