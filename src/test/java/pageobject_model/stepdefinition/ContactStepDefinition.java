package pageobject_model.stepDefinition;

import cucumber.annotation.en.And;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.When;
import pageobject_model.page.CloudGoogleContactPage;
import pageobject_model.page.DriverContainer;

public class ContactStepDefinition extends DriverContainer {

    CloudGoogleContactPage contactPage = new CloudGoogleContactPage(driver);

    @Given("I open Contact page")
    public void iOpenedContactPage() {
        contactPage.openPage();
    }

    @And("^I fill in contact form$")
    public void iFillInContactForm() {
    }

    @When("^I press Submit$")
    public void iPressSubmit() {
    }
}
