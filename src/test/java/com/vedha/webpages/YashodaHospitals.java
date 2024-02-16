package com.vedha.webpages;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.NotFoundException;
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

public class YashodaHospitals {
	
	
	WebDriver driver;
	
	
	@BeforeMethod
	public void browserLauch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.yashodahospitals.com");
	}

	@Test(priority = 2,enabled = false,description = "About", groups = "sanity")
	public void about() throws Throwable {
		try {
			
			String expectedValue = "";
			WebElement element = driver.findElement(By.xpath("//ul[@id='et-secondary-nav']//a[normalize-space()='About']"));
			element.click();
			Thread.sleep(3000);
			
			String Actualvalue = element.getText();
			Assert.assertEquals(Actualvalue, expectedValue);
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//ul[@id='et-secondary-nav']//a[normalize-space()='About']")));
		
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
	
	@Test(priority = 3,enabled = false,description = "News", groups = "Regression")
	public void news() {
		try {
			String expectedValue = "NEWS";
			WebElement element = driver.findElement(By.xpath("//ul[@id='et-secondary-nav']//a[@title='Yashoda in News'][normalize-space()='News']"));
			element.click();
			
			String Actualvalue = element.getText();
			Assert.assertEquals(Actualvalue, expectedValue);
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//ul[@id='et-secondary-nav']//a[@title='Yashoda in News'][normalize-space()='News']")));
			
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
	
	@Test(priority = 4,enabled = false,description = "Location", groups = "sanity")
	public void location() {
		try {
			WebElement element = driver.findElement(By.xpath("//ul[@id='et-secondary-nav']//a[@title='Locations'][normalize-space()='Locations']"));
			element.click();
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//ul[@id='et-secondary-nav']//a[@title='Locations'][normalize-space()='Locations']")));
			
			
		WebElement	eleement= driver.findElement(By.xpath("//ul[@class='sub-menu']//a[@title='Somajiguda – Super Speciality Hospital in Hyderabad'][normalize-space()='Somajiguda']"));
		
			eleement.click();
			
			WebDriverWait waitt = new WebDriverWait(driver, Duration.ofSeconds(10));
			waitt.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//ul[@class='sub-menu']//a[@title='Somajiguda – Super Speciality Hospital in Hyderabad'][normalize-space()='Somajiguda']")));
			
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
	
	@Test(priority = 5,enabled = false,description = "specialities", groups = "Regression")
	public void specialities() {
		try {
			WebElement element = driver.findElement(By.xpath("//ul[@id='et-secondary-nav']//a[@title='Yashoda Specialities'][normalize-space()='Specialities']"));
			element.click();
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//ul[@id='et-secondary-nav']//a[@title='Yashoda Specialities'][normalize-space()='Specialities']")));
			
			WebElement ele = driver.findElement(By.xpath("//ul[@class='sub-menu']//a[normalize-space()='Heart & Lung Transplant']"));
			ele.click();
			
			WebDriverWait waitt = new WebDriverWait(driver, Duration.ofSeconds(10));
			waitt.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//ul[@class='sub-menu']//a[normalize-space()='Heart & Lung Transplant']")));
			
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
	
	@Test(priority = 6,enabled = false,description = "International Patient", groups = "sanity")
	public void internationalPatient() {
		try {
			WebElement element= driver.findElement(By.xpath("//ul[@id='et-secondary-nav']//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-283700']//a[@href='#'][normalize-space()='International Patient']"));
			element.click();
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//ul[@id='et-secondary-nav']//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-283700']//a[@href='#'][normalize-space()='International Patient']")));
			
			WebElement ele = driver.findElement(By.xpath("//ul[@class='sub-menu']//li[@class='menu-item menu-item-type-post_type menu-item-object-page menu-item-283695']"));
			ele.click();
			
			WebDriverWait waitt = new WebDriverWait(driver, Duration.ofSeconds(10));
			waitt.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//ul[@class='sub-menu']//li[@class='menu-item menu-item-type-post_type menu-item-object-page menu-item-283695']")));
			
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
		}
	}
	
	@Test(priority = 7,enabled = false,description = "patientInfo", groups = "Regression")
	public void patientInfo() {
		try {
			String expectedvalue = "PATIENT INFO";
			WebElement element = driver.findElement(By.xpath("//ul[@id='et-secondary-nav']//a[@title='Patient Info'][normalize-space()='Patient Info']"));
			element.click();
			
			String actualvalue = element.getText();
			Assert.assertEquals(actualvalue, expectedvalue);
			
			WebDriverWait waitt = new WebDriverWait(driver, Duration.ofSeconds(10));
			waitt.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//ul[@id='et-secondary-nav']//a[@title='Patient Info'][normalize-space()='Patient Info']")));
			
			
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
	
	@Test(priority = 8,enabled = false,description = "Blog", groups = "sanity")
	public void blog() {
		try {
			String expectedvalue ="BLOG";
			
			WebElement element = driver.findElement(By.xpath("//ul[@id='et-secondary-nav']//a[@title='Read Yashoda Blogs'][normalize-space()='Blog']"));
			element.click();
			
			String actualvalue = element.getText();
			Assert.assertEquals(actualvalue, expectedvalue);
			
			WebDriverWait waitt = new WebDriverWait(driver, Duration.ofSeconds(10));
			waitt.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//ul[@id='et-secondary-nav']//a[@title='Read Yashoda Blogs'][normalize-space()='Blog']")));
			
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
	
	@Test(priority = 9,enabled = false,description = "heartTransplant", groups = "Regression")
	public void heartTransplant() {
		try {
			
			String expectevalue = "a";
			
			WebElement element = driver.findElement(By.xpath("//a[normalize-space()='Heart Transplant']"));
			element.click();
			
			String actualvalue = element.getTagName();
			Assert.assertEquals(actualvalue, expectevalue);
			
			WebDriverWait waitt = new WebDriverWait(driver, Duration.ofSeconds(10));
			waitt.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//a[normalize-space()='Heart Transplant']")));

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
	
	@Test(priority = 10,enabled = true,description = "neuroscience", groups = "sanity")
	public void neuroscience() {
		try {
			
			String expectevalue = "a";
			WebElement element = driver.findElement(By.xpath("//a[normalize-space()='Neuroscience']"));
			element.click();
			
			String actualvalue = element.getTagName();
			Assert.assertEquals(actualvalue, expectevalue);
			
			WebDriverWait waitt = new WebDriverWait(driver, Duration.ofSeconds(10));
			waitt.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//a[normalize-space()='Neuroscience']")));

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
	public void browserClose() {
		driver.close();
	}
}
