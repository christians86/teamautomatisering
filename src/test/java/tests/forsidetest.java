package tests;

import Utils.globalparams;
import org.testng.annotations.Test;
import pages.forside;

public
class forsidetest extends basetest{

    @Test(priority = 0, enabled = true)
    public void selectmodels()  {
        String testname = "Klikke på modeller ";
        String description = "-----description missing-----";
        forside forside = new forside (driver);
        forside.modellerlink ();
    }

}
