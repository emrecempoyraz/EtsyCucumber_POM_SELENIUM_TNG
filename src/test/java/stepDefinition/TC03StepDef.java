package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.Locators;
import utilities.Driver;
import utilities.Log;
import utilities.Methods;

import java.util.Random;

public class TC03StepDef {

    Locators locators = new Locators();
    String productText ;
    String mainPageHandle ;

    @Given("user chooses a random product listed")
    public void user_chooses_a_random_product_listed() {
        Log.startTestCase("Select to product");
        Random rnd = new Random();
        int index = rnd.nextInt(locators.searchResult.size());
        productText = locators.searchResult.get(index).getText();
        mainPageHandle = Driver.getDriver().getWindowHandle();
        locators.searchResult.get(index).click();
    }


    @Then("user confirms that has seen the features of the product")
    public void user_confirms_that_has_seen_the_features_of_the_product() throws InterruptedException {
        System.out.println(productText);
        System.out.println("--------------------------");

        Driver.getDriver().switchTo().window(Methods.SwitchHandle(mainPageHandle));
        Thread.sleep(2000);
        System.out.println(locators.productText.getText());
        Assert.assertTrue(locators.productText.getText().contains(productText));
        Log.endTestCase("Select the product");
    }
}
