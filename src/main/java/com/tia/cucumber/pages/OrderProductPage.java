package com.tia.cucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.tia.cucumber.drivers.DriverSingleton;
import com.tia.cucumber.utils.Constants;

public class OrderProductPage {
	private WebDriver driver;
	
	public OrderProductPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
	
	@FindBy(xpath = Constants.productOneID)
	WebElement selectProduct;
	
	@FindBy(id = Constants.sizeID)
	WebElement selectSize;
	
	@FindBy(id = Constants.colorID)
	WebElement selectColor;
	
	@FindBy(xpath = Constants.quantityIncreaseID)
	WebElement addQuantity;
	
	@FindBy(xpath = Constants.addToCardID)
	WebElement addToCart;
	
	@FindBy(xpath = Constants.viewCartID)
	WebElement viewCart;
	
	@FindBy(xpath = Constants.proccedToCheckoutID)
	WebElement proccedToCheckout;
	
	@FindBy(id = Constants.firstNameID)
	WebElement inputFirstName;
	
	@FindBy(id = Constants.lastNameID)
	WebElement inputLastName;
	
	@FindBy(id = Constants.countryID)
	WebElement selectCountry;
	
	@FindBy(id = Constants.streetAddressID)
	WebElement inputstreetAddress;
	
	@FindBy(id = Constants.cityID)
	WebElement inputCity;
	
	@FindBy(id = Constants.provinceID)
	WebElement selectProvince;
	
	@FindBy(id = Constants.postCodeID)
	WebElement inputPostCode;
	
	@FindBy(id = Constants.phoneID)
	WebElement inputPhone;
	
	@FindBy(id = Constants.emailID)
	WebElement inputEmail;
	
	@FindBy(id = Constants.termsID)
	WebElement checkTnC;
	
	@FindBy(id = Constants.placeOrderID)
	WebElement placeOrder;
	
	@FindBy(xpath = Constants.textValidationOrderID)
	WebElement textValidationOrderDone;
	
	public void selectProduct() {
		selectProduct.click();
	}
	
	public void selectProductDetail() {
		new Select(selectColor).selectByVisibleText(Constants.colorSelectedID);
		new Select(selectSize).selectByVisibleText(Constants.sizeSelectedID);		
	}
	
	public void clickAddQuantity() {
		addQuantity.click();
	}
	public void clickAddToCart() {
		addToCart.click();
	}
	public void clickViewCart() {
		viewCart.click();
	}
	public void clickProccedToCheckout() {
		proccedToCheckout.click();
	}
	public void inputName() {
		inputFirstName.sendKeys(Constants.firstName);
		inputLastName.sendKeys(Constants.lastName);
	}
	public void inputAddress() {
		new Select(selectCountry).selectByVisibleText(Constants.countryName);
		inputstreetAddress.sendKeys(Constants.streetAddress);
		inputCity.sendKeys(Constants.city);
		new Select(selectProvince).selectByVisibleText(Constants.provinceName);
		inputPostCode.sendKeys(Constants.postCode);
	}
	public void inputContanct() {
		inputPhone.sendKeys(Constants.phone);
		inputEmail.sendKeys(Constants.email);
	}
	public void clickcheckTnC() {
		checkTnC.click();
	}
	public void clickplaceOrder() {
		placeOrder.click();
	}
	
	public String getTextValidationOrderDone() {
		return textValidationOrderDone.getText();
	}
}
