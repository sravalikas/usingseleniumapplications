package com.vedha.webpages;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.StaleElementReferenceException;
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

public class Googlepage {
	
	WebDriver driver;

	

	@BeforeMethod (enabled = true,description = "togeturl", groups = "url")
	public void browserLauch() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.google.com/");
		
	
	}
	
	@Test (priority = 2,enabled = true,description = "search bar", groups = "Regression")
	public void searchBar() {
		
		
		
	
		try {
			WebElement element = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
			element.sendKeys("Amazon", Keys.ENTER);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			wait.until(d -> element.isDisplayed());
			element.sendKeys("isDisplayed");
			
			Assert.assertEquals("Displayed", element.getText());;
			

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
		}finally {
			driver.quit();
		}
	
		}
	
	
	@Test(priority = 3,enabled = true,description = "gmail", groups = "sanity")
	public void gmailText() throws StaleElementReferenceException {
		
		
		try {
		
		driver.get("https://www.google.com/");
		WebElement element = driver.findElement(By.xpath("//a[normalize-space()='Gmail']"));
		element.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(element));
		Assert.assertTrue(true);
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
	
	
	@Test(priority = 4,enabled = true,description = "imfeelingluckytoclick", groups = "Regression")
	public void imFeelingKucky() {
		
		
		try {
			driver.get("https://www.google.com/");
			WebElement element =   driver.findElement(By.xpath("//di[@class='FPdoLc lJ9FBc']//input[@name='btnI']"));
			element.click();
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			wait.until(ExpectedConditions.elementToBeClickable(element));
			Assert.assertFalse(false);
			
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
		}
	
	@Test(priority = 5,enabled = true,description = "click image",   groups = "sanity")
	public void images() {
		
		try {
			driver.get("https://www.google.com/");
			WebElement element = driver.findElement(By.xpath("//a[normalize-space()='Images']"));
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			wait.until(ExpectedConditions.elementToBeClickable(element));
			element.click();
			Assert.fail();
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
		}finally {
			driver.quit();
		}
		}
	
	
	@Test(priority = 6,enabled = true,description = "click on About", groups = "Regression")
	public void about() {
		
		
		try {
			driver.get("https://www.google.com/");
			WebElement element = driver.findElement(By.xpath("//a[normalize-space()='About']"));
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			wait.equals(element);
			element.click();
			Assert.assertEquals(true, element);
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
		}finally {
			driver.quit();
		}
		}
	
	@Test(priority = 7,enabled = true,description = "click on Advertising", groups = "sanity")
	public void advertising() {
		
		try {
			driver.get("https://www.google.com/");
			WebElement element = driver.findElement(By.xpath("//a[normalize-space()='Advertising']"));
			element.click();
			Actions ac = new Actions(driver);
			ac.doubleClick(element);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			wait.until(ExpectedConditions.visibilityOf(element));
			//Assert.assertNotEquals(driver, wait);
			
		
	}catch (NoSuchElementException e) {
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
	}finally {
		driver.quit();
	}
	
	
	}
	
	@Test(priority = 8,enabled = true,description = "click on Advertising", groups = "Regression")
	public void business() {
		
		
		try {
			driver.get("https://www.google.com/");
			WebElement element = driver.findElement(By.xpath("//a[normalize-space()='Business']"));
			element.click();
			Actions ac = new Actions(driver);
			ac.doubleClick(element);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			wait.until(ExpectedConditions.invisibilityOfAllElements(element));
			//Assert.assertNotEquals(driver, wait);
			
		
	}catch (NoSuchElementException e) {
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
	}finally {
		driver.quit();
	}
	
	}
	
	@Test(priority = 9,enabled = true,description = "click on howSearchworks ", groups = "sanity")
	public void  howSearchworks () {
		
		
		try {
			driver.get("https://www.google.com/");
			WebElement element = driver.findElement(By.xpath("//a[normalize-space()='How Search works']"));
			element.click();
			Actions ac = new Actions(driver);
			ac.doubleClick(element);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			wait.until(ExpectedConditions.invisibilityOfAllElements(element));
			//Assert.assertNotEquals(driver, wait);
			String ActualTitle = driver.getTitle();
			String verifyAssertNull=null;
			String ExpectedTitle = "Google Search – Discover how Google Search works";
			Boolean verifyTitleIsPresent=driver.getTitle().equalsIgnoreCase("Google Search – Discover how Google Search works");
			Boolean verifyTitleIsChanged=driver.getTitle().equalsIgnoreCase("Google Search – Discover how Google Search works");
			assertEquals(ExpectedTitle, ActualTitle);
			assertNotEquals(ExpectedTitle, "google");
			assertTrue(verifyTitleIsPresent);
			assertFalse(verifyTitleIsChanged);
			assertNotNull(verifyTitleIsPresent);
			assertNull(verifyAssertNull);
			
		
	}catch (NoSuchElementException e) {
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
	}finally {
		driver.quit();
	}
	
	}
	
	@Test(priority = 11,enabled = true,description = "click on Privacy", groups = "Regression")
	public void Privacy() {
		
		
		try {
			driver.get("https://www.google.com/");
			WebElement element = driver.findElement(By.xpath("//a[normalize-space()='Privacy']"));
			element.click();
			Actions ac = new Actions(driver);
			ac.doubleClick(element);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			wait.until(ExpectedConditions.invisibilityOfAllElements(element));
			//Assert.assertNotEquals(driver, wait);
			
		
	}catch (NoSuchElementException e) {
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
	}finally {
		driver.quit();
	}
	
	}
	
	@Test(priority = 12,enabled = true,description = "click on terms", groups = "sanity")
	public void terms() {
		
		try {
			driver.get("https://www.google.com/");
			WebElement element = driver.findElement(By.xpath("//a[normalize-space()='Terms']"));
			element.click();
			Actions ac = new Actions(driver);
			ac.doubleClick(element);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			wait.until(ExpectedConditions.invisibilityOfAllElements(element));
			//Assert.assertNotEquals(driver, wait);
			
		
	}catch (NoSuchElementException e) {
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
	}finally {
		driver.quit();
	}
	}
	
	@Test(priority = 13,enabled = true,description = "click on settings", groups = "Regression")
	public void settings() {
		
		try {
			driver.get("https://www.google.com/");
			WebElement element = driver.findElement(By.xpath("//a[normalize-space()='Terms']"));
			element.click();
			Actions ac = new Actions(driver);
			ac.doubleClick(element);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			wait.until(ExpectedConditions.invisibilityOfAllElements(element));
			//Assert.assertNotEquals(driver, wait);
			
		
	}catch (NoSuchElementException e) {
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
	}finally {
		driver.quit();
	}
	}
	
	@AfterMethod(enabled = true,description = "close Browser", groups = "sanity")
	public void closeBrowser() {
		
		driver.close();
	}
}

	
		
	
	
	

	
	

		
	


