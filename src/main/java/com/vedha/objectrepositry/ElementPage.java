package com.vedha.objectrepositry;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.vedha.BaseClass.BaseDriver;

public  class ElementPage extends BaseDriver  {

	String serachBar ="//span[@class=\"bwc__sc-1nbn7v6-8 hbuyht\"]";
		
	public  WebElement search() {
		return driver.findElement(By.xpath(serachBar));
	}
	
	String movies = "//input[@placeholder='Search for Movies, Events, Plays, Sports and Activities']";
	
	public WebElement giveName() {
		return driver.findElement(By.xpath(movies));
	}
	
	
	String movietype = "//a[normalize-space()='Movies']";
	public WebElement typemovie() {
		return driver.findElement(By.xpath(movietype));
		
	}
	
	String streaming = "//a[@class='bwc__sc-1shzs91-0 dTAxii'][normalize-space()='Stream']";
	public WebElement streamm() {
		return driver.findElement(By.xpath(streaming));
	}
	
	String event = "//a[normalize-space()='Events']";
	public WebElement eventss() {
		return driver.findElement(By.xpath(event));
	}
	
	String play = "//a[normalize-space()='Plays']";
	public WebElement playy() {
		return driver.findElement(By.xpath(play));
	}
	
	String sport ="//a[normalize-space()='Sports']";
	public WebElement sportss() {
		return driver.findElement(By.xpath(sport));
	}
	
	String activitie= "//a[@class='bwc__sc-1shzs91-0 jRepsH']";
	public WebElement activiess() {
		return driver.findElement(By.xpath(activitie));
	}
	
	String listyourShow = "//a[normalize-space()='ListYourShow']";
	public WebElement listyourShows() {
		return driver.findElement(By.xpath(listyourShow));
	}
	
	String giftCard ="//a[@class='bwc__sc-1shzs91-4 kztdfO'][normalize-space()='Gift Cards']";
	public WebElement giftCards() {
		return driver.findElement(By.xpath(giftCard));
	}
	
	
	String flight= "//span[@class='headerIconTextAlignment chNavText darkGreyText'][normalize-space()='Flights']";
	public WebElement flightss() {
		return driver.findElement(By.xpath(flight));
	}
	
	String Departuree = "//span[normalize-space()='Departure']";
	public WebElement depaturre() {
		return driver.findElement(By.xpath(Departuree));
	}
	
	String dateInnerCelli = "//div[@aria-label='Thu Feb 08 2024']//div[@class='dateInnerCell']";
	public WebElement dateInnerceell () {
		return driver.findElement(By.xpath(dateInnerCelli));
	}
	
	String Return = "//span[normalize-space()='Return']";
	public WebElement rreturnn() {
		return driver.findElement(By.xpath(Return));
	}
	
	String dateInnerCelll="//div[@aria-label='Fri Feb 09 2024']//div[@class='dateInnerCell']";
	public WebElement dateinnerceelli() {
		return driver.findElement(By.xpath(dateInnerCelli));
		
	}
	
	String Searchhh ="//a[normalize-space()='Search']";
	public WebElement Seearch() {
		return driver.findElement(By.xpath(Searchhh));
	}
	
	String hotels = "//span[@class='headerIconTextAlignment chNavText darkGreyText'][normalize-space()='Hotels']";
	public WebElement hotelss () {
		return driver.findElement(By.xpath(hotels));
	}
	
	String checkin = "//input[@id='checkin']";
	public WebElement checkiin() {
		return driver.findElement(By.xpath(checkin));
	}
	
	String datee = "//div[@aria-label='Thu Feb 08 2024']";
	public WebElement daate () {
		return driver.findElement(By.xpath(datee));
	}
	
	String retuu="//div[@aria-label='Sun Feb 11 2024']";
	public WebElement retuuu() {
		return driver.findElement(By.xpath(retuu));
	}
	
	
	String rooms="//input[@id='guest']";
	public WebElement roommss() {
		return driver.findElement(By.xpath(rooms));
	}
	
	String countt = "//span[@class='gstSlct__text'][normalize-space()='2']";
	public WebElement couunt() {
		return driver.findElement(By.xpath(countt));
	}
	
	String nuum = "//li[normalize-space()='01']";
	public WebElement nuumm() {
		return driver.findElement(By.xpath(nuum));
	}
	
	
	String applubtn = "//button[normalize-space()='Apply']";
	public WebElement applybttn () {
		return driver.findElement(By.xpath(applubtn));
		
	}
	
	String seaarchh="//button[@id='hsw_search_button']";
	public WebElement seearrch() {
		return driver.findElement(By.xpath(seaarchh));
	}
}



