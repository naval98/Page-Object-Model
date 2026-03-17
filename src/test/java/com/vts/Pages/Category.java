package com.vts.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Category {

	WebDriver driver;

	public Category(WebDriver driver) {
		this.driver = driver;
	}

	private By Cartpage = By.xpath("//div[@class='master-wrapper-content']//div[1]//div[1]//div[2]//div[3]//div[2]//input[1]");


	//Reusable Method
	public void clickonCategory() {
		driver.findElement(Cartpage).click();
	}




}
