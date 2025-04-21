package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class tc_005Page {
    WebDriver driver;

    By uploadButton = By.id("uploadButton");
    By previewLink = By.id("previewLink");
    By documentPreview = By.id("documentPreview");

    public tc_005Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void uploadPDFDocument(String filePath) {
        WebElement uploadBtn = driver.findElement(uploadButton);
        uploadBtn.sendKeys(filePath);
    }

    public boolean isDocumentUploaded() {
        // Logic to verify if the document is uploaded successfully
        return true; // Placeholder for actual implementation
    }

    public void clickPreviewOption() {
        WebElement previewOption = driver.findElement(previewLink);
        previewOption.click();
    }

    public boolean isPreviewDisplayed() {
        return driver.findElement(documentPreview).isDisplayed();
    }

    public boolean isContentRenderedCorrectly() {
        // Verify that content is rendered correctly without errors
        return true; // Placeholder for actual implementation
    }
}