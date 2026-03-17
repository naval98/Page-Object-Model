package com.vts.Pages;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage {

	WebDriver driver;

	public RegisterPage(WebDriver driver) {
		this.driver = driver;
	}


	private By checkboxpage  = By.xpath("//input[@id='termsofservice']");
	private By checkoutpage = By.xpath("//button[@id='checkout']");
	private By RegisterPage = By.xpath("//input[@value='Register']");
	private By Genderpage = By.xpath("//input[@id='gender-male']");
	private By FirstNamepage = By.xpath("//input[@id='FirstName']");
	private By lastNamepage = By.xpath("//input[@id='LastName']");
	private By EmailPage = By.xpath("//input[@id='Email']");
	private By passwordpage = By.xpath("//input[@id='Password']");
	private By choosepasswordpage = By.xpath("//input[@id='ConfirmPassword']");
	private By registerbtn = By.xpath("//input[@id='register-button']");
	private By continuebtn = By.xpath("//input[@value='Continue']");





	public void clickonRegisterpage() {
		driver.findElement(RegisterPage).click();
	} 

	public void clickonGenderpage() {
		driver.findElement(Genderpage).click();
	}

	public void clickonFirstNamepage() {
		driver.findElement(FirstNamepage).sendKeys("Naval");
	}

	public void clickonlastNamepage() {
		driver.findElement(lastNamepage).sendKeys("saxena");
	}

	public void clickonEmailPage() {
		driver.findElement(EmailPage).sendKeys("navalsaxena39@gmail.com");
	}

	public void clickonpasswordpage() {
		driver.findElement(passwordpage).sendKeys("naval@123");
	}

	public void clickonchoosepasswordpage() {
		driver.findElement(choosepasswordpage).sendKeys("naval@123");
	}


	public void clickoncheckboxpage() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(checkboxpage)).click();
	}

	public void clickoncheckoutpage() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(checkoutpage)).click();
	}

	public void clickonRegisterPage() {
		driver.findElement(RegisterPage).click();
	}

	public void clickonregisterbtn() {
		driver.findElement(registerbtn).click();
	}

	public void clickoncontinuebtn() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement continueBtn = wait.until(
				ExpectedConditions.elementToBeClickable(continuebtn)
				);
		continueBtn.click();
	}




}
