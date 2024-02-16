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
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.vedha.objectrepositry.ElementPage;

public abstract class Makemytrip extends ElementPage {
	
	ElementPage elementPage;
	WebDriver driver;
	
	@BeforeTest
	public void browserLauch() {
		driver = chromeBrowser("https://www.makemytrip.com/");
		
		
	}

	@Test(priority = 2, enabled = false, description = "Click on flights", groups="sanity")
	public void flights() throws Throwable {
		try {
			elementPage.flightss().click();
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//span[@class='headerIconTextAlignment chNavText darkGreyText'][normalize-space()='Flights']")));
			
			elementPage.depaturre().click();
			
			elementPage.dateInnerceell().click();
			Thread.sleep(2000);
			
			elementPage.rreturnn().click();
			
			elementPage.dateinnerceelli().click();
			Thread.sleep(2000);
			
			
			elementPage.Seearch().click();
			
			WebDriverWait waitt = new WebDriverWait(driver, Duration.ofSeconds(20));
			waitt.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//a[normalize-space()='Search']")));
			
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
	
	@Test(priority = 3, enabled = true, description = "Click on hotels", groups="Regression")
	public void hotels() {
		try {
			elementPage.hotelss().click();
			
		//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//	wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//span[@class='headerIconTextAlignment chNavText darkGreyText'][normalize-space()='Hotels']")));
			
			elementPage.checkiin().click();
			
		//	WebDriverWait waitt = new WebDriverWait(driver, Duration.ofSeconds(10));
		//	waitt.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//input[@id='checkin']")));
			
			elementPage.daate().click();
			
		//	WebDriverWait waiit = new WebDriverWait(driver, Duration.ofSeconds(10));
		//	waiit.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@aria-label='Thu Feb 08 2024']")));
			
			elementPage.retuuu().click();
		//	WebDriverWait waait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//	waait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@aria-label='Sun Feb 11 2024']")));
			
			elementPage.roommss().click();
			
		//	WebDriverWait waittt = new WebDriverWait(driver, Duration.ofSeconds(10));
			//waittt.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//input[@id='guest']")));
			
			elementPage.couunt().click();
			//WebDriverWait waiiitt = new WebDriverWait(driver, Duration.ofSeconds(10));
			//waiiitt.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//span[@class='gstSlct__text'][normalize-space()='2']")));
			
			elementPage.nuumm().click();
			
		//	WebDriverWait waaiittt = new WebDriverWait(driver, Duration.ofSeconds(10));
		//	waaiittt.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//li[normalize-space()='01']")));
			
			
			elementPage.applybttn().click();
			
		//	WebDriverWait waaaitt = new WebDriverWait(driver, Duration.ofSeconds(10));
		//	waaaitt.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//button[normalize-space()='Apply']")));
			
			elementPage.seearrch().click();
			
		//	WebDriverWait waaiitt = new WebDriverWait(driver, Duration.ofSeconds(10));
		//	waaiitt.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//button[@id='hsw_search_button']")));
			
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
	
	@Test(priority = 4, enabled = false, description = "Click on villas", groups="sanity")
	public void villas() {
		try {
			WebElement element = driver.findElement(By.xpath("//span[@class='headerIconTextAlignment chNavText darkGreyText'][normalize-space()='Homestays & Villas']"));
			element.click();
			
			
			WebElement checkin = driver.findElement(By.xpath("//input[@id='checkin']"));
			checkin.click();
			

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//input[@id='checkin']")));
				
			WebElement date = driver.findElement(By.xpath("//div[@aria-label='Thu Feb 08 2024']"));
			date.click();
			
			WebElement chekout = driver.findElement(By.xpath("//div[@aria-label='Sun Feb 11 2024']"));
			chekout.click();
			
			WebElement rooms = driver.findElement(By.xpath("//div[@class='rmsGst__body']//div[1]//div[2]//div[1]"));
			rooms.click();
			
			WebElement num = driver.findElement(By.xpath("//li[normalize-space()='01']"));
			num.click();
			
			WebElement apply = driver.findElement(By.xpath("//button[normalize-space()='Apply']"));
			apply.click();
			
			WebElement search = driver.findElement(By.xpath("//button[@id='hsw_search_button']"));
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
		}
	}
	
	@Test(priority = 5, enabled = false, description = "Click on holidaypackages", groups="Regression")
	public void holidayPackages() throws Throwable {
		try {
			WebElement element = driver.findElement(By.xpath("//span[@class='headerIconTextAlignment chNavText darkGreyText'][normalize-space()='Holiday Packages']"));
			element .click();
			
			
			
			WebElement cancel = driver.findElement(By.xpath("//p[@class='primaryBtnWhite border-btn font16 latoBold']"));
			cancel.click();
			
			
			WebElement fromCity = driver.findElement(By.xpath("//input[@id='fromCity']"));
			fromCity.click();
			
			
			
			WebElement hyd = driver.findElement(By.xpath("//li[@data-testid=\"Hyderabad\"]"));
			hyd.click();
			
			
			
			WebElement Departure = driver.findElement(By.xpath("//span[@class='appendBottom5 field-label down-arrow ']"));
			Departure.click();
			
			
			
			WebElement date = driver.findElement(By.xpath("//div[@aria-label='Fri Feb 09 2024']//div[@class='dateInnerCell']"));
			date.click();
			
			
			WebElement rooms = driver.findElement(By.xpath("//div[@class='field-label down-arrow ']"));
			rooms.click();
		
			
			WebElement datee = driver.findElement(By.xpath("//div[@data-testid='adult-increment-counter']//*[name()='svg']"));
			datee.click();
			
			WebElement child = driver.findElement(By.xpath("//div[@data-testid='child-increment-counter']//*[name()='svg']"));
			child.click();
			
			WebElement childage= driver.findElement(By.xpath("//li[normalize-space()='8']"));
			childage.click();
			Thread.sleep(5000);
			

			
			
			WebElement add = driver.findElement(By.xpath("//button[normalize-space()='APPLY']"));
			add.click();
			Thread.sleep(5000);
			
			WebElement search = driver.findElement(By.xpath("//button[@id='search_button']"));
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
		}
	}
	
	@Test(priority = 6, enabled = false, description = "Click on Trains", groups="sanity")
	public void trains() throws Throwable {
		try {
			WebElement elemenet = driver.findElement(By.xpath("//span[@class='headerIconTextAlignment chNavText darkGreyText'][normalize-space()='Trains']"));
			elemenet.click();
			
			WebElement element = driver.findElement(By.xpath("//input[@id='fromCity']"));
			element.click();
			
			//element.sendKeys("Hyderabad", Keys.ENTER);
			Thread.sleep(3000);
			
			
			
			WebElement from = driver.findElement(By.xpath("//input[@placeholder='From']"));
			from.sendKeys("Hyderabad", Keys.ENTER);
			Thread.sleep(3000);
			from.click();
			
			
			WebElement hyd = driver.findElement(By.xpath("//span[normalize-space()='Hyderabad - All Stations']"));
			hyd.click();
			
			
			WebElement to = driver.findElement(By.xpath("//input[@placeholder='To']"));
			to.sendKeys("Adilabad", Keys.ENTER);
			to.click();
			
			WebElement adb= driver.findElement(By.xpath("//span[normalize-space()='Adilabad']"));
			adb.click();
			
			
			WebElement date = driver.findElement(By.xpath("//div[@aria-label='Fri Feb 09 2024']"));
			date.click();
			
			WebElement classs= driver.findElement(By.xpath("//li[normalize-space()='All Class']"));
			classs.click();
			
			WebElement search = driver.findElement(By.xpath("//a[normalize-space()='Search']"));
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
		}
	}
	
	@Test(priority = 7, enabled = false, description = "Click on buses", groups="Regression")
	public void buses() {
		try {
			WebElement element = driver.findElement(By.xpath("//span[@class='headerIconTextAlignment chNavText darkGreyText'][normalize-space()='Buses']"));
			element.click();
			
			WebElement from = driver.findElement(By.xpath("//input[@id='fromCity']"));
			from.click();
			
			WebElement hyd = driver.findElement(By.xpath("//input[@placeholder='From']"));
			hyd.sendKeys("Hyderabad",Keys.ENTER);
			hyd.click();
			
			WebElement seleect = driver.findElement(By.xpath("//span[normalize-space()='Hyderabad, Telangana']"));
			seleect.click();
			
			WebElement to= driver.findElement(By.xpath("//input[@placeholder='To']"));
			to.sendKeys("Adilabad", Keys.ENTER);
			to.click();
			
			WebElement adb = driver.findElement(By.xpath("//span[normalize-space()='Adilabad, Telangana']"));
			adb.click();
			
			WebElement date = driver.findElement(By.xpath("//div[@aria-label='Fri Feb 09 2024']"));
			date.click();
			
			WebElement search = driver.findElement(By.xpath("//button[@id='search_button']"));
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
		}
	}
	
	@Test(priority = 8, enabled = false, description = "Click on cabs", groups="sanity")
	public void cabs() {
		try {
			WebElement element = driver.findElement(By.xpath("//span[@class='headerIconTextAlignment chNavText darkGreyText'][normalize-space()='Cabs']"));
			element.click();
			
		   WebElement fromcity = driver.findElement(By.xpath("//label[@for='fromCity']"));
		   fromcity.click();
		   
		   WebElement from = driver.findElement(By.xpath("//input[@placeholder='From']"));
		   from.sendKeys("Miyapur");
		   from.click();
		   
		   WebElement select = driver.findElement(By.xpath("//span[normalize-space()='Miyapur, Telangana, India']"));
		   select.click();
				   
		   WebElement to = driver.findElement(By.xpath("//input[@placeholder='To']"));
		   to.sendKeys("Gachibowli");
		   to.click();
		   
		   WebElement gachi = driver.findElement(By.xpath("//span[normalize-space()='Gachibowli, Hyderabad, Telangana, India']"));
		   gachi.click();
		   
		   WebElement date = driver.findElement(By.xpath("//div[@aria-label='Thu Feb 08 2024']"));
		   date.click();
		   
		   
		   WebElement time = driver.findElement(By.xpath("//span[contains(text(),'11')]"));
		   time.click();
		   
		   WebElement timeapply = driver.findElement(By.xpath("//span[@class='applyBtnText']"));
		   timeapply.click();
		   
		   
		   WebElement search = driver.findElement(By.xpath("//a[normalize-space()='Search']"));
		   search.click();
		   
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
		}
	}
	
	@Test(priority = 9, enabled = false, description = "Click on cardCurrency", groups="Regression")
	public void cardCurrency() {
		try {
			
			String expectvalue = "Forex Card & Currency";
			WebElement element = driver.findElement(By.xpath("//span[@class='headerIconTextAlignment chNavText darkGreyText'][normalize-space()='Forex Card & Currency']"));
			element.click();
			
			String actualvalue = element.getText();
			Assert.assertEquals(actualvalue, expectvalue);
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//span[@class='headerIconTextAlignment chNavText darkGreyText'][normalize-space()='Forex Card & Currency']")));
	
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
	
	@Test(priority = 10, enabled = true, description = "Click on travel Insurance", groups="sanity")
	public void travelInsurance() {
		try {
			String expectvalue = "";
			WebElement element = driver.findElement(By.xpath("//span[@class='headerIconTextAlignment chNavText darkGreyText'][normalize-space()='Travel Insurance']"));
			element.click();
			
			String actualvalue = element.getText();
			Assert.assertEquals(actualvalue, expectvalue);
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//span[@class='headerIconTextAlignment chNavText darkGreyText'][normalize-space()='Travel Insurance']")));
	
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
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
}
