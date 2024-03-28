package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.Locators;
import utilities.Driver;
import utilities.Log;

import java.util.ArrayList;
import java.util.List;

public class TC05StepDef {

    Locators locators = new Locators();
    Actions actions = new Actions(Driver.getDriver());

    @Then("user selects Jewelry & Accessories menu")
    public void userSelectsJewelryAccessoriesMenu() throws InterruptedException {
        Log.startTestCase("Categories testing");
        actions.moveToElement(locators.mainMenu).perform();
        Thread.sleep(1000);
    }

    @And("user selects Bags & Purses sub menu")
    public void userSelectsBagsPursesSubMenu() throws InterruptedException {
       actions.moveToElement(locators.subMenu).perform();
       Thread.sleep(1000);
       Log.info("selecting categories");
    }

    @Then("user assert that sub categories contain {string} , {string} , {string}")
    public void userAssertThatSubCategoriesContain(String string, String string2, String string3) {
        List <String> productList = new ArrayList<>();
        productList.add(string);
        productList.add(string2);
        productList.add(string3);

        List <String> subCategoriesList = new ArrayList<>();
        for (int i = 0; i<locators.subCategories.size(); i++) {
            subCategoriesList.add(locators.subCategories.get(i).getText().trim());
        }
        Assert.assertTrue(subCategoriesList.containsAll(productList));
        Log.endTestCase("Categories testing");
    }
}
