package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en_scouse.An;
import org.junit.Assert;
import pages.Locators;
import utilities.Driver;
import utilities.Log;
import utilities.Methods;

public class TC06StepDef {

    Locators locators = new Locators();
    String information ;
    String mainPageHandle ;


    @Given("user selects first item listed")
    public void user_selects_first_item_listed() {
        Log.startTestCase("Subcategories testing");
        information = locators.firstItemListed.getText();
        mainPageHandle = Driver.getDriver().getWindowHandle();
        locators.firstItemListed.click();
    }

    @And("user verifies that the properties of the selected item are displayed")
    public void user_verifies_that_the_properties_of_the_selected_item_are_displayed() throws InterruptedException {

        Driver.getDriver().switchTo().window(Methods.SwitchHandle(mainPageHandle));
        Thread.sleep(2000);
        System.out.println(information);
        System.out.println(locators.productProperties.getText());
        Assert.assertTrue(information.contains(locators.productProperties.getText()));
    }

    @And("user clicks add to cart button")
    public void user_clicks_add_to_cart_button() {
        locators.addToCartButton.click();
    }

    @Then("user confirms that the product is in the cart")
    public void user_confirms_that_the_product_is_in_the_cart() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(locators.title.isDisplayed());
        Log.endTestCase("Subcategories testing");
    }
}
