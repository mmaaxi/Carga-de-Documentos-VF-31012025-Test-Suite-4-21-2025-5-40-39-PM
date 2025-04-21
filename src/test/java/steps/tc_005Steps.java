package steps;

import pages.tc_005Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertTrue;

public class tc_005Steps {
    tc_005Page page = new tc_005Page();

    @Given("^the user uploads a valid PDF document in the upload module$")
    public void the_user_uploads_a_valid_pdf_document() {
        page.uploadPDFDocument("path/to/valid/document.pdf");
        assertTrue(page.isDocumentUploaded());
    }

    @When("^the user selects the preview option for the uploaded document$")
    public void the_user_selects_preview_option() {
        page.clickPreviewOption();
    }

    @Then("^the system displays a readable preview of the document$")
    public void the_system_displays_a_readable_preview() {
        assertTrue(page.isPreviewDisplayed());
    }

    @Then("^the preview shows the PDF content correctly, divided into pages without rendering errors$")
    public void the_preview_shows_content_correctly() {
        assertTrue(page.isContentRenderedCorrectly());
    }
}