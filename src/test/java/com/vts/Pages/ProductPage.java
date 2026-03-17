package com.vts.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

	WebDriver driver;

	public ProductPage(WebDriver driver) {
		this.driver = driver;
	}

	private By computerpage = By.xpath("//ul[@class='top-menu']//a[normalize-space()='Computers']");
	private By Desktoppage = By.xpath("//img[@title='Show products in category Desktops']");


	//reusable Method
	public void Clickoncomputerpage() {
		driver.findElement(computerpage).click();
	}

	public void clickonDesktoppage() {
		driver.findElement(Desktoppage).click();
	}

}
