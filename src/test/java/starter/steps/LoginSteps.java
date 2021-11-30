package starter.steps;

import starter.pages.LoginPage;

public class LoginSteps {

    LoginPage loginPage;

    public void openHomePage() {
        loginPage.open();
    }

    public void openLoginPage() {
        loginPage.clickButtonLogin();
    }

    public void inputAccountValid() {
        loginPage.inputUserNamePassValid();
    }

    public void clickLogin2() {
        loginPage.clickLogin2();
    }

}
