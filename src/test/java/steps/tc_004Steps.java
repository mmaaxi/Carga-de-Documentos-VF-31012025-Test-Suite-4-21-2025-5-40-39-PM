package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_004Page;

public class tc_004Steps {

    tc_004Page cargaDocumento = new tc_004Page();

    @Given("que accedo a la sección de carga de documentos")
    public void accederSeccionCargaDocumentos() {
        cargaDocumento.navegarASeccionDeCarga();
    }

    @When("selecciono un archivo PDF junto con metadatos requeridos como título, descripción y fecha")
    public void seleccionarArchivoYMetadatos() {
        cargaDocumento.seleccionarArchivo("ruta/al/archivo.pdf");
        cargaDocumento.ingresarMetadatos("Título del Documento", "Descripción del Documento", "12-10-2023");
    }

    @When("ejecuto la carga del archivo")
    public void ejecutarCargaDeArchivo() {
        cargaDocumento.cargarArchivo();
    }

    @Then("el documento se carga correctamente y los metadatos se visualizan en la consulta del documento")
    public void verificarIntegridadMetadatos() {
        boolean resultado = cargaDocumento.verificarCargaYMetadatos();
        Assert.assertTrue("El documento o los metadatos no se visualizaron correctamente.", resultado);
    }
}