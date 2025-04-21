package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_007Page;

public class tc_007Steps {
    tc_007Page page = new tc_007Page();

    @Given("el usuario ha accedido al módulo de carga")
    public void el_usuario_ha_accedido_al_módulo_de_carga() {
        page.abrirModuloCarga();
        Assert.assertTrue(page.moduloCargaEsVisible());
    }

    @When("el usuario selecciona un archivo PDF corrupto")
    public void el_usuario_selecciona_un_archivo_PDF_corrupto() {
        page.seleccionarArchivoCorrupto();
    }

    @When("el usuario intenta cargar el archivo")
    public void el_usuario_intenta_cargar_el_archivo() {
        page.intentarCargarArchivo();
    }

    @Then("el sistema rechaza el archivo y notifica del error en el documento")
    public void el_sistema_rechaza_el_archivo_y_notifica_del_error() {
        Assert.assertTrue(page.notificacionErrorArchivoCorruptoVisible());
    }
}