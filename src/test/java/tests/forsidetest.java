package tests;

import Utils.globalparams;
import org.testng.annotations.Test;
import pages.forside;
import pages.models;

public
class forsidetest extends basetest{

    @Test(priority = 0, enabled = true)
    public void gotomodels() throws InterruptedException {
        String testname = "Velg modeller";
        String description = "Bruker går til forside og klikker på Models";
        forside forside = new forside (driver);
        forside.modellerlink ();
    }
    @Test(priority = 0, enabled = true)
    public void selectmodels() throws InterruptedException {
        String testname = "Velg kategori";
        String description = "Bruker går til modellsiden og setter modellkategori";
        models models = new models (driver);
        models.clickModeldropdown_category();
        models.modelvalue_category();
    }
    @Test(priority = 0, enabled = true)
    public void selectdivision() throws InterruptedException {
        String testname = "Velg kategori";
        String description = "Bruker går til modellsiden og setter modellkategori";
        models models = new models (driver);
        models.clickModeldropdown_division();
        models.division_mainboard();
    }


}
