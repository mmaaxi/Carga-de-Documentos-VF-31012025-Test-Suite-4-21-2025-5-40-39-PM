import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_001Page;

public class tc_001Steps {

    WebDriver driver = new ChromeDriver();
    tc_001Page page = new tc_001Page(driver);

    @Given("el usuario accede al módulo de carga de documentos")
    public void el_usuario_accede_al_módulo_de_carga_de_documentos() {
        page.navigateToDocumentUploadModule();
    }

    @When("el usuario selecciona un archivo PDF válido")
    public void el_usuario_selecciona_un_archivo_pdf_válido() {
        page.selectValidPDFFile("test-document.pdf");
    }

    @When("el usuario presiona el botón de 'Cargar'")
    public void el_usuario_presiona_el_boton_de_cargar() {
        page.clickUploadButton();
    }

    @Then("el documento se carga exitosamente y se muestra un mensaje de confirmación")
    public void el_documento_se_carga_exitosamente() {
        Assert.assertTrue(page.isUploadSuccessMessageDisplayed());
    }
}