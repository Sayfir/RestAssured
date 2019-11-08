package pageobject_model.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageobject_model.page.CloudGoogleContactPage;
import pageobject_model.page.DriverContainer;

public class ContactStepDefinition extends DriverContainer {

    CloudGoogleContactPage contactPage = new CloudGoogleContactPage(driver);

    @Given("I open Contact page")
    public void iClickOnContactSalesLink() {
        contactPage.openPage();
    }

    @And("^I fill in contact form$")
    public void iFillInContactForm() {
        contactPage.fillForm();
    }

    @When("^I press Submit$")
    public void iPressSubmit() {
        contactPage.clickSubmitButton();
    }

    @Then("Thank you page is displayed")
    public void thankYouPageIsDisplayed(String expectedUrl) {
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }
}

