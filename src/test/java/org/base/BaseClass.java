package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public void getDriver() {
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
}
	public void launchUrl(String url) {
		driver.get(url);

	}
	public void typeT(WebElement element,String data) {
		element.sendKeys(data);

	}
	public void buttonClick(WebElement element) {
		element.click();

	}
	

}
