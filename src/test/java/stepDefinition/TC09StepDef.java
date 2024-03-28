package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.Locators;
import utilities.Log;

import java.util.ArrayList;
import java.util.List;

public class TC09StepDef {

    Locators locators = new Locators();

    @And("user clicks favorites button")
    public void user_clicks_favorites_button() throws InterruptedException {
        Log.startTestCase("Create collection testing");
        Thread.sleep(2000);
        locators.profile1.click();
        locators.profile2.click();
    }

    @And("user clicks create collection button")
    public void user_clicks_create_collection_button() throws InterruptedException {
        Thread.sleep(2000);
        locators.createCollection.click();
    }

    @And("user sends collection name {string} and clicks create button")
    public void user_sends_collection_name_and_clicks_create_button(String collectionName) throws InterruptedException {
        Thread.sleep(2000);
        locators.collectionName.sendKeys(collectionName);
        locators.collectionOK.click();
    }

    @Then("user verifies that the collection of {string} exists")
    public void user_verifies_that_the_collection_of_exists(String collectionName) {

        List <String> collectionList = new ArrayList<>();
        for (int i = 0; i<locators.collectionList.size(); i++){
            collectionList.add(locators.collectionList.get(i).getText());
        }
        int counter = 0;
        for (int i = 0; i<locators.collectionList.size(); i++){
            if (locators.collectionList.get(i).getText().equals(collectionName)){
                counter++;
            }
        }

        Assert.assertEquals(1, counter);
        Log.endTestCase("Create collection testing");
    }
}
