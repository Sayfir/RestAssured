package pageobject_model.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject_model.page.CloudGoogleContactPage;
import pageobject_model.page.CloudGoogleHomePage;
import pageobject_model.page.DriverContainer;

public class ContactStepDefinition extends DriverContainer {

    CloudGoogleHomePage homePage = new CloudGoogleHomePage(driver);
    CloudGoogleContactPage contactPage = new CloudGoogleContactPage(driver);

    @Given("I open Home page")
    public void iOpenHomePage() {
        homePage.openPage();
    }

    @And("I click on Contact sales link")
    public void iClickOnContactSalesLink() {
        contactPage.openPage();
    }

    @And("^I fill in contact form$")
    public void iFillInContactForm() {
    }

    @When("^I press Submit$")
    public void iPressSubmit() {
    }

    @Then("Thank you page is displayed")
    public void thankYouPageIsDisplayed() {
    }
}
