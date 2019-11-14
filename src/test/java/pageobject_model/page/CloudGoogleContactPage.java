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
    public WebElement getElementByName(Object elementName) {
        WebElement result = null;
        switch ((String) elementName) {
            case "firstName":
                result = firstName;
                break;
            case "lastName":
                result = lastName;
                break;
            case "jobTitle":
                result = jobTitle;
                break;
            case "email":
                result = email;
                break;
            case "phoneNumber":
                result = phoneNumber;
                break;
            case "companyName":
                result = companyName;
                break;
            default:
                new Exception("No such element found!");
        }
        return result;
    }

    @Override
    public CloudGoogleContactPage openPage() {
        driver.get("https://cloud.google.com/contact/");
        return this;
    }

    public CloudGoogleContactPage chooseIndustry() {
        FormFillingUtils.choosingElementFromDropdown(driver, "//input[@id='industry']", industryDropdown,
                "//*[@id='industry']/option[2]", this.industryDropdownElement);
        return this;
    }

    public WebElement chooseGoogleSignUp(String googleSignUp) {
        WebElement result = null;
        switch (googleSignUp) {
            case "Yes": {
                result = optionYes;
                result.click();
                break;
            }
            case "No": {
                result = optionNo;
                result.click();
                break;
            }
        }
        return result;
    }

    public CloudGoogleContactPage clickSubmitButton() {
        this.submitButton.click();
        return this;
    }
}

