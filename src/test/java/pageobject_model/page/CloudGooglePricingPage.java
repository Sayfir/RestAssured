package pageobject_model.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageobject_model.utils.WaitersUtils;

public class CloudGooglePricingPage extends BasePage {

    @FindBy(xpath = "//a[@href='https://cloud.google.com/pricing/' and @track-name='seePricing']")
    private WebElement seePricingLink;

    public CloudGooglePricingPage(WebDriver driver) {
        super(driver);
        initElements();
    }

    public CloudGooglePricingPage openPage() {
        WaitersUtils.waitUntilClickable("//a[@href='https://cloud.google.com/pricing/' and @track-name='seePricing']", driver);
        logger.info("Pricing page was opened");
        new Actions(driver).click(seePricingLink).build().perform();
        return this;
    }

    protected BasePage initElements() {
        PageFactory.initElements(driver, this);
        return null;
    }

    @Override
    protected WebElement getElementByName(Object elementName) {
        return null;
    }
}