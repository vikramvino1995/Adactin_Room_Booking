package com.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
public static WebDriver driver;
	
	public static void launchBrowser() {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
		
		driver = new ChromeDriver();
	}
	
	public static void loadUrl(String s) {
		driver.get(s);
	}
	
	public static void maximize() {
		driver.manage().window().maximize();
	}
	
	public static void enterText(WebElement e,String s) {
		
		e.sendKeys(s);
		
	}
	
	public static void leftClick(WebElement e) {
		
		Actions act =new Actions(driver);
		
		act.click(e).perform();
		
	}
	
	public static void rightClick(WebElement e) {
		
		Actions act =new Actions(driver);
		
		act.contextClick(e).perform();
		
	}
	
	public static void scrollDown(WebElement e) {
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true)",e);
		
	}
	
	public static void scrollUp(WebElement e) {
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(false)",e);
		
	}
	
	public static void dropDown(WebElement e,String s1) {
		
		Select s =new Select(e);
		
		List<WebElement> options = s.getOptions();
		
		s.selectByVisibleText(s1);
		
	}
	
	public static void pressEnter() throws AWTException {
		
		Robot r =new Robot();
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}
	
}


