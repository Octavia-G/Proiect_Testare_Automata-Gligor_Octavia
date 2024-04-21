package Automation.myStepDefinition;

import Automation.myPages.Autentificare_LogInPage;
import Automation.myUtils.TestBase;
import io.cucumber.java.en.Then;
import org.testng.Assert;


public class Autentificare_LogInPage_Steps {

    Autentificare_LogInPage autentif_LogIn;

    public Autentificare_LogInPage_Steps(TestBase testBase){
        autentif_LogIn = new Autentificare_LogInPage(testBase.initializDriver());
    }

    @Then("the sign in page should be displayed")
    public void isSignInPageDisplayed(){

        Assert.assertTrue(autentif_LogIn.estePag_Autentif_afisata());
    }




}
