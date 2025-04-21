package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_001Page {

    WebDriver driver;

    By uploadModule = By.id("document-upload-module");
    By fileInput = By.id("file-input");
    By uploadButton = By.id("upload-button");
    By successMessage = By.id("success-message");

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToDocumentUploadModule() {
        driver.get("http://example.com/upload");
        WebElement module = driver.findElement(uploadModule);
        if (!module.isDisplayed()) {
            throw new IllegalStateException("Upload module is not visible");
        }
    }

    public void selectValidPDFFile(String fileName) {
        WebElement fileInputElement = driver.findElement(fileInput);
        fileInputElement.sendKeys("C:\\path\\to\\" + fileName);
    }

    public void clickUploadButton() {
        WebElement button = driver.findElement(uploadButton);
        button.click();
    }

    public boolean isUploadSuccessMessageDisplayed() {
        WebElement message = driver.findElement(successMessage);
        return message.isDisplayed();
    }
}