package com.vedha.Dezlearn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class DezlearnWebsite {
	
	WebDriver driver;
	
	
	@BeforeMethod
	public void browserLuch() {
		try {
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
				
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			Assert.assertFalse(false);
		}
	}
	
	@Test
	public void tc1() {
		
		try {
			WebElement element = driver.findElement(By.xpath("//a[normalize-space()='Test Pages']"));
			element.click();
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Test Pages']")));
			
			element.findElement(By.xpath("//a[normalize-space()='Test Sync Example']")).click();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
