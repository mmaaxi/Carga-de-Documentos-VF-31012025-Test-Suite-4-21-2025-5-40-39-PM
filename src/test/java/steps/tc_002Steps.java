package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_002Page;

public class tc_002Steps {

    tc_002Page page = new tc_002Page();

    @Given("que el usuario está en el módulo de carga de documentos")
    public void que_el_usuario_está_en_el_módulo_de_carga_de_documentos() {
        page.navigateToUploadModule();
        Assert.assertTrue(page.isUploadModuleDisplayed());
    }

    @When("el usuario selecciona un archivo en formato DOCX")
    public void el_usuario_selecciona_un_archivo_en_formato_DOCX() {
        page.selectFile("ruta/al/archivo.docx");
    }

    @Then("el sistema debe mostrar un mensaje de error indicando que el formato no es soportado")
    public void el_sistema_debe_mostrar_un_mensaje_de_error() {
        Assert.assertTrue(page.isUnsupportedFormatErrorDisplayed());
    }

    @When("el usuario intenta cargar el archivo rechazado")
    public void el_usuario_intenta_cargar_el_archivo_rechazado() {
        page.attemptToUploadFile();
    }

    @Then("el sistema debe detener la carga y solicitar un archivo válido")
    public void el_sistema_debe_detener_la_carga_y_solicitar_un_archivo_válido() {
        Assert.assertTrue(page.isUploadPromptForValidFile());
    }
}