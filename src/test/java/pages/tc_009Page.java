package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class tc_009Page {

    WebDriver driver;

    @FindBy(id = "loginButton")
    WebElement loginButton;

    @FindBy(id = "documentLoader")
    WebElement documentLoader;

    @FindBy(id = "logoutButton")
    WebElement logoutButton;

    public tc_009Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void login() {
        loginButton.click();
        // Add code to perform login if necessary
    }

    public boolean isDocumentLoaded() {
        return documentLoader.isDisplayed();
    }

    public void logout() {
        logoutButton.click();
    }

    public boolean isAtLoginPage() {
        return driver.getCurrentUrl().contains("/login");
    }

    public void accessProtectedSectionWithoutLogin() {
        driver.get("http://example.com/protectedSection");
    }
}