package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_002Page {

    WebDriver driver;

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    private By uploadModuleLocator = By.id("upload-module");
    private By fileInputLocator = By.id("file-input");
    private By errorMessageLocator = By.id("error-message");
    private By uploadButtonLocator = By.id("upload-button");

    public void navigateToUploadModule() {
        driver.get("url/del/modulo/de/carga");
    }

    public boolean isUploadModuleDisplayed() {
        WebElement uploadModule = driver.findElement(uploadModuleLocator);
        return uploadModule.isDisplayed();
    }

    public void selectFile(String filePath) {
        WebElement fileInput = driver.findElement(fileInputLocator);
        fileInput.sendKeys(filePath);
    }

    public boolean isUnsupportedFormatErrorDisplayed() {
        WebElement errorMessage = driver.findElement(errorMessageLocator);
        return errorMessage.isDisplayed() && errorMessage.getText().contains("formato no soportado");
    }

    public void attemptToUploadFile() {
        WebElement uploadButton = driver.findElement(uploadButtonLocator);
        uploadButton.click();
    }

    public boolean isUploadPromptForValidFile() {
        // Custom logic to verify the prompt for valid file is displayed
        return driver.findElement(uploadButtonLocator).isDisplayed();
    }
}