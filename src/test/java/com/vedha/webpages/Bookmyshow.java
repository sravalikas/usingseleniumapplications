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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.vedha.objectrepositry.ElementPage;



public abstract class Bookmyshow extends ElementPage {

	ElementPage elementPage;
	
	
	//WebDriver driver;
	@BeforeMethod
	public void launchBrowser() {
  
		//to launch Browser
		driver = chromeBrowser("https://in.bookmyshow.com/explore/home/hyderabad");

	}
	@Test(priority = 1, enabled = false, description = "click on search bar", groups = "Regression")
	public void searchBar() {
		try {
			
			String ExpectedValue= "Search for Movies, Events, Plays, Sports and Activities";
			//To searbar TextBox
			elementPage.search().click();		
			
			String Actualvalue = elementPage.search().getText();
			Assert.assertEquals(Actualvalue, ExpectedValue);
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class=\"bwc__sc-1nbn7v6-8 hbuyht\"]")));
			
			//To search Bar Given Text
			elementPage.giveName().sendKeys("Hanuman", Keys.ENTER);
			
			WebDriverWait waitt = new WebDriverWait(driver, Duration.ofSeconds(10));
			waitt.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@placeholder='Search for Movies, Events, Plays, Sports and Activities']")));
			
			
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			System.out.println("Element was not found sorry");
	    }
		catch (NoAlertPresentException e) 
	    {
	    	System.out.println("Alert was not found sorry");
	    }
		catch ( NullPointerException e) 
	    {
	    	System.out.println("NullPointerException");
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
		}finally {
			//driver.quit();
		}
	
	}
	
	@Test(priority = 2, enabled = false, description = "Click on moviess", groups = "Sanity")
	public void moviess()  {
		
		try {
			String ExpectedValue = "kdfiud";
			
			//Click on movie
			elementPage.typemovie().click(); 
			String ActualValue = elementPage.typemovie().getAttribute("class");
			
			Assert.assertEquals(ActualValue, ExpectedValue);
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[normalize-space()='Movies']")));
	
			
		}
		catch (NoSuchElementException e) {
			// TODO: handle exception
			System.out.println("Element was not found sorry");
	    }
		catch (NoAlertPresentException e) 
	    {
	    	System.out.println("Alert was not found sorry");
	    }
		catch ( NullPointerException e) 
	    {
	    	System.out.println("NullPointerException");
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
		}finally {
			//driver.quit();
		}
	
		
	}
	
	@Test(priority = 3, enabled = false, description = "Click on stream", groups = "Regression")
	public void stream() throws Exception {
		try {
			String EXpectedValue = "juu";
			
			elementPage.streamm().click();
			
			String ActualValue= elementPage.streamm().getText();
			Assert.assertEquals(ActualValue, EXpectedValue);
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//a[@class='bwc__sc-1shzs91-0 dTAxii'][normalize-space()='Stream']")));
			
			
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
	    
		
			 WebElement element = driver.findElement(By.xpath("//a[@class='bwc__sc-1shzs91-0 dTAxii'][normalize-space()='Stream']"));
			element.click();

			// TODO: handle exception
			Assert.assertTrue(true);
			
	    }finally {
	    	//driver.close();
	    }

	
	}
	
	@Test(priority = 4, enabled = false, description = "Click on events", groups = "sanity")
	public void events() {
		try {

			String ExpectedValue="Events";
			
			elementPage.eventss();
			
			String ActualValue=elementPage.eventss().getText();
			Assert.assertEquals(ActualValue, ExpectedValue);
			
		
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//a[normalize-space()='Events']")));
			
			//wait.until(ExpectedConditions.refreshed(ExpectedConditions.stalenessOf(element)));

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
	    
		
			// TODO: handle exception
			Assert.assertTrue(true);
			
	    }finally {
	    	//driver.close();
	    }

	
		}
		
	@Test(priority = 5, enabled = false, description = "Click on play", groups = "Regression")
	public void plays() {
		try {
			String ExpectedValue= "Full Name";
			
			elementPage.playy().click();
			
			String ActualValue = elementPage.playy().getTagName();
			Assert.assertEquals(ActualValue, ExpectedValue);
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[normalize-space()='Plays']")));
			
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
	    
		
			// TODO: handle exception
			Assert.assertTrue(true);
			
	    }finally {
	    	//driver.close();
	    }
		}
	
	
	@Test(priority = 6, enabled = false, description = "Click on sports", groups = "sanity")
	public void sports() {
		try {
		//	String  ExpectedValue = "Sports";
			
			elementPage.playy();
			
			//Actions ac = new Actions(driver);
			//ac.moveToElement(elementPage);
			//elementPage.click();
		//	String ActualValue = elementPage.getText();
			
			//Assert.assertEquals(ActualValue, ExpectedValue);
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[normalize-space()='Sports']")));
			
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
	    
		
			// TODO: handle exception
			Assert.assertTrue(true);
			
	    }finally {
	    	//driver.close();
	    }
		}
	
	@Test(priority = 7, enabled = false, description = "Click on activities", groups = "Regression")
	public void activities() {
		try {
		//	String  ExpectedValue = "";
			
			elementPage.activiess();
			
		/*	Actions ac = new Actions(driver);
			ac.doubleClick(elementPage);
			elementPage.click();
			String ActualValue = elementPage.getText();*/
			
			//Assert.assertEquals(ActualValue, ExpectedValue);
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='bwc__sc-1shzs91-0 jRepsH']")));
			
			
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
	    
		
			// TODO: handle exception
			Assert.assertTrue(true);
			
	    }finally {
	    	//driver.close();
	    }
	}	
	
	
	@Test(priority = 8, enabled = false, description = "Click on List Your Show", groups = "sanity")
	public void ListYourShow() {
		try {
		//	String  ExpectedValue = "";
			
			elementPage.listyourShows();
			
		/*	Actions ac = new Actions(driver);
			ac.doubleClick(elementPage);
			elementPage.click();
			String ActualValue = elementPage.getText();
			
			Assert.assertEquals(ActualValue, ExpectedValue);*/
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[normalize-space()='ListYourShow']")));
			
			
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
	    
		
			// TODO: handle exception
			Assert.assertTrue(true);
			
	    }finally {
	    	//driver.close();
	    }
	}	
	
	
	@Test(priority = 9, enabled = false, description = "Click on GiftCards", groups = "Regression")
	public void  GiftCards () {
		try {
		//	String  ExpectedValue = "";
			
			elementPage.giftCards();
			
		//	Actions ac = new Actions(driver);
		/*	ac.doubleClick(elementPage);
			elementPage.click();
			String ActualValue = elementPage.getText();
			
			Assert.assertEquals(ActualValue, ExpectedValue);*/
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='bwc__sc-1shzs91-4 kztdfO'][normalize-space()='Gift Cards']")));
			
			
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
	    
		
			// TODO: handle exception
			Assert.assertTrue(true);
			
	    }finally {
	    	//driver.close();
	    }
	}
	
	/*@AfterMethod
     public void closeBrowser() {
		
		  driver.close();
	}*/
}
	
	


	
	

