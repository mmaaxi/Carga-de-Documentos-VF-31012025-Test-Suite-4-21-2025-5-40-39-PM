package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_003Page {

    WebDriver driver;

    // Locators
    By uploadModule = By.id("uploadModule"); // hypothetical locator
    By fileInput = By.id("fileInput");
    By warningMessage = By.id("warningMessage");
    By uploadButton = By.id("uploadButton");

    public tc_003Page(WebDriver driver) {
        this.driver = driver;
    }

    public boolean openUploadModule() {
        driver.get("http://example.com/upload"); // hypothetical URL
        return driver.findElement(uploadModule).isDisplayed();
    }

    public boolean selectLargePDFFile() {
        WebElement fileElement = driver.findElement(fileInput);
        fileElement.sendKeys("/path/to/largefile.pdf"); // hypothetical path
        return fileElement.getAttribute("value").contains("largefile.pdf");
    }

    public boolean isFileSizeWarningDisplayed() {
        return driver.findElement(warningMessage).isDisplayed();
    }

    public void attemptToUploadFile() {
        driver.findElement(uploadButton).click();
    }

    public boolean isUploadDeniedNotificationDisplayed() {
        // Assuming there's a notification element on failure
        return driver.findElement(By.id("uploadFailureNotification")).isDisplayed();
    }
}