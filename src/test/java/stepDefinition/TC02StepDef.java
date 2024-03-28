package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.Locators;
import utilities.Log;

public class TC02StepDef {

    Locators locators = new Locators();

    @And("clicks search text area and sends {string} for searching")
    public void clicksSearchTextAreaAndSendsForSearching(String searched) throws InterruptedException {
        Log.startTestCase("Search testing");
        Thread.sleep(2000);
        locators.searchBox.sendKeys(searched + Keys.ENTER);
        Log.info("searching");
    }

    @Then("user verifies that all listed records contain the {string}")
    public void userVerifiesThatAllListedRecordsContainThe(String searched) {
        for (int i = 0 ; i<locators.searchResult.size(); i++) {
            System.out.println(locators.searchResult.get(i).getText());
            String item = locators.searchResult.get(i).getText().toLowerCase();
            Assert.assertTrue(item.contains(searched.toLowerCase()));

            // fails when unexpected product found

            Log.endTestCase("Search testing");
        }
    }
}
