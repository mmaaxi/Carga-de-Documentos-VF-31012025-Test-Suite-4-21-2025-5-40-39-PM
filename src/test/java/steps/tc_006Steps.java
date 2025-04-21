package steps;

import io.cucumber.java.en.*;
import pages.tc_006Page;
import org.junit.Assert;

public class tc_006Steps {
    tc_006Page page = new tc_006Page();

    @Given("el usuario está en la página de login")
    public void el_usuario_esta_en_la_pagina_de_login() {
        page.navigateToLoginPage();
    }

    @When("el usuario inicia sesión con credenciales no autorizadas")
    public void el_usuario_inicia_sesion_con_credenciales_no_autorizadas() {
        page.enterCredentials("usuarioNoAutorizado", "contraseñaIncorrecta");
        page.submitLogin();
    }

    @Then("el sistema muestra un mensaje de error de permisos insuficientes")
    public void el_sistema_muestra_un_mensaje_de_error_de_permisos_insuficientes() {
        Assert.assertTrue(page.isPermissionErrorDisplayed());
    }

    @Given("el usuario no autorizado está logueado")
    public void el_usuario_no_autorizado_esta_logueado() {
        page.loginAsUnauthorizedUser();
    }

    @When("intenta acceder al módulo de carga de documentos")
    public void intenta_acceder_al_modulo_de_carga_de_documentos() {
        page.accessFileUploadModule();
    }

    @Then("el sistema no muestra la opción de carga y redirige al usuario")
    public void el_sistema_no_muestra_la_opcion_de_carga_y_redirige_al_usuario() {
        Assert.assertFalse(page.isUploadOptionAvailable());
        Assert.assertTrue(page.isUserRedirected());
    }

    @Given("el usuario no autorizado ha intentado cargar un documento")
    public void el_usuario_no_autorizado_ha_intentado_cargar_un_documento() {
        page.tryUnauthorizedUpload();
    }

    @Then("no se registra actividad de carga no autorizada en la base de datos")
    public void no_se_registra_actividad_de_carga_no_autorizada_en_la_base_de_datos() {
        Assert.assertFalse(page.isUnauthorizedActivityLogged());
    }
}