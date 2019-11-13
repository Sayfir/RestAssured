package pageobject_model.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class BasePage extends DriverContainer {

    public final Logger logger = LogManager.getRootLogger();

    public BasePage(WebDriver driver) {
        super.driver = driver;
    }

    protected abstract BasePage openPage() throws InterruptedException;

    protected abstract BasePage initElements();

    protected abstract WebElement getElementByName(Object elementName);
}