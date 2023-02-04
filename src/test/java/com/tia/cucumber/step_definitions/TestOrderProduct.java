package com.tia.cucumber.step_definitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.tia.cucumber.pages.OrderProductPage;
import com.tia.cucumber.utils.Constants;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestOrderProduct {
	
	private static WebDriver driver;
	private static ExtentTest extentTest;
    private OrderProductPage orderProductPage = new OrderProductPage();

    public TestOrderProduct() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    
    @When(Constants.testOrderProductWhen)
    public void testOrderProductWhen() {
        driver.get(Constants.baseUrl+Constants.pathShop);
        Hooks.delay(Constants.DETIK);
        extentTest.log(LogStatus.PASS, Constants.testOrderProductWhen);
    }

    @And(Constants.testOrderProductAndOne)
    public void testOrderProductAndOne() {
    	orderProductPage.selectProduct();
    	Hooks.delay(Constants.DETIK);
        extentTest.log(LogStatus.PASS, Constants.testOrderProductAndOne);
    }
    
    @And(Constants.testOrderProductAndTwo)
    public void testOrderProductAndTwo() {
    	orderProductPage.selectProductDetail();
    	Hooks.delay(Constants.DETIK);
        extentTest.log(LogStatus.PASS, Constants.testOrderProductAndTwo);
    }
    
    @And (Constants.testOrderProductAndThree)
    public void testOrderProductAndThree() {
    	orderProductPage.clickAddQuantity();
    	Hooks.delay(Constants.DETIK);
        extentTest.log(LogStatus.PASS, Constants.testOrderProductAndThree);
    }
    
    @And (Constants.testOrderProductAndFour)
    public void testOrderProductAndFour() {
    	orderProductPage.clickAddToCart();
    	Hooks.delay(Constants.DETIK);
        extentTest.log(LogStatus.PASS, Constants.testOrderProductAndFour);
    }
    
    @And (Constants.testOrderProductAndFive)
    public void testOrderProductAndFive() {
    	orderProductPage.clickViewCart();
    	Hooks.delay(Constants.DETIK);
        extentTest.log(LogStatus.PASS, Constants.testOrderProductAndFive);
    }
    
    @And (Constants.testOrderProductAndSix)
    public void testOrderProductAndSix() {
    	orderProductPage.clickProccedToCheckout();
    	Hooks.delay(Constants.DETIK);
        extentTest.log(LogStatus.PASS, Constants.testOrderProductAndSix);
    }
    
    @And (Constants.testOrderProductAndSeven)
    public void testOrderProductAndSeven() {
    	orderProductPage.inputName();
    	Hooks.delay(Constants.DETIK);
        extentTest.log(LogStatus.PASS, Constants.testOrderProductAndSeven);
    }
    
    @And (Constants.testOrderProductAndEight)
    public void testOrderProductAndEight() {
    	orderProductPage.inputAddress();
    	Hooks.delay(Constants.DETIK);
        extentTest.log(LogStatus.PASS, Constants.testOrderProductAndEight);
    }
    
    @And (Constants.testOrderProductAndNine)
    public void testOrderProductAndNine() {
    	orderProductPage.inputContanct();
        extentTest.log(LogStatus.PASS, Constants.testOrderProductAndNine);
    }
    
    @And (Constants.testOrderProductAndTen)
    public void testOrderProductAndTen() {
    	orderProductPage.clickcheckTnC();
    	Hooks.delay(Constants.DETIK);
        extentTest.log(LogStatus.PASS, Constants.testOrderProductAndTen);
    }
    
    @And (Constants.testOrderProductAndEleven)
    public void testOrderProductAndEleven() {
    	orderProductPage.clickplaceOrder();
    	Hooks.delay(Constants.DETIK);
        extentTest.log(LogStatus.PASS, Constants.testOrderProductAndEleven);
    }
    
    @Then (Constants.testOrderProductThen)
    public void testOrderProductThen() {
        Assert.assertEquals(orderProductPage.getTextValidationOrderDone(),Constants.expectedOrderDone);
        Hooks.delay(Constants.DETIK);
        extentTest.log(LogStatus.PASS, Constants.testOrderProductThen);
    }
    
}
