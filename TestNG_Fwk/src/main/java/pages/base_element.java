package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.BrowserManager;
import utils.ReadConfigurationProperty;

public class base_element {
	public static WebElement element;
	public static WebDriver driver;

	public static void openURL() throws IOException {
		driver = BrowserManager.setProperty(driver, ReadConfigurationProperty.browserName());
		driver.get(ReadConfigurationProperty.baseURL());

	}

	public static WebElement inputBox(WebDriver driver) {
		String id = "mh-search-input";
		element = driver.findElement(By.id(id));
		return element;
	}

	public static WebElement searchButtonP(WebDriver driver) {
		String cls = "//*[@class='mh-search-btn mh-search-submit']";
		element = driver.findElement(By.xpath(cls));
		return element;
	}

	public static WebElement searchButtonF(WebDriver driver) {
		String cls = "//*[@class='m-search-btn mh-search-submit']";
		element = driver.findElement(By.xpath(cls));
		return element;
	}

	public static WebElement click_into_sign_in(WebDriver driver) {
		String cls = "//span[@class=\'flyoutIconWrapper\']";
		element = driver.findElement(By.xpath(cls));
		return element;
	}

	public static WebElement click_onto_HomeMakingAPurchase(WebDriver driver) {
		String cls = "//li/a[text()='Help Making a Purchase']";
		element = driver.findElement(By.xpath(cls));
		return element;
	}
	
	
	
	

	public static WebElement Contect_Btn(WebDriver driver) {
		String cls = "//div/a[@class=\"mh-contact-btn mh-flyout-link no-chevron\"]";
		element = driver.findElement(By.xpath(cls));
		return element;
	}

}
