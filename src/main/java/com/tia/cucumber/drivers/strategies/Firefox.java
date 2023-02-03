package com.tia.cucumber.drivers.strategies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.tia.cucumber.utils.Constants;

public class Firefox implements DriverStrategy {

	public WebDriver setStrategy() {
        System.setProperty(Constants.firefixDriverApp,Constants.firefoxDriverLocation);
        WebDriver driver = new FirefoxDriver();
        return driver;
    }
	
}
