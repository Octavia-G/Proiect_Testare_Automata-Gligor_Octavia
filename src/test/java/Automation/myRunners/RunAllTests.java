package Automation.myRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//ii spunem la cucumber ce sa ruleze
@CucumberOptions( //de unde sa-si citeasca pasii din hooks
        plugin = {"pretty", "html:target/cucumber/cucumber.html"}, //targetul e in ce bilduieste el
        glue = {"Automation.myStepDefinition", "Automation.myHooks"}, ////isi ia pasii din automation, stepdefinition si din hooks
            features = "src/test/resources/features"

)

public class RunAllTests extends AbstractTestNGCucumberTests{
}
