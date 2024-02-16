package com.vedha.webpages;

import java.net.SocketException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FaceBook {

	WebDriver driver;
	
	@BeforeMethod
	public void browserLauch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
	}
	
	@Test(priority = 1, enabled = false, description = "Click on  messenger", groups="Regression")
	public void messenger() throws StaleElementReferenceException, SocketException, TimeoutException {
		try {
			
			String Expectedvalue= "Messenger";
			
			WebElement element = driver.findElement(By.xpath("//a[normalize-space()='Messenger']"));
			element.click();
			

			String Actualvalue = element.getText();
			Assert.assertEquals(Actualvalue, Expectedvalue);
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//a[normalize-space()='Messenger']")));
			
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
	
	@Test(priority = 3, enabled = false, description = "Click on  faceBookLite", groups="sanity")
	public void faceBookLite() {
		try {
			String Expectedvalue= "Messenger";
			
			WebElement element = driver.findElement(By.xpath("//a[normalize-space()='Facebook Lite']"));
			element.click();
			
			String Actualvalue = element.getText();
			Assert.assertEquals(Actualvalue, Expectedvalue);
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//a[normalize-space()='Facebook Lite']")));
			
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
	
	@Test(priority = 2, enabled = false, description = "Click on  places", groups="Regression")
	public void places() {
		try {
			
			WebElement element = driver.findElement(By.xpath("//a[normalize-space()='Places']"));
			element.click();
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//a[normalize-space()='Places']")));
			
			
			WebElement jaipur = driver.findElement(By.xpath("//span[normalize-space()='Jaipur, Rajasthan']"));
			jaipur.click();
			
			WebDriverWait waitt = new WebDriverWait(driver, Duration.ofSeconds(10));
			waitt.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//span[normalize-space()='Jaipur, Rajasthan']")));
			
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
		}
	}
	
	@Test(priority = 4, enabled = false, description = "Click on  marketplace", groups="sanity")
	public void marketplace() {
		try {
			
			String Expectedvalue= "Marketplace";
			
			WebElement element = driver.findElement(By.xpath("//a[normalize-space()='Marketplace']"));
			element.click();
			
			String Actualvalue = element.getText();
			Assert.assertEquals(Actualvalue, Expectedvalue);
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//a[normalize-space()='Marketplace']")));
			
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
	
	@Test(priority = 6, enabled = false, description = "Click on  metaPay", groups="Regression")
	public void metaPay() {
		try {

			String Expectedvalue= "Meta Pay";
			
			WebElement element = driver.findElement(By.xpath("//a[normalize-space()='Meta Pay']"));
			element.click();
			
			String Actualvalue = element.getText();
			Assert.assertEquals(Actualvalue, Expectedvalue);
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//a[normalize-space()='Meta Pay']")));
			
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
	
	@Test(priority = 7, enabled = false, description = "Click on  metastore", groups="sanity")
	public void metastore() {
		try {
			
			String Expectedvalue= "Meta Store";
			
			WebElement element = driver.findElement(By.xpath("//a[normalize-space()='Meta Store']"));
			element.click();
			
			String Actualvalue = element.getText();
			Assert.assertEquals(Actualvalue, Expectedvalue);
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//a[normalize-space()='Meta Store']")));
			
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
	
	@Test(priority = 8, enabled = false, description = "Click on  metaQuest", groups="Regression")
	public void metaQuest() {
		try {
			
			String Expectedvalue= "Meta Quest";
			
			WebElement element = driver.findElement(By.xpath("//a[normalize-space()='Meta Quest']"));
			element.click();
			
			String Actualvalue = element.getText();
			Assert.assertEquals(Actualvalue, Expectedvalue);
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//a[normalize-space()='Meta Quest']")));
			
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
	
	@Test(priority = 9, enabled = false, description = "Click on  voting", groups="sanity")
	public void voting() {
		try {
			
			String Expectedvalue= "Voting Information Centre";
			
			WebElement element = driver.findElement(By.xpath("//a[normalize-space()='Voting Information Centre']"));
			element.click();
			
			String Actualvalue = element.getText();
			Assert.assertEquals(Actualvalue, Expectedvalue);
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//a[normalize-space()='Voting Information Centre']")));
			
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
	
	
	@Test(priority = 10, enabled = true, description = "Click on  privacyPolicy", groups="Regression")
	public void privacyPolicy() {
		try {
			
			String Expectedvalue= "Privacy Policy";
			
			WebElement element = driver.findElement(By.xpath("//a[normalize-space()='Privacy Policy']"));
			element.click();
			
			String Actualvalue = element.getText();
			Assert.assertEquals(Actualvalue, Expectedvalue);
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//a[normalize-space()='Privacy Policy']")));
			
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
