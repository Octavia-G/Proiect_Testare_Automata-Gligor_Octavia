package Automation.myStepDefinition;

import Automation.myPages.RegisterPage_Creare_cont;
import Automation.myUtils.TestBase;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import java.util.List;

public class RegisterPage_Creare_cont_Steps {

    RegisterPage_Creare_cont creare_cont;

    public RegisterPage_Creare_cont_Steps(TestBase testBase) {
        creare_cont = new RegisterPage_Creare_cont(testBase.initializDriver());
    }

    @Then("the create account page should be displayed")
    public void isRegisterPage_Creare_contDisplayed() {
        Assert.assertTrue(creare_cont.estePag_CreareCont_afisata());

    }


    @Then("the fields are filled with values")
    public void fillValues(DataTable dataTableType) {
        List<String> values = dataTableType.values();

        creare_cont.typeValueToNumeUtilizator(values.get(0), values.get(1));
        creare_cont.typeValueToPassword(values.get(2), values.get(3));
        creare_cont.typeValueToConfirmPassword(values.get(4), values.get(5));
        creare_cont.typeValueToEmail(values.get(6), values.get(7));
    }


}
