package steps;

import pages.tc_009Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class tc_009Steps {
    tc_009Page page = new tc_009Page();

    @Given("the user is logged in and has loaded a document")
    public void theUserIsLoggedInAndHasLoadedADocument() {
        page.login();
        Assert.assertTrue(page.isDocumentLoaded());
    }

    @When("the user logs out using the corresponding option")
    public void theUserLogsOutUsingTheCorrespondingOption() {
        page.logout();
    }

    @Then("the system should log out the user and redirect to the login page")
    public void theSystemShouldLogOutTheUserAndRedirectToTheLoginPage() {
        Assert.assertTrue(page.isAtLoginPage());
    }

    @When("the user attempts to access a protected section without logging in")
    public void theUserAttemptsToAccessAProtectedSectionWithoutLoggingIn() {
        page.accessProtectedSectionWithoutLogin();
    }

    @Then("the system should automatically redirect the user to the login screen")
    public void theSystemShouldAutomaticallyRedirectTheUserToTheLoginScreen() {
        Assert.assertTrue(page.isAtLoginPage());
    }
}