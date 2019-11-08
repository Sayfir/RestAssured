package pageobject_model.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageobject_model.utils.FormFillingUtils;


public class CloudGoogleContactPage extends BasePage {

    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@id='job-title']")
    private WebElement jobTitle;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement email;

    @FindBy(xpath = "//input[@id='phone-number']")
    private WebElement phoneNumber;

    @FindBy(xpath = "//input[@id='company']")
    private WebElement companyName;

    @FindBy(xpath = "//input[@id='industry']")
    private WebElement industryDropdown;

    @FindBy(xpath = "//*[@id='industry']/option[2]")
    private WebElement industryDropdownElement;

    @FindBy(xpath = "//*[@type='radio' and @value='Yes']")
    private WebElement optionYes;

    @FindBy(xpath = "//*[@type='radio' and @value='No']")
    private WebElement optionNo;

    @FindBy(xpath = "//*[@type='submit']")
    private WebElement submitButton;

    public CloudGoogleContactPage(WebDriver driver) {
        super(driver);
        initElements();
    }

    @Override
    protected BasePage initElements() {
        PageFactory.initElements(driver, this);
        return null;
    }

    @Override
    public CloudGoogleContactPage openPage() {
        driver.get("https://cloud.google.com/contact/");
        return this;
    }

    public CloudGoogleContactPage fillForm(String firstName, String lastName, String jobTitle,
                                           String email, String phoneNumber, String companyName,
                                           String googleSignUp) {
        fillFirstName(firstName).fillFirstName(lastName)
                .fillJobTitle(jobTitle).fillEmail(email).fillPhoneNumber(phoneNumber)
                .fillCompanyName(companyName).chooseIndustry().chooseGoogleSignUp(googleSignUp);
        {
            return this;
        }
    }

    public CloudGoogleContactPage fillFirstName(String firstName) {
        FormFillingUtils.fillTextField(driver, "//input[@id='first-name']", this.firstName, firstName);
        return this;
    }

    public CloudGoogleContactPage fillLastName(String lastName) {
        FormFillingUtils.fillTextField(driver, "//input[@id='last-name']", this.lastName, lastName);
        return this;
    }

    public CloudGoogleContactPage fillJobTitle(String jobTitle) {
        FormFillingUtils.fillTextField(driver, "//input[@id='job-title']", this.jobTitle, jobTitle);
        return this;
    }

    public CloudGoogleContactPage fillEmail(String email) {
        FormFillingUtils.fillTextField(driver, "//input[@id='email']", this.email, email);
        return this;
    }

    public CloudGoogleContactPage fillPhoneNumber(String phoneNumber) {
        FormFillingUtils.fillTextField(driver, "//input[@id='phone-number']", this.phoneNumber, phoneNumber);
        return this;
    }

    public CloudGoogleContactPage fillCompanyName(String companyName) {
        FormFillingUtils.fillTextField(driver, "//input[@id='company']", this.companyName, companyName);
        return this;
    }

    public CloudGoogleContactPage chooseIndustry() {
        FormFillingUtils.choosingElementFromDropdown(driver, "//input[@id='industry']", industryDropdown,
                "//*[@id='industry']/option[2]", this.industryDropdownElement);
        return this;
    }

    public CloudGoogleContactPage chooseGoogleSignUp(String googleSignUp) {
        switch (googleSignUp) {
            case "Yes": {
                this.optionYes.click();
            }
            case "No": {
                this.optionNo.click();
            }
        }
        return this;
    }

    public CloudGoogleContactPage clickSubmitButton() {
        this.submitButton.click();
        return this;
    }
}

