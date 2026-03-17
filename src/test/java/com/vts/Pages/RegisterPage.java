package com.vts.Pages;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(RegisterPage)).click();
	} 

	public void clickonGenderpage() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(Genderpage)).click();
	}

	public void clickonFirstNamepage() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(FirstNamepage)).sendKeys("Naval");
	}

	public void clickonlastNamepage() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(lastNamepage)).sendKeys("Saxena");
	}

	public void clickonEmailPage() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(EmailPage)).sendKeys("navalsaxena78@gmail.com");
	}

	public void clickonpasswordpage() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(passwordpage)).sendKeys("Navalsax@123");
	}

	public void clickonchoosepasswordpage() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(choosepasswordpage)).sendKeys("Navalsax@123");
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
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(RegisterPage)).click();
	}

	public void clickonregisterbtn() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(registerbtn)).click();
	}

	public void clickoncontinuebtn() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(continuebtn)).click();
	}
}





