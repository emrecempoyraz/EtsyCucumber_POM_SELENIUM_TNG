package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import pages.Locators;
import utilities.Driver;
import utilities.Log;

public class TC08StepDef {

    Locators locators = new Locators();

    @Given("user click to region settings")
    public void user_click_to_region_settings() {
        Log.startTestCase("user clicks the region settings");
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        String button = "document.getElementById('locale-picker-trigger').click()";
        js.executeScript(button);
    }

    @And("user selects region {string}")
    public void user_selects_region(String region) {

        Select select = new Select(locators.region);
        select.selectByVisibleText(region);
    }

    @And("user selects language {string}")
    public void user_selects_language(String language) {
        Select select = new Select(locators.language);
        select.selectByVisibleText(language);
    }

    @And("user selects currency {string}")
    public void user_selects_currency(String currency) {
        Select select = new Select(locators.currency);
        select.selectByValue(currency);
    }

    @Then("user verifies that the page is loaded with the correct region option {string}")
    public void user_verifies_that_the_page_is_loaded_with_the_correct_region_option(String currencySymbol) throws InterruptedException {
       locators.saveButton.click();
       Thread.sleep(2000);
        Assert.assertTrue(locators.currencySymbol.getText().equals(currencySymbol));
        Log.endTestCase("Location testing");
    }
}
