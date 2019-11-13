package pageobject_model.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CloudGoogleHomePage extends BasePage {

    public CloudGoogleHomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public CloudGoogleHomePage openPage() {
        driver.get("https://cloud.google.com/");
        driver.manage().window().maximize();
        return this;
    }

    protected BasePage initElements() {
        return this;
    }

    @Override
    protected WebElement getElementByName(Object elementName) {
        return null;
    }
}