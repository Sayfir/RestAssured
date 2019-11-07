package pageobject_model.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageobject_model.page.CloudGoogleCalculatorPage;
import pageobject_model.page.DriverContainer;

import java.awt.*;
import java.io.IOException;

public class PricingCalculationStepDefinition extends DriverContainer {

    CloudGoogleCalculatorPage calculatorPage = new CloudGoogleCalculatorPage(driver);

    @Given("I open Calculation page")
    public void iOpenedCalculationPage() {
        calculatorPage.openPage();
    }

    @And("^I fill in calculation form$")
    public void iFillInCalculationForm() throws InterruptedException, AWTException, IOException {
        calculatorPage.fillForm();
    }

    @When("^I press Add to Estimate$")
    public void iPressAddToEstimate() {
        calculatorPage.clickSubmitButton();
    }

    @Then("USD 1,187.77 per 1 month is displayed")
    public void usdPerMonthIsDisplayed() {
        String estimatedResult = calculatorPage.getEstimatedResult();
        Assert.assertEquals("USD 1,187.77 per 1 month is displayed", estimatedResult);
    }

    @Then("Instance type: n1-standard-8 is displayed")
    public void instanceTypeNStandardIsDisplayed() {
        String instanceType = calculatorPage.getInstanceType();
        Assert.assertEquals("Instance type: n1-standard-8 is displayed", instanceType);
    }

    @Then("Region: Frankfurt is displayed")
    public void regionFrankfurtIsDisplayed() {
        String region = calculatorPage.getRegion();
        Assert.assertEquals("Region: Frankfurt is displayed", region);
    }

    @Then("Total available local SSD space 2x375 GB is displayed")
    public void totalAvailableLocalSSDSpaceXGBIsDisplayed() {
        String localSsd = calculatorPage.getLocalSsd();
        Assert.assertEquals("Total available local SSD space 2x375 GB is displayed", localSsd);
    }
}
