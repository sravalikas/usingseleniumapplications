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
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BurgerKing {
	
	WebDriver driver;
	
	
	@BeforeMethod
	public void browserLauch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.burgerking.in/");
	}

	@Test(priority = 3, enabled = false, description = "Click on  delivery", groups="Regression")
	public void delivery() throws Throwable {
		try {
			
			String Expectedvalue= "DINE-IN/TAKEAWAY";
			
			WebElement element = driver.findElement(By.xpath("//div[contains(@class,'toggle__left')]"));
			element.click();
			
			String Actualvalue = element.getText();
			Assert.assertEquals(Actualvalue, Expectedvalue);
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[contains(@class,'toggle__left')]")));
			
			
			Thread.sleep(3000);
			
			String ExpectedValue= "DINE-IN/TAKEAWAY";
			
			WebElement delivary = driver.findElement(By.xpath("//div[normalize-space()='delivery']"));
			delivary.click();
			
			String ActualValue = element.getText();
			Assert.assertEquals(ActualValue, ExpectedValue);
			
			WebDriverWait waitt = new WebDriverWait(driver, Duration.ofSeconds(10));
			waitt.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[normalize-space()='delivery']")));
			
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
	
	@Test(priority = 2, enabled = false, description = "Click on  nearByStores", groups="sanity")
	public void nearByStores() {
		try {
			String Expectedvalue= "NEARBY STORES";
			
			WebElement element = driver.findElement(By.xpath("//span[normalize-space()='Nearby Stores']"));
			element.click();
			
			
			String Actualvalue = element.getText();
			Assert.assertEquals(Actualvalue, Expectedvalue);
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//span[normalize-space()='Nearby Stores']")));
			
			String ExpectedValue= "NEARBY STORES";
			
			WebElement searchBar = driver.findElement(By.xpath("//input[contains(@placeholder,'Search for your location')]"));
			searchBar.sendKeys("Beeramguda", Keys.ENTER);
			
			String ActualValue = element.getText();
			Assert.assertEquals(ActualValue, ExpectedValue);
			
			WebDriverWait waitt = new WebDriverWait(driver, Duration.ofSeconds(10));
			waitt.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//input[contains(@placeholder,'Search for your location')]")));
			
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
	
	@Test(priority = 3, enabled = false, description = "Click on  kingDeals", groups="Regression")
	public void kingDeals() {
		try {
			
			String Expectedvalue= "KING DEALS";
			
			WebElement element = driver.findElement(By.xpath("//span[normalize-space()='King Deals']"));
			element.click();
			
			String Actualvalue = element.getText();
			Assert.assertEquals(Actualvalue, Expectedvalue);
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//span[normalize-space()='King Deals']")));
			
			
			String ExpectedValue= "KING DEALS";
			
			WebElement drivein = driver.findElement(By.xpath("//div[@class='u_cursor_pointer rst-or-type__item delivery  ']"));
			drivein.click();
			
			String ActualValue = element.getText();
			Assert.assertEquals(ActualValue, ExpectedValue);
			
			WebDriverWait waitt = new WebDriverWait(driver, Duration.ofSeconds(10));
			waitt.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='u_cursor_pointer rst-or-type__item delivery  ']")));
			
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
	
	@Test(priority = 4, enabled = false, description = "Click on  location", groups="sanity")
	public void location() {
		try {
			
			String Expectedvalue= "span";
			
			WebElement element = driver.findElement(By.xpath("//span[@class='location-input__value']"));
			element.click();
			

			String Actualvalue = element.getTagName();
			Assert.assertEquals(Actualvalue, Expectedvalue);
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//span[@class='location-input__value']")));
			
			
			
			String ExpectedValue= "span";
			
			WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search for your location']"));
			search.sendKeys("Beeramguda", Keys.ENTER);
			

			String ActualValue = element.getTagName();
			Assert.assertEquals(ActualValue, ExpectedValue);
			
			WebDriverWait waiit = new WebDriverWait(driver, Duration.ofSeconds(10));
			waiit.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//input[@placeholder='Search for your location']")));
			
			
			
			String ExpectedVAlue= "span";
			
			WebElement confirm = driver.findElement(By.xpath("//span[normalize-space()='Confirm Location']"));
			confirm.click();
			

			String ActualVAlue = element.getTagName();
			Assert.assertEquals(ActualVAlue, ExpectedVAlue);
			
			WebDriverWait waitt = new WebDriverWait(driver, Duration.ofSeconds(10));
			waitt.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//span[normalize-space()='Confirm Location']")));
			
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
	
	@Test(priority = 5, enabled = false, description = "Click on  explorefullmenu", groups="Regression")
	public void explorefullmenu() {
		try {
			
			String ExpectedValue= "span";
			
			WebElement element = driver.findElement(By.xpath("//span[contains(@class,'button__content')]"));
			element.click();
			element.sendKeys(Keys.PAGE_DOWN);
			
			String ActualValue = element.getTagName();
			Assert.assertEquals(ActualValue, ExpectedValue);
			
			WebDriverWait waiit = new WebDriverWait(driver, Duration.ofSeconds(10));
			waiit.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//span[contains(@class,'button__content')]")));
			
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
	
	
	
	
}
