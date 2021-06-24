package com.assignment.testScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ComparePrice {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iPhone 12 (64GB) - RED",Keys.ENTER);
		String AmazonPrice = driver.findElement(By.xpath("//span[text()='New Apple iPhone 12 (64GB) - (Product) RED']/ancestor::div[@class='a-section a-spacing-none']/following-sibling::div[@class='sg-row']/descendant::span[@class='a-price-whole']")).getText();
		System.out.println("Amazon Price==> "+AmazonPrice);
		driver.get(" https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.name("q")).sendKeys("iPhone 12 (64GB) - RED",Keys.ENTER);
		String fp = driver.findElement(By.xpath("//div[text()='APPLE iPhone 12 (Red, 64 GB)']/parent::div/following-sibling::div/descendant::div[@class='_30jeq3 _1_WHN1']")).getText();
		String FlipkartPrice = fp.substring(1);
		System.out.println("Flipkart Price==> "+FlipkartPrice);
		int f=Integer.parseInt(FlipkartPrice.replaceAll(",", "0"));
		int a=Integer.parseInt(AmazonPrice.replaceAll(",", "0"));
		if(f>a) {
			System.out.println("Amazon has lower price");
		}
		else {
			System.out.println("Flipkart has lower price");
		}
		driver.quit();
	}

}
