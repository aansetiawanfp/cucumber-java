package com.tia.cucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tia.cucumber.drivers.DriverSingleton;
import com.tia.cucumber.utils.Constants;

public class LoginPage {

	private WebDriver driver;

    public LoginPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(id = Constants.usernameID)
    WebElement inputUsername;
    
    @FindBy(id = Constants.passwordID)
    WebElement inputPassword;
    
	@FindBy(xpath = Constants.buttonLoginID)
	WebElement btnLogin;
	
	@FindBy(id = Constants.remembermeID)
	WebElement rememberMeCheckbox;
	
	@FindBy(xpath = Constants.textValidationLoginID)
	WebElement textValidationLogin;
	
	public void inputUsername(String username) {
		inputUsername.sendKeys(username);
	}
	
	public void inputPassword(String password) {
		inputPassword.sendKeys(password);
	}
	
	public void clickRememberMe() {
		rememberMeCheckbox.click();
	}
		
	public void clickBtnLogin() {
		btnLogin.click();
	}
	
	public String getTextValidationLogin() {
		return textValidationLogin.getText();
	}
	
}
