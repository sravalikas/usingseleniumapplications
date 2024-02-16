package com.vedha.usingseleniumapplications;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demoqa {
	
	WebDriver driver;
	
	@BeforeMethod
	public void browserLauch() {
		try {
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demoqa.com/elements");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			Assert.assertFalse(false);
		}
	}
	
	
	@Test(priority = 2,enabled = true, description = "element click", groups = "Full Name")
		public void elementclick() {
			try {
				String ExpectedValue= "Full Name";
				WebElement element = driver.findElement(By.id("userName-label"));
				
				String Actualvalue = element.getText();
				Assert.assertEquals(Actualvalue, ExpectedValue);
				
			    element = driver.findElement(By.xpath("//input[@id='userName']"));
				String Acutal_element=element.getAttribute("id");
				Assert.assertEquals(Acutal_element, ExpectedValue);
				
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
				wait.until(ExpectedConditions.presenceOfElementLocated(By.id("userName")));
				element.click();
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				Assert.assertFalse(false);
			}
			
	}
			
	@Test(priority = 3,enabled = true, description = "text click", groups = {"TeXtBox",""})
			public void textBox() {
		try {
				WebElement element = driver.findElement(By.xpath("//div[contains(@class,'element-list collapse show')]//li[@id='item-0']"));
				element.click();
				
				String expectedvalue= "item-0";
				element.findElement(By.xpath("//input[@id='userName']")).sendKeys("Sravalika");
				String Acutalvalue = element.getAttribute("id");
				
				Assert.assertEquals(Acutalvalue, expectedvalue);
				
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
				wait.until(ExpectedConditions.presenceOfElementLocated(By.id("userName")));
				
				
				String Expecteddvalue="li";
				element.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("sravalikasuddala95@gmail.com");
				String Actuallvalue=element.getTagName();
				Assert.assertEquals(Actuallvalue, Expecteddvalue);
				
				WebDriverWait waitt = new WebDriverWait(driver, Duration.ofSeconds(5));
				waitt.until(ExpectedConditions.presenceOfElementLocated(By.id("userEmail")));
				
				String Expecctedvalue="Text Box";
				element.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("Life style Dream Homes");
				String AcctualValue = element.getText();
				Assert.assertEquals(AcctualValue, Expecctedvalue);
				
				WebDriverWait waiit = new WebDriverWait(driver, Duration.ofSeconds(5));
				waiit.until(ExpectedConditions.presenceOfElementLocated(By.id("currentAddress")));
				
				
				String Exppecctedvalue="Text Box";
				element.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("Life style Dream Homes");
				String AccttualValue = element.getText();
				Assert.assertEquals(AccttualValue, Exppecctedvalue);
				
				WebDriverWait waait = new WebDriverWait(driver, Duration.ofSeconds(5));
				waait.until(ExpectedConditions.presenceOfElementLocated(By.id("permanentAddress")));
				
				
				
				String expectvaluue="li";
				element.findElement(By.xpath("//button[@id='submit']")).click();
				String ActuallValue=element.getTagName();
				Assert.assertEquals(ActuallValue, expectvaluue);
				element.click();
				
				WebDriverWait waaiit = new WebDriverWait(driver, Duration.ofSeconds(10));
				waaiit.until(ExpectedConditions.presenceOfElementLocated(By.id("submit")));
				
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			Assert.assertFalse(false);
		}
				
			}
	@Test(priority = 4,enabled = true, description = "check box click", groups = "checkBox")
	public void checkBox() {
		try {
			WebElement element = driver.findElement(By.xpath("//li[@id=\"item-1\"]"));
			element.click();
			
			String ExpectedValue="btn btn-light active";
			element.findElement(By.xpath("//span[@class='rct-title']")).click();
			String ActualValue=element.getAttribute("class");
			Assert.assertEquals(ActualValue, ExpectedValue);
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			wait.until(ExpectedConditions.elementToBeClickable(By.className("rct-title")));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			Assert.assertFalse(false);
			
		}
	}
	
	@Test
	public void radioButton() {
		WebElement element = driver.findElement(By.xpath("//label[text()='Yes']/preceding-sibling::input"));
		element.click();
		//Assert.assertTrue(element.isSelected(),  "The 'Yes' radio button is not selected");
		
	}
		}
	
	
	

