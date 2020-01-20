package com.TestScripts;

import java.sql.Driver;

import org.testng.annotations.Test;

import com.pages.TripAdvisor;
import com.utility.BaseClass;

public class TestCase101 extends BaseClass{
    @Test
	public void caseTc101 () throws Exception{
    	BaseClass.openBrowser();
	    TripAdvisor.openTripAdvisor();  
	    BaseClass.closeApp();
	  
  }
}
