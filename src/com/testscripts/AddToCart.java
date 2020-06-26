package com.testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.objectrepository.Homepage;

import genriclib.Base;

public class AddToCart extends Base {
@Test
public void addToCartTest() throws Throwable, Throwable {
	Homepage hp=PageFactory.initElements(driver, Homepage.class);
	//WebDriverWait wait=new WebDriverWait(driver, 10);
	//wait.until(ExpectedConditions.elementToBeClickable(hp.getSearchBox())).click();
	hp.getSearchBox().sendKeys(fl.getDataFromExcel(excel, 1, 0, "Sheet1"));
	
}
}
