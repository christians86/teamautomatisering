package Utils;

import java.security.PublicKey;

public class config {

    //Fellesinfo
    public static final String webside="https://teammodels.no";

    //Selectors forside
    public static final String models="menu-item-44752";
    public static final String social="menu-item-44753";
    public static final String selection="menu-item-44754";
    public static final String more="menu-item-44755";
    public static final String sub_about="menu-item-44756";
    public static final String sub_reklame="menu-item-44757";
    public static final String sub_blimodell="menu-item-44758";
    public static final String visallemodeller="to-filter";
    public static final String bilde_image="//a[contains(text(),'Image')]";
    public static final String bilde_newface="//a[contains(text(),'New Face')]";
    public static final String bilde_development="//a[contains(text(),'Development')]";
    public static final String bilde_mainboard="//a[contains(text(),'Mainboard')]";

    //About
    public static final String Instagram="Instagram";
    public static final String Twitter="Twitter";
    public static final String Facebook="Facebook";

    //Models dropdowns
    public static final String modeldropdown_category="//div[@id='filter']//div[1]";
    public static final String modeldropdown_division="//div[@id='filter']//div[2]";
    public static final String modeldropdown_sex="//div[@id='filter']//div[3]";
    public static final String modeldropdown_search="//input[@placeholder='Search models']";
    public static final String more_filters="//a[contains(text(),'More filters')]";
    public static final String less_filters="//a[contains(text(),'Less filters')]";
    public static final String secfilter_height="//div[@id='secondary-filter']//div[1]";
    public static final String secfilter_age="//div[@id='secondary-filter']//div[2]";
    public static final String secfilter_hair="//div[@id='secondary-filter']//div[3]";
    public static final String secfilter_eyes="//div[@id='secondary-filter']//div[4]";

    //Dropdownvalues - category and division
    public static final String category_model="//li[@class='ng-binding ng-scope'][contains(text(),'Model')]";
    public static final String category_people="//li[@class='ng-binding ng-scope'][contains(text(),'People')]";
    public static final String division_all="//div[@id='filter']//div[2]//ul[1]//li[1]";
    public static final String division_Image="//li[contains(text(),'Image')]";
    public static final String division_NewFaces="//li[contains(text(),'New Faces')]";
    public static final String division_Development="//li[contains(text(),'Development')]";
    public static final String division_Mainboard="//li[contains(text(),'Mainboard')]";
    public static final String division_Youngclassic="//li[contains(text(),'Young Classics')]";


    //Dropdownvalues - sex
    public static final String sex_all="//li[@class='ng-binding ng-scope'][contains(text(),'All')]";
    public static final String sex_male="li[@class='ng-binding ng-scope'][contains(text(),'Male')]";
    public static final String sex_female="//li[@class='ng-binding ng-scope'][contains(text(),'Female')]";







}
