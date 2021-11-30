package starter.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class LoginPage extends PageObject {
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div/div[6]/div")
    WebElement iconBookStore;

    public void clickIconBookStore(){
//        waitForCondition().until(ExpectedCondition.elementToBeClickable(iconBookStore));
        iconBookStore.click();
    }

    @FindBy(id = "login")
    WebElement buttonLogin;
    public void clickButtonLogin() {
        buttonLogin.click();
    }

    @FindBy(id = "userName")
    WebElement inputUserName;

    @FindBy(id = "password")
    WebElement inputPass;

    @FindBy(id ="login")
    WebElement buttonLogin2;

    public void inputUserNamePassValid() {
        inputUserName.sendKeys("Zakia123");
        inputPass.sendKeys("P@ssword123");
    }

    public void clickLogin2() {
        buttonLogin2.click();
    }
}
