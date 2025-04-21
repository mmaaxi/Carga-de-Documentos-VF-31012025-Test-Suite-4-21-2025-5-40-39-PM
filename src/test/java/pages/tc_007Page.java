package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_007Page {

    private WebDriver driver;

    private By moduloCarga = By.id("uploadModule");
    private By botonSeleccionarArchivo = By.id("selectFileButton");
    private By notificacionError = By.id("errorNotification");

    public tc_007Page(WebDriver driver) {
        this.driver = driver;
    }

    public void abrirModuloCarga() {
        driver.get("http://tuaplicacion.com/modulo-de-carga");
    }

    public boolean moduloCargaEsVisible() {
        return driver.findElement(moduloCarga).isDisplayed();
    }

    public void seleccionarArchivoCorrupto() {
        WebElement uploadElement = driver.findElement(botonSeleccionarArchivo);
        uploadElement.sendKeys("/path/to/corrupt/file.pdf");
    }

    public void intentarCargarArchivo() {
        // Suponiendo que al seleccionar el archivo comienza la carga automáticamente
    }

    public boolean notificacionErrorArchivoCorruptoVisible() {
        return driver.findElement(notificacionError).isDisplayed();
    }
}