package com.sqa.ala.helpers;

import org.testng.annotations.*;

import com.sqa.ala.helpers.*;

public abstract class LoginTest extends BasicTest {

	public LoginTest(String baseUrl) {
		super(baseUrl);
	}

	public abstract void login();

	public abstract void logout();

	@Override
	@BeforeClass(enabled = true)
	public void setUpFirefox() throws Exception {
		super.setUpFirefox();
		login();
	}

	@Override
	@AfterClass
	public void tearDown() throws Exception {
		logout();
		getDriver().close();
	}
}
