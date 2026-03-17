package com.vts.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Checkoutpage {

	WebDriver driver;

	public Checkoutpage(WebDriver driver) {
		this.driver = driver;
	}

	private By Shoppingcart = By.xpath("//span[normalize-space()='Shopping cart']");


	//Reusable Method
	public void clickonShoppingcart() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(Shoppingcart)).click();
	}


}
