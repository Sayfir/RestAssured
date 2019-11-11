package pageobject_model.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pageobject_model.page.CloudGoogleContactPage;

public class ContactStepDefinition extends ScenarioHooks {

    CloudGoogleContactPage contactPage = new CloudGoogleContactPage(driver);

    @Given("I open Contact page")
    public void iClickOnContactSalesLink() {
        contactPage.openPage();
    }

//    @And("^I fill in contact form$")
//    public void iFillInContactForm() {
//        contactPage.fillForm();
//    }

    @And("^I fill {string}$")
    public void iFillFirstName(String firstName) {
        contactPage.fillFirstName(firstName);}

    @And("^I fill \"([\\w ]+)\"$")
    public void iFillLastName(String lastName) {
        contactPage.fillLastName(lastName);
    }

    @And("^I fill \"([\\w ]+)\"$")
    public void iFillJobTitle(String jobTitle) {
        contactPage.fillJobTitle(jobTitle);
    }

    @And("^I fill (.*)$")
    public void iFillEmail(String email) {
        contactPage.fillEmail(email);
    }

    @And("^I fill \"\\$(\\d+)\"$")
    public void iFillPhone(long phoneNumber) {
        contactPage.fillPhoneNumber(phoneNumber);
    }

    @And("^I fill \"([\\w ]+)\"$")
    public void iFillCompanyName(String companyName) {
        contactPage.fillCompanyName(companyName);
    }

    @And("^I choose <industry>$")
    public void iChooseIndustry() {
        contactPage.chooseIndustry();
    }

    @And("^I choose <signUp> \"(Yes|No)\"$")
    public void iChooseSignUP(String option) {
        contactPage.chooseGoogleSignUp(option);
    }

    @When("I press Submit")
    public void iPressSubmit() {
        contactPage.clickSubmitButton();
    }

    @Then("Thank you page is displayed")
    public void thankYouPageIsDisplayed() {
        String expectedMessage = "THANK YOU";
        Assert.assertTrue(driver.findElement(By.xpath("html/body")).getText().contains(expectedMessage));
    }
}

