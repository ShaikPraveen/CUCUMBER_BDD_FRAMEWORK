package com.stepDefinations;

import com.utility.SeleniumDriver;

import cucumber.api.java.Before;

public class BeforeActions 
{
	@Before
	public void setup()
	{
		SeleniumDriver.setUp();
	}

}
