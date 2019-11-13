package pageobject_model;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "D:\\Work\\IdeaProjects\\BddOrigin\\src\\test\\resources\\features",
        glue = "pageobject_model.stepDefinition",
        tags = {"@test"},
        strict = true,
        plugin = {"pretty", "html:target/cucumber"})
public class testRunner {

}
