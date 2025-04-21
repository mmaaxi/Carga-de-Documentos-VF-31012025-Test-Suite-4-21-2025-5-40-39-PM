import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.tc_010Page;

public class tc_010Steps {
    WebDriver driver;
    tc_010Page page;

    @Given("el sistema está preparado para aceptar cargas concurrentes")
    public void el_sistema_esta_preparado_para_aceptar_cargas_concurrentes() {
        page = new tc_010Page(driver);
        page.prepareSystemForConcurrentLoad();
    }

    @When("simulo 50 usuarios intentando cargar documentos al mismo tiempo")
    public void simulo_usuarios_cargando_documentos_al_mismo_tiempo() {
        boolean result = page.simulateConcurrentUsers();
        Assert.assertTrue(result, "No se logró simular usuarios concurrentes correctamente");
    }

    @Then("el sistema procesa cada solicitud sin colapsar y mantiene la estabilidad")
    public void el_sistema_procesa_cada_solicitud() {
        boolean isStable = page.checkSystemStability();
        Assert.assertTrue(isStable, "El sistema colapsó bajo carga concurrente");
    }

    @Then("el sistema muestra tiempos de respuesta dentro del parámetro aceptable sin errores críticos")
    public void el_sistema_muestra_tiempos_de_respuesta_aceptables() {
        boolean responseTimeAcceptable = page.monitorResponseTimes();
        Assert.assertTrue(responseTimeAcceptable, "Los tiempos de respuesta no son aceptables");
    }

    @Then("no se registra ningún fallo debido a la saturación y se valida el correcto balanceo de carga")
    public void no_se_registra_ningun_fallo_por_saturacion() {
        boolean noFailures = page.checkErrorLogs();
        Assert.assertTrue(noFailures, "Se detectaron fallos debido a saturación");
    }
}