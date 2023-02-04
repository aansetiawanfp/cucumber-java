package com.tia.cucumber.utils;

public enum TestScenario {

	T1("User valid login"),
	T2("User create order success");
	
	private String testName;
	
	TestScenario(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
	
}
