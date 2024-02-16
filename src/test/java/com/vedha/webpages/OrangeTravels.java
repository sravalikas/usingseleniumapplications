package com.vedha.webpages;

import java.text.spi.DateFormatSymbolsProvider;
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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OrangeTravels {
	
	WebDriver driver;
@BeforeMethod	
	
	public void browserLaunch() {
		try {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("https://www.orangetravels.in/#/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			

            WebElement element=	driver.findElement(By.xpath("//button[@class='btn btn-default']"));
			Actions ac = new Actions(driver);
			ac.moveToElement(element);
			element.click(); 
			Thread.sleep(8000);
		
		//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			//wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//button[@class='btn btn-default']")));
			

		
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}

	}
	
	@Test(priority = 2,enabled = false,description = "click on cargo", groups = "Regression")
	public void cargo() {
		
		try {
			
			String expectedvalue = "Cargo";
			WebElement element = driver.findElement(By.xpath("//a[normalize-space()='Cargo']"));
			element.click();
			String Actualvalue = element.getText();
			
			Assert.assertEquals(Actualvalue, expectedvalue);
			//driver.switchTo().newWindow(WindowType.WINDOW);;
			//driver.navigate().to("https://www.orangecargo.in/");
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//a[normalize-space()='Cargo']")));
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			Assert.assertTrue(true);
		}
		
	}

  @Test(priority = 3,enabled = false,description = "click on myBookings", groups = "sanity")
	public void myBookings() {
		try {
			String Expectedvalue="a";
			WebElement element = driver.findElement(By.xpath("//a[@class='menu-link'][normalize-space()='My Booking']"));
			//Actions ac = new Actions(driver);
			//ac.doubleClick(element);
			element.click();
			String Actualvalue = element.getTagName();
			Assert.assertEquals(Actualvalue, Expectedvalue);
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='menu-link'][normalize-space()='My Booking']")));
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			Assert.assertTrue(true);
		}
	}
	
	@Test(priority = 4,enabled = false,description = "click on manageBooking", groups = "Regression")
	public void manageBooking() throws NoSuchElementException, NoAlertPresentException, Throwable {
		try {
			String Expectedvalue="a";
			WebElement element = driver.findElement(By.xpath("//a[normalize-space()='Manage Booking']"));
			element.click();
			String Actualvalue = element.getTagName();
			Assert.assertEquals(Actualvalue, Expectedvalue);
			
			Thread.sleep(8000);
			
			//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Manage Booking']")));
			
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
	

	@Test(priority = 5,enabled = false,description = "click on agentLogin", groups = "sanity")
	public void agentLogin() throws Throwable {
		try {
			String Expectedvalue="a";
			WebElement element = driver.findElement(By.xpath("//a[@class='menu-link'][normalize-space()='Agent Login']"));
			element.click();
			Thread.sleep(8000);
			String Actualvalue = element.getTagName();
			Assert.assertEquals(Actualvalue, Expectedvalue);
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
	
	
	@Test(priority = 6,enabled = false,description = "click on branchLogin", groups = "Regression")
	public void branchLogin() throws Throwable {
		try {
			String Expectedvalue = "Branch Login";
			WebElement element = driver.findElement(By.xpath("//a[@class='menu-link'][normalize-space()='Branch Login']"));
			element.click();
			
			Thread.sleep(8000);
			
			String Actualvalue = element.getText();
			Assert.assertEquals(Actualvalue, Expectedvalue);
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
	
	
	@Test(priority = 7,enabled = false,description = "click on activator", groups = "sanity")
	public void activator() throws Throwable {
		try {
			String Expectedvalue = "div";
			WebElement element = driver.findElement(By.xpath("//div[@id='activator']"));
			element.click();
			Thread.sleep(5000);
			element.findElement(By.xpath("//div[@id='activator']"));
			element.click();
			
			String Actualvalue = element.getTagName();
			Assert.assertEquals(Actualvalue, Expectedvalue);
			
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
	
	@Test(priority = 8,enabled =true,description = "click on oneway trip", groups = "Regression")
	public void oneWay(){

	try {
		
	
		WebElement element = driver.findElement(By.xpath("//input[@id='FromCity']"));
		//element.click();
		
		
		Actions ac = new Actions(driver);
		ac.click(element);
		
		element.sendKeys("Hyderabad", Keys.ENTER);
		//element.click();
		
	  WebElement ele= driver.findElement(By.xpath("//input[@id='ToCity']"));
		ac.click(ele);
		
		
		ele.sendKeys("Adilabad", Keys.ENTER);
		
		WebElement elem = driver.findElement(By.xpath("//input[@id='txtFromDate']"));
		elem.click();
		
		
		
		//elem.sendKeys("04-02-2024", Keys.ENTER);

	//	elem.findElement(By.cssSelector("div.datepicker.datepicker-dropdown.dropdown-menu.datepicker-orient-left.datepicker-orient-bottom:nth-child(2) div.datepicker-days table.table-condensed tbody:nth-child(2) tr:nth-child(2) > td.active.day:nth-child(1)"));
	 //  ac.moveToElement(elem);
	// ac.click();
	    
		
		
		//elem.findElement(By.xpath("//td[@class='active day']"));
		//elem.click();
		
		WebElement search = driver.findElement(By.xpath("//button[normalize-space()='Search Bus']"));
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
}
	}
	
	@Test(priority = 9,enabled =false,description = "click on Round Trip", groups = "Regression")
	public void roundTrip() throws Throwable {
		try {
			
			WebElement roundtrip = driver.findElement(By.xpath("//a[normalize-space()='Round Trip']"));
			roundtrip.click();
			Thread.sleep(1000);
			
			WebElement element = driver.findElement(By.xpath("(//input[@id='FromCity'])[1]"));
			
			Actions ac = new Actions(driver);
			ac.click(element);
			
			element.sendKeys("Hyderabad", Keys.ENTER);
			

			  WebElement ele= driver.findElement(By.xpath("//input[@id='ToCity']"));
				ac.click(ele);
				
				
				ele.sendKeys("Adilabad", Keys.ENTER);
				
				
				WebElement elem = driver.findElement(By.xpath("//input[@id='txtFromDate']"));
				elem.click();
				
				WebElement eleme = driver.findElement(By.xpath("//input[@id='txtToDate']"));
				eleme.click();
		           
				WebElement date = driver.findElement(By.xpath("//td[@class='day'][normalize-space()='5']"));
				date.click();
				
				WebElement search = driver.findElement(By.xpath("//button[normalize-space()='Search Bus']"));
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
	}
	}
	
	@Test(priority = 10,enabled =false,description = "click on Orange Tours And Travels ", groups = "Regression")
	public void orangeToursAndTravels() {
		try {
			WebElement element = driver.findElement(By.xpath("//a[normalize-space()='Orange Tours And Travels.']"));
			element.click();
		
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
	
	//@AfterMethod
	//public void browserClose() {
	//	driver.close();
	//}
}
