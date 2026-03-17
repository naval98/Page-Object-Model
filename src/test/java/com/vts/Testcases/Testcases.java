package com.vts.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.vts.Pages.CartPage;
import com.vts.Pages.Category;
import com.vts.Pages.Checkoutpage;
import com.vts.Pages.ProductPage;
import com.vts.Pages.RegisterPage;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcases {

	private WebDriver driver;

	@BeforeClass
	public void Setup() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/desktops");

	}

	@Test
	public void ClickontheProductdetailspage() {

		ProductPage product = new ProductPage(driver);
		product.Clickoncomputerpage();
		product.clickonDesktoppage();

		Category category = new Category(driver);
		category.clickonCategory();


		CartPage cart = new CartPage(driver);
		cart.clickonAddToCartPage();

		Checkoutpage checkout = new Checkoutpage(driver);
		checkout.clickonShoppingcart();

		RegisterPage register = new RegisterPage(driver);
		register.clickoncheckboxpage();
		register.clickoncheckoutpage();
		register.clickonRegisterPage();
		register.clickonGenderpage();
		register.clickonFirstNamepage();
		register.clickonlastNamepage();
		register.clickonEmailPage();
		register.clickonpasswordpage();
		register.clickonchoosepasswordpage();
		register.clickonregisterbtn();
		register.clickoncontinuebtn();






	}



	@AfterClass
	public void TearDown() {
		driver.quit();

	}



}
