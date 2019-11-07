package pageobject_model.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CloudGoogleContactPage extends BasePage {

    @FindBy(xpath = "//a[@href='https://cloud.google.com/contact/']")
    private WebElement contactPage;

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
        contactPage.click();
        logger.info("Contact page was opened");
        return this;
    }

    public CloudGoogleContactPage fillForm() {
        return this;
    }

    public CloudGoogleContactPage fillFirstName() {
        return this;
    }

    public CloudGoogleContactPage fillLastName() {
        return this;
    }

    public CloudGoogleContactPage fillJobTitle() {
        return this;
    }

    public CloudGoogleContactPage fillEmail() {
        return this;
    }

    public CloudGoogleContactPage fillPhoneNumber() {
        return this;
    }

    public CloudGoogleContactPage fillCompanyName() {
        return this;
    }

    public CloudGoogleContactPage chooseIndustry() {
        return this;
    }

    public CloudGoogleContactPage chooseGoogleSignUp() {
        return this;
    }
}

