package com.testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.objectrepository.Homepage;

import genriclib.Base;
import genriclib.CommonsUtil;

public class AddToCart extends Base {
@Test
public void addToCartTest() throws Throwable, Throwable {
	Homepage hp=PageFactory.initElements(driver, Homepage.class);
	hp.getSearchBox().sendKeys(fl.getDataFromExcel(excel, 1, 0, "Sheet1"),Keys.ENTER);
	Reporter.log("Searched for Rayban SunGlasses", true);
	hp.getRaybanFirst().click();
	Reporter.log("Clicked on first product of search result", true);
	CommonsUtil.switchWindow(driver);
	Reporter.log("Switched to new tab", true);
	hp.getAddToCart().click();
	Reporter.log("Product has been added to cart", true);
	
}
}
