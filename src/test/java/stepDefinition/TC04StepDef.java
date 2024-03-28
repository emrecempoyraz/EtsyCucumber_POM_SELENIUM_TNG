package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.Locators;
import utilities.Log;

public class TC04StepDef {

    Locators locators = new Locators();

    @And("user selects {string} sort filter ascending by product listed")
    public void userSelectSortFilterAscendingByProductListed(String sorting) {

        Log.startTestCase("Sorting Test");
        locators.sortBy.click();
        for (int i = 0; i<locators.sortMenu.size(); i++){
            if (locators.sortMenu.get(i).getText().equals(sorting)){
                locators.sortMenu.get(i).click();
            }
        }
        Log.info("sorting asc");
    }


    @Then("user verifies that products aren't listed in ascending order")
    public void userVerifiesThatProductsArentListedInAscendingOrder() throws InterruptedException {
        Thread.sleep(5000);
        double a = Double.parseDouble(locators.sortingResultList.get(0).getText());
        double b = Double.parseDouble(locators.sortingResultList.get(1).getText());
        System.out.println(a + "   " + b);
        Assert.assertFalse(a >= b);
        Log.endTestCase("Sorting Test");
    }
}
