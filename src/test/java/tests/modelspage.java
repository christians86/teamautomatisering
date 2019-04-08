package tests;

import Utils.globalparams;
import org.testng.annotations.Test;
import pages.forside;
import pages.models;

public
class modelspage extends basetest{

    @Test(priority = 1, enabled = true)
    public void Åpnemodellsiden() throws InterruptedException {
        String testname = "Velg modeller";
        String description = "Bruker går til forside og klikker på Models";
        forside forside = new forside ( driver );
        forside.modellerlink ();
    }

    @Test(priority = 2, enabled = true)
    public void Velgedivision() throws InterruptedException {
        String testname = "Velg modeller";
        String description = "Bruker går til forside og klikker på Models";
        models models = new models (driver);
        models.clickModeldropdown_division ();
    }
    @Test(priority = 3, enabled = true)
    public void Setdivision() throws InterruptedException {
        String testname = "Velg modeller";
        String description = "Bruker går til forside og klikker på Models";
        models models = new models (driver);
        models.division_mainboard ();
    }



}
