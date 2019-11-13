package pageobject_model.stepDefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pageobject_model.page.CloudGoogleContactPage;
import pageobject_model.page.DriverContainer;

import java.util.Map;

public class ContactStep extends DriverContainer {

    CloudGoogleContactPage contactPage = new CloudGoogleContactPage(driver);

    @Given("I open Contact page")
    public void iClickOnContactSalesLink() {
        contactPage.openPage();
    }

    @And("I fill Contact page with data:")
    public void iFillContactPageWithData(DataTable dataTable) throws NoSuchFieldException {
        Map values = dataTable.transpose().asMap(String.class, String.class);
        values.keySet().forEach(elementName ->
                contactPage.getElementByName(elementName)
                        .sendKeys(values.get(elementName).toString()));
    }

    @And("^I choose Industry")
    public void iChooseIndustry() {
        contactPage.chooseIndustry();
    }

    @And("I choose googleSignUp:")
    public void iChooseGoogleSignUp(DataTable options) {
        Map values = options.transpose().asMap(String.class, String.class);
        values.keySet().forEach(elementName ->
                contactPage.getElementByName(elementName)
                        .sendKeys(values.get(elementName).toString()));
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

