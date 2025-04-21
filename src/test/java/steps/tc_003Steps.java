package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

import pages.tc_003Page;

public class tc_003Steps {

    tc_003Page uploadPage = new tc_003Page();

    @Given("I access the document upload module")
    public void i_access_the_document_upload_module() {
        assertTrue("Upload module should load", uploadPage.openUploadModule());
    }

    @When("I select a large PDF file over 50MB")
    public void i_select_a_large_PDF_file_over_50MB() {
        assertTrue("File selection should be successful", uploadPage.selectLargePDFFile());
    }

    @Then("the system should verify file size and display a warning")
    public void the_system_should_verify_file_size_and_display_a_warning() {
        assertTrue("System should display size warning", uploadPage.isFileSizeWarningDisplayed());
    }

    @When("I try to upload the large file")
    public void i_try_to_upload_the_large_file() {
        uploadPage.attemptToUploadFile();
    }

    @Then("the system should deny the upload and inform the user about the limit")
    public void the_system_should_deny_the_upload_and_inform_the_user_about_the_limit() {
        assertTrue("System should deny upload and notify user", uploadPage.isUploadDeniedNotificationDisplayed());
    }
}