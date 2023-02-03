package com.tia.cucumber.drivers.strategies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.tia.cucumber.utils.Constants;

public class Chrome implements DriverStrategy {
    public WebDriver setStrategy() {
        System.setProperty(Constants.chromeDriverApp, Constants.chromeDriverLocation);
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("useAutomationExtension", false);
        options.addArguments("--no-sandbox");

        return new ChromeDriver(options);
    }
}
