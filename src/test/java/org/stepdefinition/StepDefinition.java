package org.stepdefinition;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition extends BaseClass  {
	
	@Given("user is on Adactin page # browser, url-->Pre conditional")
	public void user_is_on_Adactin_page_browser_url_Pre_conditional() {
	   getDriver();
	   launchUrl("http://adactinhotelapp.com/");
	}

	@When("user need to enter username and password on Adactin page")
	public void user_need_to_enter_username_and_password_on_Adactin_page() {
		WebElement txtUsername = driver.findElement(By.id("username"));
		txtUsername.sendKeys("karthi007");
		
		WebElement txtPassword = driver.findElement(By.name("password"));
		txtPassword.sendKeys("Karthi@1989");
	}
	
	@When("user need to click login button")
	public void user_need_to_click_login_button() {
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();
		
	}

	@When("user should select the location,no of rooms,checkin date,checkout date,adults per room")
	public void user_should_select_the_location_no_of_rooms_checkin_date_checkout_date_adults_per_room() throws InterruptedException {
		Thread.sleep(2000);
		Select s=new Select(driver.findElement(By.id("location")));
		s.selectByIndex(3);
		Thread.sleep(2000);
		Select s1=new Select(driver.findElement(By.id("room_nos")));
		s1.selectByIndex(3);
		Thread.sleep(2000);
		WebElement txtCheckindate = driver.findElement(By.name("datepick_in"));
		txtCheckindate.sendKeys("20/05/2021");
		Thread.sleep(2000);
		WebElement txtCheckoutdate = driver.findElement(By.name("datepick_out"));
		txtCheckoutdate.sendKeys("21/05/2021");
		Thread.sleep(2000);
		Select s4=new Select(driver.findElement(By.id("adult_room")));
		s4.selectByIndex(2);
		
	}

	@When("user should click search button")
	public void user_should_click_search_button() {
		WebElement btnSearch = driver.findElement(By.id("Submit"));
		btnSearch.click();
	}

	@When("user need to select hotel,room type and child per room")
	public void user_need_to_select_hotel_room_type_and_child_per_room() {
		Select s5=new Select(driver.findElement(By.id("hotels")));
		s5.selectByIndex(2);
		Select s6=new Select(driver.findElement(By.id("room_type")));
		s6.selectByIndex(1);
		Select s7=new Select(driver.findElement(By.id("child_room")));
		s7.selectByIndex(2);
	}



	

}
