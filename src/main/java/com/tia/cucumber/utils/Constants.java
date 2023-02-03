package com.tia.cucumber.utils;

public class Constants {

	public static final int TIMEOUT = 10;
    public static final String CHROME = "Chrome";
    public static final String FIREFOX = "Firefox";
    public static final int DETIK = 1;
    
 // Parameter Url - start
 	public static final String chromeDriverApp = "webdriver.chrome.driver";
 	public static final String chromeDriverLocation = "C:\\Driver Tools\\chromedriver.exe";
 	public static final String firefixDriverApp = "webdriver.gecko.driver";
 	public static final String firefoxDriverLocation = "C:\\Tools\\geckodriver.exe";
 	public static final String baseUrl = "https://shop.demoqa.com";
 	public static final String pathLogin = "/my-account/";
 	public static final String pathShop = "/shop/";
 // Parameter Url - end
 	
 // Parameter data input - start
 	public static final String username = "aansetiawan";
 	public static final String password = "TIAFaspayQA2023";
 	public static final String firstName = "aan";
 	public static final String lastName = "setiawan";
 	public static final String streetAddress = "Jalan Pintu Air";
 	public static final String city = "Jakarta Pusat";
 	public static final String postCode = "54323";
 	public static final String phone = "6285987654321";
 	public static final String email = "aanfaspay2022@gmail.com";
 // Parameter data input - end
 	
 //Element - start
 	public static final String usernameID = "username";
 	public static final String passwordID = "password";
 	public static final String buttonLoginID = "//*[@id=\"customer_login\"]/div[1]/form/p[3]/button";
 	public static final String remembermeID = "rememberme";
 	public static final String textValidationLoginID = "//*[@id=\"post-8\"]/div/div/div/p[1]/a";
 	public static final String productOneID = "//*[@id=\"noo-site\"]/div[2]/div[2]/div/div/div[3]/div/h3/a";
 	public static final String colorID = "pa_color";
 	public static final String colorSelectedID = "Black";
 	public static final String sizeID = "pa_size";
 	public static final String sizeSelectedID = "37";
 	public static final String quantityIncreaseID = "//*[@id=\"product-1281\"]/div[1]/div[2]/form/div/div[2]/div/div/button[2]";
 	public static final String addToCardID = "//*[@id=\"product-1281\"]/div[1]/div[2]/form/div/div[2]/button";
 	public static final String viewCartID = "//*[@id=\"noo-site\"]/div[2]/div/div/div[1]/div/a";
 	public static final String proccedToCheckoutID = "//*[@id=\"post-6\"]/div/div/div[2]/div[2]/div/a";
 	public static final String firstNameID = "billing_first_name";
 	public static final String lastNameID = "billing_last_name";
 	public static final String countryID = "billing_country";
 	public static final String countryName = "Indonesia";
 	public static final String streetAddressID = "billing_address_1";
 	public static final String cityID = "billing_city";
 	public static final String provinceID = "billing_state";
 	public static final String provinceName = "DKI Jakarta";
 	public static final String postCodeID = "billing_postcode";
 	public static final String phoneID = "billing_phone";
 	public static final String emailID = "billing_email";
 	public static final String termsID = "terms";
 	public static final String placeOrderID = "place_order";
 	public static final String textValidationOrderID = "//*[@id=\"post-7\"]/div/div/div/p[1]";
 //Element end
 	
 //Expected Result - start
 	public static final String expectedLogin = "Log out";
 	public static final String expectedAddToCart = "View cart";
 	public static final String expectedViewCart = "PROCEED TO CHECKOUT";
 	public static final String expectedOrderDone = "Thank you. Your order has been received.";
 //Expected Result - end
	
}
