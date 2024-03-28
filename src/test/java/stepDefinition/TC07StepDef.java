package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.Locators;
import utilities.Driver;
import utilities.Log;

public class TC07StepDef {

    Locators locators = new Locators();

    @And("user verifies to title")
    public void user_verifies_to_title() {
        Log.startTestCase("Verify links testing");
        Driver.getDriver().getTitle().contains("Etsy");
    }


    @Then("user selects submenus and checks the correctness of their titles")
    public void user_selects_submenus_and_checks_the_correctness_of_their_titles() throws InterruptedException {
        for (int i = 0; i<locators.menu.size();i++){
            String title = locators.menu.get(i).getText();
            locators.menu.get(i).click();
            Thread.sleep(1000);
            Assert.assertTrue(Driver.getDriver().getTitle().contains(title.trim()));
            Log.endTestCase("Verify links testing");
        }
    }
}
