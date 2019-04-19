package pages;

import Utils.config;
import Utils.confignames;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class models extends basepage {
    public
    models ( WebDriver driver ) {
        super ( driver );
    }

    //Dropdownmeny elementer
    //----------------------------------------------------------------------
    @FindBy(how = How.XPATH, using = config.modeldropdown_category)
    private WebElement modeldropdown_category;

    @FindBy(how = How.XPATH, using = config.modeldropdown_division)
    private WebElement modeldropdown_division;

    @FindBy(how = How.XPATH, using = config.modeldropdown_sex)
    private WebElement modeldropdown_sex;

    @FindBy(how = How.XPATH, using = config.modeldropdown_search)
    private WebElement modeldropdown_search;

    @FindBy(how = How.XPATH, using = config.more_filters)
    private WebElement more_filters;

    @FindBy(how = How.XPATH, using = config.less_filters)
    private WebElement less_filters;

    @FindBy(how = How.XPATH, using = config.secfilter_age)
    private WebElement secfilter_age;

    @FindBy(how = How.XPATH, using = config.secfilter_eyes)
    private WebElement secfilter_eyes;

    @FindBy(how = How.XPATH, using = config.secfilter_hair)
    private WebElement secfilter_hair;

    @FindBy(how = How.XPATH, using = config.secfilter_height)
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


    //Elementer modellvalg_board
    //----------------------------------------------------------------------
    @FindBy(how = How.XPATH, using = config.mainboard_female)
    private WebElement mainboard_female;

    @FindBy(how = How.XPATH, using = config.mainboard_byttside)
    private WebElement mainboard_byttside;

    @FindBy(how = How.XPATH, using = config.mainboard_male)
    private WebElement mainboard_male;

    //Methods for dropdown
    //----------------------------------------------------------------------
    public
    void clickModeldropdown_category () {
        clickElement ( modeldropdown_category );
    }

    public
    void clickModeldropdown_division () {
        clickElement ( modeldropdown_division );
    }

    public
    void modelvalue_category () {
        clickElement ( category_model );
    }

    public
    void divisionvalue_all () {
        clickElement ( division_all );
    }

    public
    void divisionvalue_Development () {
        clickElement ( division_Development );
    }

    public
    void divisionvalue_Image () {
        clickElement ( division_Development );
    }

    public
    void division_mainboard () {
        clickElement ( division_mainboard );
    }

    public
    void division_NewFaces () {
        clickElement ( division_NewFaces );
    }

    public
    void division_youngclassic () {
        clickElement ( division_Youngclassic );
    }

    public
    void sex_all () {
        clickElement ( sex_all );
    }

    public
    void sex_female () {
        clickElement ( sex_female );
    }

    public
    void sex_male () {
        clickElement ( sex_male );
    }

    public
    void sex_dropdown () {
        clickElement ( modeldropdown_sex );
    }

    //Elementer modellvalg
    //----------------------------------------------------------------------
    @FindBy(how = How.ID, using = confignames.Gustaw)
    private WebElement male_gustaw;
    @FindBy(how = How.ID, using = confignames.Fransisco)
    private WebElement male_Fransisco;
    @FindBy(how = How.ID, using = confignames.HaavardK)
    private WebElement male_HaavardK;
    @FindBy(how = How.ID, using = confignames.Jennu)
    private WebElement male_Jennu;
    @FindBy(how = How.ID, using = confignames.NikolaiD)
    private WebElement male_NikolaiD;
    @FindBy(how = How.ID, using = confignames.IrisL)
    private WebElement female_IrisL;
    @FindBy(how = How.ID, using = confignames.PaulinaE)
    private WebElement female_PaulinaE;
    @FindBy(how = How.ID, using = confignames.SophiaL)
    private WebElement female_SophiaL;
    @FindBy(how = How.ID, using = confignames.TineF)
    private WebElement female_TineF;
    @FindBy(how = How.ID, using = confignames.VictoriaM)
    private WebElement female_VictoriaM;
    @FindBy(how = How.ID_OR_NAME, using = config.addto_selection)
    private WebElement leggtil;
    @FindBy(how = How.CLASS_NAME, using = config.modell_bilde)
    private WebElement modellbilde;

    //Methods for valg av modeller
    //----------------------------------------------------------------------
    public void selectmale ( String text ) {
        try {
            if (text.contains ( "Gustaw" )) {
                clickElement ( male_gustaw );
                clickElement ( leggtil );
                navigateback ();
            }
            if (text.contains ( "Fransisco" )) {
                clickElement ( male_Fransisco );
                clickElement ( leggtil );
                navigateback ();

            }
            if (text.contains ( "Haavard K." )) {
                clickElementwithscroll ( male_HaavardK );
                clickElement ( leggtil );
                navigateback ();

            }
            if (text.contains ( "Jennu" )) {
                clickElement ( male_Jennu );
                clickElement ( leggtil );
                navigateback ();

            }
            if (text.contains ( "Nikolai D." )) {
                clickElement ( male_NikolaiD );
                clickElement ( leggtil );
                navigateback ();

            }
        }catch (WebDriverException stacktrace) {
            //ExceptionUtils.getStackTrace(e)
            System.out.println ( "Fant ikke modellen du så etter" + stacktrace );
        }
    }
    public void selectfemale ( String text ) {
        try {
            if (text.contains ( "Iris L" )) {
                clickElementwithscroll ( female_IrisL );


            }
            if (text.contains ( "Paulina E" )) {
                clickElement ( female_PaulinaE );

            }
            if (text.contains ( "Sophia L." )) {
                clickElementwithscroll ( female_SophiaL );


            }
            if (text.contains ( "Tine F" )) {
                clickElementwithscroll ( female_TineF );


            }
            if (text.contains ( "Victoria M" )) {
                clickElementwithscroll ( female_VictoriaM );


            }
        } catch (WebDriverException stacktrace) {
            //ExceptionUtils.getStackTrace(e)
            System.out.println ( "Fant ikke modellen du så etter" + stacktrace );
        }
    }
        public void add(){
            navigaterefresh ();
            mouseover ( leggtil );
            leggtil.click ();
        }


    }


