package com.TestScripts;

import org.testng.annotations.Test;

import com.pages.Amazon;
import com.pages.Flipkart;
import com.utility.BaseClass;

public class Tc_101{

	@Test
	  public void case_101 () throws Exception{
		  
		  BaseClass.openBrowser();
		  Amazon.openAmazon();
		  Flipkart.openFlipkart();
          BaseClass.compare();
          BaseClass.closeApp();
	  }
}
