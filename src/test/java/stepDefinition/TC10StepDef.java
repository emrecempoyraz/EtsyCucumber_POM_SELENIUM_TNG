package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.Locators;
import utilities.Log;

import java.util.ArrayList;
import java.util.List;

public class TC10StepDef {

    Locators locators = new Locators();
    String itemName ;

    @And("user clicks collection")
    public void user_clicks_collection() {
        Log.startTestCase("Edit collection testing");
        itemName = locators.collectionItem.getText();
        locators.collectionItem.click();
    }

    @And("user clicks edit menu")
    public void user_clicks_edit_menu() throws InterruptedException {
        Thread.sleep(2000);
        locators.editButton.click();
    }

    @And("user clicks delete collection button")
    public void user_clicks_delete_collection_button() throws InterruptedException {
       locators.deleteButton.click();
       Thread.sleep(2000);
       locators.deleteAccept.click();
       Thread.sleep(2000);
    }

    @Then("user verifies that collection is deleted")
    public void user_verifies_that_collection_is_deleted() {
        List <String> collectionList = new ArrayList<>();
        for (int i = 0; i<locators.collectionList.size(); i++){
            collectionList.add(locators.collectionList.get(i).getText());
        }
        int counter = 0 ;
        for (int i = 0; i<locators.collectionList.size(); i++) {
            if (locators.collectionList.get(i).getText().equals(itemName)){
               counter++;
            }
        }

        Assert.assertEquals(0, counter);
        Log.endTestCase("edit collection testing");
    }
}
