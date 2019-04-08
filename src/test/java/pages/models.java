package pages;

import Utils.config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class models extends basepage {
    public models ( WebDriver driver) {
        super(driver); }

    //Elementer dropdown
    //----------------------------------------------------------------------
    @FindBy(how = How.ID, using = config.modeldropdown_category)
    private WebElement modeldropdown_category;

    @FindBy(how = How.ID, using = config.modeldropdown_division)
    private WebElement modeldropdown_division;

    @FindBy(how = How.ID, using = config.modeldropdown_sex)
    private WebElement modeldropdown_sex;

    @FindBy (how = How.ID, using = config.modeldropdown_search)
    private WebElement modeldropdown_search;

    @FindBy (how = How.ID, using = config.more_filters)
    private WebElement more_filters;

    @FindBy (how = How.ID, using = config.secfilter_age)
    private WebElement secfilter_age;

    @FindBy (how = How.ID, using = config.secfilter_eyes)
    private WebElement secfilter_eyes;

    @FindBy (how = How.ID, using = config.secfilter_hair)
    private WebElement secfilter_hair;

    @FindBy (how = How.ID, using = config.secfilter_height)
    private WebElement secfilter_height;

    //Elementer modeller
    //----------------------------------------------------------------------



    //Methods for dropdown
    //----------------------------------------------------------------------




    //Methods for valg av modeller
    //----------------------------------------------------------------------



}
