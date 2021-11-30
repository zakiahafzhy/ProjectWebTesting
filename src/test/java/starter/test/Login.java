package starter.test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.steps.LoginSteps;

public class Login {
    @Steps
    LoginSteps loginSteps;

    @Given("I am on the Login page")
    public void i_am_on_the_Login_page() {
        loginSteps.openHomePage();
        loginSteps.openLoginPage();
    }

    @When("I enter my username and Password correctly")
    public void i_enter_my_username_and_Password_correctly() {
        loginSteps.inputAccountValid();
    }

    @When("I click {string} button Success")
    public void i_click_button_Success(String string) {
        loginSteps.clickLogin2();
    }

    @Then("I am taken to the dashboard")
    public void i_am_taken_to_the_dashboard() {

    }
}
