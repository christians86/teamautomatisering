package pages;

import Utils.config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.SkipException;

public class models extends basepage {
    public models ( WebDriver driver) {
        super(driver); }

    //Dropdownmeny elementer
    //----------------------------------------------------------------------
    @FindBy(how = How.XPATH, using = config.modeldropdown_category)
    private WebElement modeldropdown_category;

    @FindBy(how = How.XPATH, using = config.modeldropdown_division)
    private WebElement modeldropdown_division;

    @FindBy(how = How.XPATH, using = config.modeldropdown_sex)
    private WebElement modeldropdown_sex;

    @FindBy (how = How.XPATH, using = config.modeldropdown_search)
    private WebElement modeldropdown_search;

    @FindBy (how = How.XPATH, using = config.more_filters)
    private WebElement more_filters;

    @FindBy (how = How.XPATH, using = config.less_filters)
    private WebElement less_filters;

    @FindBy (how = How.XPATH, using = config.secfilter_age)
    private WebElement secfilter_age;

    @FindBy (how = How.XPATH, using = config.secfilter_eyes)
    private WebElement secfilter_eyes;

    @FindBy (how = How.XPATH, using = config.secfilter_hair)
    private WebElement secfilter_hair;

    @FindBy (how = How.XPATH, using = config.secfilter_height)
    private WebElement secfilter_height;

    //Elementer dropdown values
    //----------------------------------------------------------------------
    @FindBy(how = How.XPATH, using = config.category_model)
    private WebElement category_model;

    @FindBy(how = How.XPATH, using = config.category_people)
    private WebElement category_people;

    @FindBy(how = How.XPATH, using = config.division_all)
    private WebElement division_all;

    @FindBy(how = How.XPATH, using = config.division_Development)
    private WebElement division_Development;

    @FindBy(how = How.XPATH, using = config.division_Image)
    private WebElement division_Image;

    @FindBy(how = How.XPATH, using = config.division_Mainboard)
    private WebElement division_mainboard;

    @FindBy(how = How.XPATH, using = config.division_NewFaces)
    private WebElement division_NewFaces;

    @FindBy(how = How.XPATH, using = config.division_Youngclassic)
    private WebElement division_Youngclassic;

    @FindBy(how = How.XPATH, using = config.sex_all)
    private WebElement sex_all;

    @FindBy(how = How.XPATH, using = config.sex_female)
    private WebElement sex_female;

    @FindBy(how = How.XPATH, using = config.sex_male)
    private WebElement sex_male;


    //Elementer modellvalg
    //----------------------------------------------------------------------
    @FindBy(how = How.XPATH, using = config.mainboard_female)
    private WebElement mainboard_female;

    @FindBy(how = How.XPATH, using = config.mainboard_byttside)
    private WebElement mainboard_byttside;

    @FindBy(how = How.XPATH, using = config.mainboard_male)
    private WebElement mainboard_male;

    @FindBy(how = How.ID_OR_NAME, using = config.addto_selection)
    private WebElement leggtil;

    @FindBy (how = How.CLASS_NAME, using = config.modell_bilde)
    private WebElement modellbilde;


    //Methods for dropdown
    //----------------------------------------------------------------------
    public void clickModeldropdown_category(){clickElement ( modeldropdown_category );}
    public void clickModeldropdown_division(){clickElement ( modeldropdown_division );}
    public void modelvalue_category(){clickElement ( category_model );}
    public void divisionvalue_all(){clickElement ( division_all );}
    public void divisionvalue_Development(){clickElement ( division_Development );}
    public void divisionvalue_Image(){clickElement ( division_Development );}
    public void division_mainboard(){clickElement ( division_mainboard );}
    public void division_NewFaces(){clickElement ( division_NewFaces );}
    public void division_youngclassic(){clickElement ( division_Youngclassic );}
    public void sex_all(){clickElement ( sex_all );}
    public void sex_female(){clickElement ( sex_female );}
    public void sex_male(){clickElement ( sex_male );}
    public void sex_dropdown(){clickElement ( modeldropdown_sex );}


    //Methods for valg av modeller
    //----------------------------------------------------------------------
    public void velgmodell(String navn){
        clickElement ( modellbilde );
    }





}
