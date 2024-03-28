package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.Locators;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.Log;

public class TC01StepDef {

    Locators locators = new Locators();
    @Given("user goes to base url")
    public void userGoesToBaseUrl() {
        Log.startTestCase("SignIn");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @And("user clicks to sign in button")
    public void userClicksToSignInButton() {
        locators.signInButton.click();
    }

    @And("user clicks email area and enters valid email address")
    public void userClicksEmailAreaAndEntersValidEmailAddress() {
        Log.info("enters mail and password");
        locators.mailTextBox.click();
        locators.mailTextBox.sendKeys(ConfigReader.getProperty("email"));
    }

    @And("user enters valid password")
    public void userEntersValidPassword() {
        locators.mailTextBox.sendKeys(ConfigReader.getProperty("password"));
    }

    @And("user clicks sign in")
    public void userClicksSignIn() {
        locators.signIn.click();
    }
    @Then("user verifies that sees your profile")
    public void userVerifiesThatSeesProfile() throws InterruptedException {
        Log.info("verify");
        Thread.sleep(5000);

        Log.endTestCase("valid Sign In");
    }


    @And("user enters invalid password")
    public void userEntersInvalidPassword() {
        locators.passwordTextBox.sendKeys(ConfigReader.getProperty("invalidpassword"));
        Log.info("invalid password");
    }

    @Then("user verifies that sees fail message")
    public void userVerifiesThatSeesFailMessage() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(locators.failmessage.isDisplayed());
        Log.endTestCase("invalidSignin");
    }

    @Then("user signs out")
    public void userSignsOut() throws InterruptedException {
        Thread.sleep(2000);
        locators.profile1.click();
        locators.signOut.click();
    }
}
