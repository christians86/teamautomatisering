package tests;


import org.openqa.selenium.By;
import org.testng.annotations.Test;
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
        forside.modellerlink ();
        modell.selectfemale ( "Paulina E" );
        modell.add ();

    }

    }

