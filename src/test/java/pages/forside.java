package pages;

import Utils.config;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class forside extends basepage{

    public forside ( WebDriver driver) {
        super(driver); }

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

    @FindBy (how = How.ID, using = config.bilde_image)
    private WebElement bilde_image;

    @FindBy (how = How.ID, using = config.bilde_newface)
    private WebElement bilde_newface;

    @FindBy (how = How.ID, using = config.bilde_development)
    private WebElement bilde_development;

    @FindBy (how = How.ID, using = config.bilde_mainboard)
    private WebElement bilde_mainboard;

    //Methods for bruk på forsiden
    //----------------------------------------------------------------------
    public void modellerlink() {clickElement (models); }

    public void sociallink() {clickElement (models);}

    public void selectionlink() {clickElement (selection);}

    public void morelink() {clickElement (more);}

    public void submeny_aboutlink(){
        synlighet_element ( sub_about );
        sub_about.click (); }

    public void submeny_reklamelink(){
        synlighet_element ( sub_reklame );
        sub_reklame.click (); }

    public void submeny_blimodelllink(){
        synlighet_element ( sub_blimodell );
        sub_blimodell.click (); }

    public void visallemodellerlink(){ clickElement (visallemodeller); }

    public void bilde_imagelink() {clickElement (bilde_image);}

    public void Bilde_newfacelink()  {clickElement (bilde_newface);}

    public void Bilde_developmentlink() {clickElement (bilde_development);}

    public void Bilde_mainboardlink() {clickElement (bilde_mainboard);}




}
