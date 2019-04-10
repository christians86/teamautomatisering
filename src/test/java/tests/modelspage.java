package tests;

import Utils.globalparams;
import org.testng.annotations.Test;
import pages.forside;
import pages.models;

public
class modelspage extends basetest{

    @Test(priority = 1, enabled = true)
    public void Åpne_modellsiden() throws InterruptedException {
        String testname = "Velg modeller";
        String description = "Bruker går til forside og klikker på Models";
        forside forside = new forside ( driver );
        forside.modellerlink ();
    }

    @Test(priority = 2, enabled = true)
    public void Velg_board() throws InterruptedException {
        String testname = "Velg modeller";
        String description = "Bruker går til forside og klikker på Models";
        models models = new models (driver);
        models.clickModeldropdown_division ();
    }
    @Test(priority = 3, enabled = true)
    public void Sett_board() throws InterruptedException {
        String testname = "Velg modeller";
        String description = "Bruker går til forside og klikker på Models";
        models models = new models (driver);
        models.division_mainboard ();
    }
    @Test(priority = 4, enabled = true)
    public void Velg_kjønn() throws InterruptedException {
        String testname = "Velg modeller";
        String description = "Bruker går til forside og klikker på Models";
        models models = new models (driver);
        models.sex_dropdown ();
        models.sex_female ();
    }

}
