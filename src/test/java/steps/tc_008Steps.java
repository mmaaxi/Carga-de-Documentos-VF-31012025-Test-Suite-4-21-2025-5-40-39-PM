package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.*;
import pages.tc_008Page;

public class tc_008Steps {
    private WebDriver driver;
    private tc_008Page page;

    public tc_008Steps() {
        this.driver = Hooks.getDriver();
        this.page = PageFactory.initElements(driver, tc_008Page.class);
    }

    @Given("I access the upload module")
    public void i_access_the_upload_module() {
        page.navigateToUploadModule();
    }

    @When("I start the upload process of a PDF document")
    public void i_start_the_upload_process_of_a_pdf_document() {
        page.startUploadProcess();
    }

    @Then("The upload process starts and progress is displayed on the screen")
    public void the_upload_process_starts_and_progress_is_displayed_on_the_screen() {
        page.verifyUploadStarted();
    }

    @When("I simulate a network interruption during the upload")
    public void i_simulate_a_network_interruption_during_the_upload() {
        page.simulateNetworkInterruption();
    }

    @Then("The upload process is abruptly interrupted and an error message is displayed")
    public void the_upload_process_is_abruptly_interrupted_and_an_error_message_is_displayed() {
        page.verifyUploadInterrupted();
    }

    @When("I retry uploading the same document after the connection is restored")
    public void i_retry_uploading_the_same_document_after_the_connection_is_restored() {
        page.retryUpload();
    }

    @Then("The system allows the resumption or restart of the upload process without duplicating records")
    public void the_system_allows_the_resumption_or_restart_of_the_upload_process_without_duplicating_records() {
        page.verifySuccessfulRetry();
    }
}