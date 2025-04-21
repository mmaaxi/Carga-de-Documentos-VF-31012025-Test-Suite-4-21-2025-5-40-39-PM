package pages;

import org.openqa.selenium.WebDriver;

public class tc_006Page {
    WebDriver driver;

    public tc_006Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToLoginPage() {
        driver.get("https://example.com/login");
    }

    public void enterCredentials(String username, String password) {
        // Código para ingresar credenciales
    }

    public void submitLogin() {
        // Código para enviar el formulario de login
    }

    public boolean isPermissionErrorDisplayed() {
        // Código para verificar si se muestra el mensaje de error de permisos insuficientes
        return false;
    }
    
    public void loginAsUnauthorizedUser() {
        navigateToLoginPage();
        enterCredentials("usuarioNoAutorizado", "contraseñaIncorrecta");
        submitLogin();
    }

    public void accessFileUploadModule() {
        // Código para intentar acceder al módulo de carga de documentos
    }

    public boolean isUploadOptionAvailable() {
        // Código para verificar si la opción de carga está disponible
        return false;
    }

    public boolean isUserRedirected() {
        // Código para verificar si el usuario es redirigido
        return true;
    }

    public void tryUnauthorizedUpload() {
        // Código para simular un intento de carga no autorizado
    }

    public boolean isUnauthorizedActivityLogged() {
        // Código para verificar en la base de datos si hay registros de actividad no autorizada
        return false;
    }
}