package com.vedha.webpages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Dezlearn {

WebDriver driver ;
	
	
	@BeforeMethod
	public void browserLuch() throws Throwable {
		
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.dezlearn.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().deleteAllCookies();
			
			
			WebElement objframe= driver.findElement(By.id("ml-webforms-popup-3672985"));
	        Thread.sleep(8000);
				
			driver.switchTo().frame(objframe);
		    Thread.sleep(8000);
				/*WebElement element=	driver.findElement(By.xpath("//span[@aria-hidden=\"true\"]"));
				Actions ac = new Actions(driver);
				ac.moveToElement(element);
				element.click();*/
				
			driver.findElement(By.xpath("//button[@type=\"button\"]")).click();
			Thread.sleep(8000);
				
		
	}
	
	@Test(enabled=true)
	public void tc1() {
		
		try {
			WebElement element = driver.findElement(By.xpath("//a[normalize-space()='Articles']"));
			element.click();
			Thread.sleep(3000);
			
			//Actions ac = new Actions(driver);
			//ac.moveToElement(element);
			//ac.click();
			
			//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			//wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//a[contains(text(),'Test Pages')]")));
			
			//element.findElement(By.xpath("//a[normalize-space()='Test Sync Example']")).click();
			//Thread.sleep(8000);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	@Test(enabled = false)
	public void courses() {
		try {
			WebElement element = driver.findElement(By.cssSelector("#menu-item-10527"));
			//element.click();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			 // actionClass.waitforSeconds(5);
			  js.executeScript("arguments[0].click();", element);
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
