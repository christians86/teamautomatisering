package tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import pages.basepage;
import pages.forside;
import pages.joinus;
import pages.models;


public class Debugtestcase extends basetest{

    @Test(priority = 1, enabled = true)
    public void Debug_newfeatures() throws InterruptedException {
        String testname = "Velg modeller";
        String description = "Bruker går til forside og klikker på Models";
        forside forside = new forside (driver);
        joinus join = new joinus (driver);
        models modell = new models ( driver );
        basepage bp = new basepage (driver);
        forside.modellerlink ();
        modell.selectfemale ( "Victoria M" );
    }

    }

