package com.tia.cucumber.step_definitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.tia.cucumber.pages.LoginPage;
import com.tia.cucumber.utils.Constants;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestLogin {

	private static WebDriver driver;
	private static ExtentTest extentTest;
    private LoginPage loginPage = new LoginPage();

    public TestLogin() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    
    @When(Constants.testLoginWhen)
    public void testLoginWhen() {
        driver.get(Constants.baseUrl+Constants.pathLogin);
        Hooks.delay(Constants.DETIK);
        extentTest.log(LogStatus.PASS, Constants.testLoginWhen);
    }

    @And(Constants.testLoginAndOne)
    public void testLoginAndOne() {
        loginPage.inputUsername(Constants.username);
        Hooks.delay(Constants.DETIK);
        extentTest.log(LogStatus.PASS, Constants.testLoginAndOne);
    }
    
    @And(Constants.testLoginAndTwo)
    public void testLoginAndTwo() {
        loginPage.inputPassword(Constants.password);
        Hooks.delay(Constants.DETIK);
        extentTest.log(LogStatus.PASS, Constants.testLoginAndTwo);
    }

    @And(Constants.testLoginAndThree)
    public void testLoginAndThree() {
        loginPage.clickRememberMe();
        Hooks.delay(Constants.DETIK);
        extentTest.log(LogStatus.PASS, Constants.testLoginAndThree);
    }
    
    @And(Constants.testLoginAndFour)
    public void testLoginAndFour() {
        loginPage.clickBtnLogin();
        Hooks.delay(Constants.DETIK);
        extentTest.log(LogStatus.PASS, Constants.testLoginAndFour);
    }

    @Then(Constants.testLoginThen)
    public void testLoginThen() {
        Assert.assertEquals(loginPage.getTextValidationLogin(),Constants.expectedLogin);
        Hooks.delay(Constants.DETIK);
        extentTest.log(LogStatus.PASS, Constants.testLoginThen);
    }
    
}
