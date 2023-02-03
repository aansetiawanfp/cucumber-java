package com.tia.cucumber.step_definitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.tia.cucumber.pages.LoginPage;
import com.tia.cucumber.utils.Constants;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestLogin {

	private static WebDriver driver;
    private LoginPage loginPage = new LoginPage();

    public TestLogin() {
        driver = Hooks.driver;
    }
    
    @When("User go to Website")
    public void user_go_to_Website() {
        driver.get(Constants.baseUrl+Constants.pathLogin);
    }

    @And("User enter username")
    public void user_enter_username() {
        loginPage.inputUsername(Constants.username);
    }
    
    @And("User enter password")
    public void user_enter_password() {
        loginPage.inputPassword(Constants.password);
    }

    @And("User click remember me")
    public void user_click_remember_me() {
        loginPage.clickRememberMe();
    }
    
    @And("User click button login")
    public void user_click_button_login() {
        loginPage.clickBtnLogin();
    }

    @Then("User valid credentials")
    public void user_invalid_credentials() {
        Assert.assertEquals(loginPage.getTextValidationLogin(),Constants.expectedLogin);
    }
    
}
