package pages;

import Utils.config;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class forside extends basepage{

    public forside ( WebDriver driver) { super(driver); }

    //Elementer på forsiden til bruk
    //----------------------------------------------------------------------
    @FindBy (how = How.ID, using = config.models)
    private WebElement models;

    @FindBy (how = How.ID, using = config.social)
    private WebElement social;

    @FindBy (how = How.ID, using = config.selection)
    private WebElement selection;

    @FindBy (how = How.ID, using = config.more)
    private WebElement more;

    @FindBy (how = How.ID, using = config.sub_about)
    private WebElement sub_about;

    @FindBy (how = How.ID, using = config.sub_reklame)
    private WebElement sub_reklame;

    @FindBy (how = How.ID, using = config.sub_blimodell)
    private WebElement sub_blimodell;

    @FindBy (how = How.ID, using = config.visallemodeller)
    private WebElement visallemodeller;

    @FindBy (how = How.ID, using = config.bildelink_image)
    private WebElement bildelink_image;

    @FindBy (how = How.ID, using = config.bildelink_newface)
    private WebElement bildelink_newface;

    @FindBy (how = How.ID, using = config.bildelink_development)
    private WebElement bildelink_development;

    @FindBy (how = How.ID, using = config.bildelink_mainboard)
    private WebElement bildelink_mainboard;

    @FindBy (how = How.ID, using = config.modellsearch_forside)
    private WebElement modellsearch_link;

    //Methods for bruk på forsiden
    //----------------------------------------------------------------------
    public void modellerlink() {models.click (); }

    public void sociallink() {social.click ();}

    public void selectionlink() {clickElement (selection);}

    public void visallemodellerlink(){ clickElement (visallemodeller); }

    public void bildelink_imagelink() {clickElement (bildelink_image);}

    public void bildelink_newfacelink()  {clickElement (bildelink_newface);}

    public void bildelink_developmentlink() {clickElement (bildelink_development);}

    public void bildelink_mainboardlink() {clickElement (bildelink_mainboard);}

    public void modellsearch_link() {clickElement (modellsearch_link);}

    public void submeny (String menyvalg){
        more.click ();
        if (menyvalg.equals ("Bli modell")){
        clickElement ( sub_blimodell );
        }
        if (menyvalg.equals ("About")){
            clickElement ( sub_about );
        }
        if (menyvalg.equals ("Reklame")){
            clickElement ( sub_reklame );
        }
    }



}
