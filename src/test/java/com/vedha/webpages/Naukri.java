package com.vedha.webpages;

import java.time.Duration;

import org.openqa.selenium.By;
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

public class Naukri {
	
	WebDriver driver;
	
	@BeforeMethod
	public void browserLauch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.naukri.com/");
	}

	@Test(priority = 2, enabled = false, description = "Click on login", groups="Regression")
	public void login() {
		try {
			String Expectedvalue="login_Layer";
			WebElement element = driver.findElement(By.xpath("//a[@id='login_Layer']"));
			element.click();
			String Actualvalue=element.getAttribute("id");
			Assert.assertEquals(Actualvalue, Expectedvalue);
			
			WebElement username= driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']"));
			username.sendKeys("sravalikasuddala95@gmail.com");
			username.click();
			
			WebElement password = driver.findElement(By.xpath("//input[@placeholder='Enter your password']"));
			password.sendKeys("Kun@l1991");
			password.click();
			
			WebElement logiin = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
			logiin.click();
			
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
	
	@Test(priority = 3, enabled = false, description = "Click on companies", groups="sanity")
	public void companies() throws Throwable {
		try {
			String expectedvalue = "Companies";
			
			WebElement element = driver.findElement(By.xpath("//div[normalize-space()='Companies']"));
			Actions l = new Actions(driver);
			//l.sendKeys(Keys.ENTER).perform();
		    Thread.sleep(2000);
		    
			l.moveToElement(element);
			Thread.sleep(3000);
			//l.click();
		    element.click();
		    
		    String Actualvalue = element.getText();
		    Assert.assertEquals(Actualvalue, expectedvalue);
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
	
	@Test(priority = 4, enabled = false, description = "Click on services", groups="Regression")
	public void services() {
		try {
			String expectedvalue = "Services";
			
			WebElement element = driver.findElement(By.xpath("//div[normalize-space()='Services']"));
			element.click();
			
		    String Actualvalue = element.getText();
		    Assert.assertEquals(Actualvalue, expectedvalue);
		    
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
	
	@Test(priority = 5, enabled = false, description = "Click on search", groups="sanity")
	public void search() {
		try {
			
			WebElement element = driver.findElement(By.xpath("//input[@placeholder='Enter skills / designations / companies']"));
			element.sendKeys("Automation testing");
			//element.findElement(By.xpath("//div[contains(@title,'Automation testing')]//span[1]"));
			//element.click();
			
			WebElement expereince = driver.findElement(By.xpath("//input[@id='expereinceDD']"));
			expereince.click();
			
			WebElement years = driver.findElement(By.xpath("//span[normalize-space()='3 years']"));
			years.click();
			
			WebElement location = driver.findElement(By.xpath("//input[@placeholder='Enter location']"));
			location.sendKeys("Hyderabad");
			
			WebElement search = driver.findElement(By.xpath("//div[@class='qsbSubmit']"));
			search.click();
			
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
	
	@Test(priority = 6, enabled = false, description = "Click on  remote", groups="Regression")
	public void remote() {
		try {
			String Expectedvalue= "";
			WebElement element = driver.findElement(By.xpath("//span[contains(@title,'Remote')]"));
			element.click();
			
			String Actualvalue = element.getText();
			Assert.assertEquals(Actualvalue, Expectedvalue);
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//span[contains(@title,'Remote')]")));
			
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
	
	@Test(priority = 7, enabled = false, description = "Click on  MNC", groups="sanity")
	public void mnc() {
		try {
			
			String Expectedvalue= "MNC";
			
			WebElement element = driver.findElement(By.xpath("//span[contains(@title,'MNC')]"));
			element.click();
			

			String Actualvalue = element.getText();
			Assert.assertEquals(Actualvalue, Expectedvalue);
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//span[contains(@title,'MNC')]")));
			
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
	
	
	@Test(priority = 8, enabled = false, description = "Click on  Analytics", groups="Regression")
	public void Analytics() {
		try {
			String Expectedvalue= "Analytics";
			
			WebElement element = driver.findElement(By.xpath("//span[@title='Analytics']"));
			element.click();
			
			String Actualvalue = element.getText();
			Assert.assertEquals(Actualvalue, Expectedvalue);
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//span[@title='Analytics']")));
			
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
	
	@Test(priority = 9, enabled = false, description = "Click on  Engineering", groups="sanity")
	public void Engineering() {
		try {
			String Expectedvalue= "Engineering";
			
			WebElement element = driver.findElement(By.xpath("//span[@title='Engineering']"));
			element.click();
			
			String Actualvalue = element.getText();
			Assert.assertEquals(Actualvalue, Expectedvalue);
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//span[@title='Engineering']")));
			
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
	
	@Test(priority = 10, enabled = false, description = "Click on  startup", groups="Regression")
	public void startup() {
		try {
			String Expectedvalue= "Engineering";
			
			WebElement element = driver.findElement(By.xpath("//span[@title='Startup']"));
			element.click();
			
			String Actualvalue = element.getText();
			Assert.assertEquals(Actualvalue, Expectedvalue);
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//span[@title='Startup']")));
			
		} catch  (NoSuchElementException e) {
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
