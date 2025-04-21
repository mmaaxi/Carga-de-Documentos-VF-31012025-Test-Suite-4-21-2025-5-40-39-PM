package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverFactory;

public class tc_004Page {

    WebDriver driver;
    WebDriverWait wait;

    By uploadSection = By.id("upload-section");
    By fileInput = By.id("file-input");
    By titleInput = By.id("title-input");
    By descriptionInput = By.id("description-input");
    By dateInput = By.id("date-input");
    By uploadButton = By.id("upload-button");
    By confirmationMessage = By.id("confirmation-message");

    public tc_004Page() {
        this.driver = DriverFactory.getDriver();
        this.wait = new WebDriverWait(driver, 10);
    }

    public void navegarASeccionDeCarga() {
        driver.get("http://miapp.com/carga-documentos");
        wait.until(ExpectedConditions.visibilityOfElementLocated(uploadSection));
    }

    public void seleccionarArchivo(String filePath) {
        WebElement fileInputElement = driver.findElement(fileInput);
        fileInputElement.sendKeys(filePath);
    }

    public void ingresarMetadatos(String titulo, String descripcion, String fecha) {
        driver.findElement(titleInput).sendKeys(titulo);
        driver.findElement(descriptionInput).sendKeys(descripcion);
        driver.findElement(dateInput).sendKeys(fecha);
    }

    public void cargarArchivo() {
        driver.findElement(uploadButton).click();
    }

    public boolean verificarCargaYMetadatos() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(confirmationMessage));
        String mensaje = driver.findElement(confirmationMessage).getText();
        return mensaje.contains("Carga exitosa");
    }
}