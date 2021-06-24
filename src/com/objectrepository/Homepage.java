package com.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage {
	@FindBy(xpath="//select[@id='searchDropdownBox']")
	private WebElement categories;
	
	@FindBy(xpath="//a[@aria-label='Open Menu']")
	private WebElement moreMenu;
	
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	private WebElement searchBox;
	
	@FindBy(xpath="//a[@id='nav-cart']")
	private WebElement cart;
	
	@FindBy(xpath="//span[@class='a-dropdown-prompt'")
	private WebElement filter;
	
	@FindBy(xpath="//a[text()='Price: Low to High']")
	private WebElement lowToHigh;
	
	@FindBy(xpath = "//div[@class=\"rush-component s-expand-height\" and @data-component-id=\"11\"]")
	private WebElement raybanfirst;
	
	@FindBy(id ="add-to-cart-button")
	private WebElement addToCart;
	
	public WebElement getAddToCart() {
		return addToCart;
	}
	public WebElement getRaybanFirst() {
		return raybanfirst;
	}
	
	public WebElement getCategories() {
		return categories;
	}

	public WebElement getMoreMenu() {
		return moreMenu;
	}

	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getCart() {
		return cart;
	}

	public WebElement getFilter() {
		return filter;
	}

	public WebElement getLowToHigh() {
		return lowToHigh;
	}
}
