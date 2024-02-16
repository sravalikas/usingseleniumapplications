package com.vedha.usingseleniumapplications;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NaukriPage {
	WebDriver driver;
	
	public void BrowserLuch() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.naukri.com/");
		
		
	}
	
	
	@Test
	public void searchBar() throws ElementClickInterceptedException {
		
		
	
		try {
			WebElement element = driver.findElement(By.xpath("//a[@id='login_Layer']"));
			element.click();
			
			element.findElement(By.xpath("//input[@placeholder=\"Enter your active Email ID / Username\"]")).sendKeys("sravalikasuddala95@gmail.com");
			//element.sendKeys("sravalikasuddala95@gmail.com");
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			wait.until(ExpectedConditions.visibilityOf(element));
			
			element.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("Kun@l1991");
			
			WebDriverWait waitt = new WebDriverWait(driver, Duration.ofSeconds(5));
			waitt.until(ExpectedConditions.visibilityOf(element));
			
			element.findElement(By.xpath("//button[normalize-space()='Login']")).click();
			
			WebDriverWait waittt = new WebDriverWait(driver, Duration.ofSeconds(5));
			waittt.until(ExpectedConditions.visibilityOf(element));


		Assert.assertEquals("Login", element.getText());
			

		} catch (NoSuchElementException e) {
			// TODO: handle exception
			System.out.println("Element was not found sorry");
	    }
		catch (NoAlertPresentException e) 
	    {
	    	System.out.println("Alert was not found sorry");
	    }
		catch (NoSuchWindowException e) 
	    {
	    	System.out.println("Window was not found sorry");
	    }
		catch (NotFoundException e) 
	    {
	    	System.out.println("Could not find the connection");
	    }
		catch (WebDriverException e) {
			// TODO: handle exception
			System.out.println(" find the connection");
		}  
		finally {
			driver.quit();
		}
	
		}
	
	
	@Test
	public void jobs() {
	
	
	
	try {
	
	driver.get("https://www.naukri.com/");
	WebElement element = driver.findElement(By.xpath("//div[normalize-space()='Jobs']"));
	Actions ac = new Actions(driver);
	ac.moveToElement(element);
	//element.click();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	wait.until(ExpectedConditions.visibilityOf(element));
	Assert.assertEquals(false, element);
	
	} catch (NoSuchElementException e) {
		// TODO: handle exception
		System.out.println("Element was not found sorry");
    }
	catch (NoAlertPresentException e) 
    {
    	System.out.println("Alert was not found sorry");
    }
	catch (NoSuchWindowException e) 
    {
    	System.out.println("Window was not found sorry");
    }
	catch (NotFoundException e) 
    {
    	System.out.println("Could not find the connection");
    }
	catch (WebDriverException e) {
		// TODO: handle exception
		System.out.println(" find the connection");
	}
	/*finally {
		driver.quit();
	}*/
	
	}
	
	@Test
	public void companies() {
		
		
		try {
		
		driver.get("https://www.naukri.com/");
		WebElement element = driver.findElement(By.xpath("//div[normalize-space()='Companies']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(element);
		//element.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementSelectionStateToBe(element, false));
		Assert.assertNotEquals(ac, wait);
		
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			System.out.println("Element was not found sorry");
	    }
		catch (NoAlertPresentException e) 
	    {
	    	System.out.println("Alert was not found sorry");
	    }
		catch (NoSuchWindowException e) 
	    {
	    	System.out.println("Window was not found sorry");
	    }
		catch (NotFoundException e) 
	    {
	    	System.out.println("Could not find the connection");
	    }
		catch (WebDriverException e) {
			// TODO: handle exception
			System.out.println(" find the connection");
		}
		/*finally {
			driver.quit();
		}*/
		
		
	}
}



