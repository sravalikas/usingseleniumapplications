package com.vedha.webpages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Paytm {

	WebDriver driver;
	
	@BeforeMethod
	public void browserLaunch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://paytm.com/");
		
	}
	
	@Test(priority = 2, enabled = false, description = "Click on Recharge", groups="sanity")
	public void recharge() {
		try {
			String expectedvalue = "io";
			WebElement element = driver.findElement(By.xpath("//div[normalize-space()='Mobile']"));
			element.click();
			
            String Actualvalue = element.getText();
			Assert.assertEquals(Actualvalue, expectedvalue);
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[normalize-space()='Mobile']")));
			
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
			
			e.printStackTrace();
			Assert.assertTrue(true);
		}
	}
	
	@Test(priority = 3, enabled = false, description = "Click on Electricity", groups="Regression")
	public void electricity() {
		try {
			String expectedvalue = "io";
			WebElement element = driver.findElement(By.xpath("//div[normalize-space()='Bill']"));
			element.click();
			
			String Actualvalue = element.getText();
			Assert.assertEquals(Actualvalue, expectedvalue);
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[normalize-space()='Bill']")));
			
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
			
			e.printStackTrace();
			Assert.assertTrue(true);
		}
	}
	
	@Test(priority = 4, enabled = false, description = "Click on DTHconnection", groups="sanity")
	public void DTHconnection() {
		try {
			String expectedvalue = "io";  
			
			WebElement element = driver.findElement(By.xpath("//div[normalize-space()='Connection']"));
			element.click();
			
			String Actualvalue = element.getText();
			Assert.assertEquals(Actualvalue, expectedvalue);
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[normalize-space()='Connection']")));
			
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
			
			e.printStackTrace();
			Assert.assertTrue(true);
		}
	}
	
	@Test(priority = 5, enabled = false, description = "Click on Gas Cylinder", groups="Regression")
	public void gasCylinder() throws ElementClickInterceptedException {
		try {
			String expectedvalue = "io"; 
			
			WebElement element = driver.findElement(By.xpath("//div[normalize-space()='Cylinder']"));
			element.click();
			
			String Actualvalue = element.getText();
			Assert.assertEquals(Actualvalue, expectedvalue);
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[normalize-space()='Cylinder']")));
			
		} catch(NoSuchElementException e) {
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
			
			e.printStackTrace();
			Assert.assertTrue(true);
		}
			
	}
	
	@Test(priority = 6, enabled = false, description = "Click on landLine Bill", groups="sanity")
	public void landLineBill() {
		try {
			String expectedvalue = "io"; 
			
			WebElement element = driver.findElement(By.xpath("//div[normalize-space()='Landline Bill']"));
			element.click();
			
			String Actualvalue = element.getText();
			Assert.assertEquals(Actualvalue, expectedvalue);
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[normalize-space()='Landline Bill']")));
			
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
			
			e.printStackTrace();
			Assert.assertTrue(true);
		}
	}
	
	@Test(priority = 7, enabled = false, description = "Click on fee", groups="Regression")
	public void fee() {
		try {
			String expectedvalue = "io"; 
			
			WebElement element = driver.findElement(By.xpath("//div[normalize-space()='Fee']"));
			element.click();
			
			String Actualvalue = element.getText();
			Assert.assertEquals(Actualvalue, expectedvalue);
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[normalize-space()='Fee']")));
			
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
			
			e.printStackTrace();
			Assert.assertTrue(true);
		}
	}
	
	@Test(priority = 8, enabled = false, description = "Click on services", groups="sanity")
	public void services() throws Throwable {
		try {
			
			String expectedvalue = "io"; 
			
			WebElement element = driver.findElement(By.xpath("//div[normalize-space()='Services']"));
			element.click();
			Thread.sleep(2000);
			
			String Actualvalue = element.getText();
			Assert.assertEquals(Actualvalue, expectedvalue);
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[normalize-space()='Services']")));
			
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
			
			e.printStackTrace();
			Assert.assertTrue(true);
		}
	}

	@Test(priority = 9, enabled = false, description = "Click on paytForConsumer", groups="Regression")
	public void paytForConsumer() throws Throwable {
		try {
			WebElement element = driver.findElement(By.xpath("//a[normalize-space()='Paytm for Consumer']"));
			element.click();
			
			Actions k = new Actions(driver);
			k.sendKeys(Keys.ENTER).perform();
			Thread.sleep(2000);
			
			k.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Financial Services']"))).perform();
			k.click();
			
			Actions l = new Actions(driver);
			l.sendKeys(Keys.ENTER).perform();
		    Thread.sleep(2000);
		    
			l.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Banking']"))).perform() ;
		    l.click();
		    
		    Actions m = new Actions(driver);
		    m.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Savings Account']"))).perform();
		    m.click();
		    //element.click();
		    
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
			
			e.printStackTrace();
			Assert.assertTrue(true);
		}
	}
	
	@Test(priority = 10, enabled = false, description = "Click on  PaytmForBusiness", groups="sanity")
	public void PaytmForBusiness() throws Throwable {
		try {
			WebElement element = driver.findElement(By.xpath("//a[normalize-space()='Paytm For Business']"));
			element.click();
			
			Actions k = new Actions(driver);
			k.sendKeys(Keys.ENTER).perform();
			Thread.sleep(2000);
			
			k.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Business Payments']"))).perform();
			k.click();
			
			WebElement payouts = driver.findElement(By.xpath("//a[normalize-space()='Payouts']"));
			Actions l = new Actions(driver);
			l.sendKeys(Keys.ENTER).perform();
		    Thread.sleep(2000);
		    
			l.moveToElement(payouts);
		    payouts.click();
		    
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
			
			e.printStackTrace();
			Assert.assertTrue(true);
		}
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
}
