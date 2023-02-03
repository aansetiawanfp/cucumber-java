package com.tia.cucumber.step_definitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.tia.cucumber.pages.OrderProductPage;
import com.tia.cucumber.utils.Constants;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestOrderProduct {
	
	private static WebDriver driver;
    private OrderProductPage orderProductPage = new OrderProductPage();

    public TestOrderProduct() {
        driver = Hooks.driver;
    }
    
    @When("User go to Website Shop")
    public void user_go_to_website_shop() {
        driver.get(Constants.baseUrl+Constants.pathShop);
    }

    @And("User select the product")
    public void user_select_the_product() {
    	orderProductPage.selectProduct();
    }
    
    @And("User select the color and size")
    public void user_select_the_color_and_size() {
    	orderProductPage.selectProductDetail();
    }
    
    @And ("User add quantity")
    public void user_add_quantity() {
    	orderProductPage.clickAddQuantity();
    }
    @And ("User click ADD TO CART button")
    public void user_click_ADD_TO_CART_button() {
    	orderProductPage.clickAddToCart();
    }
    @And ("User click VIEW CART button")
    public void user_click_VIEW_CART_button() {
    	orderProductPage.clickViewCart();
    }
    @And ("User click PROCCED TO CHECKOUT button")
    public void user_click_PROCCED_TO_CHECKOUT_button() {
    	orderProductPage.clickProccedToCheckout();
    }
    @And ("User input name")
    public void user_input_name() {
    	orderProductPage.inputName();
    }
    @And ("User input address")
    public void user_input_address() {
    	orderProductPage.inputAddress();
    }
    @And ("User input contact")
    public void user_input_contact() {
    	orderProductPage.inputContanct();
    }
    @And ("User click TnC checkbox")
    public void user_click_TnC_checkbox() {
    	orderProductPage.clickcheckTnC();
    }
    @And ("User click PLACE ORDER")
    public void user_click_PLACE_ORDER() {
    	orderProductPage.clickplaceOrder();
    }
    @Then ("The order is succeed")
    public void the_order_is_succeed() {
        Assert.assertEquals(orderProductPage.getTextValidationOrderDone(),Constants.expectedOrderDone);
    }
    
}
