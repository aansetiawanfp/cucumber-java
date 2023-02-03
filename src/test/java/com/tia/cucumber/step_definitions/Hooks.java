package com.tia.cucumber.step_definitions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.tia.cucumber.drivers.DriverSingleton;
import com.tia.cucumber.utils.Constants;

import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;

public class Hooks {

	public static WebDriver driver;

    @Before
    public void setUp() {
        DriverSingleton.getInstance(Constants.CHROME);
        driver = DriverSingleton.getDriver();
    }

    @AfterAll
    public static void closeBrowser() {
        delay(3);
        DriverSingleton.closeObjectInstance();
    }

    public static void delay(int detik) {
        try {
            Thread.sleep(1000*detik);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void scroll(int vertical) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,"+vertical+")");
    }
    
}
