package pages;

import Utils.config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

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

    //Elementer dropdown valg
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


    //Methods for dropdown
    //----------------------------------------------------------------------
    public void clickModeldropdown_category(){modeldropdown_category.click();}
    public void clickModeldropdown_division(){modeldropdown_division.click();}
    public void modelvalue_category(){category_model.click();}
    public void divisionvalue_all(){division_all.click();}
    public void divisionvalue_Development(){division_Development.click();}
    public void divisionvalue_Image(){division_Image.click();}
    public void division_mainboard(){division_mainboard.click();}
    public void division_NewFaces(){division_NewFaces.click();}
    public void division_youngclassic(){division_Youngclassic.click();}



    //Methods for valg av modeller
    //----------------------------------------------------------------------



}
