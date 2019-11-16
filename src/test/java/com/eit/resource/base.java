package com.eit.resource;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class base {
	public static WebDriver driv;
	public static Select s;
	public static Wait<WebDriver> gWait;
	public static Wait<WebDriver> aWait;
	public static Boolean remember;
	public static Actions a;
	public static String mail,pass;
	public void openbrowser(String url) throws AWTException, InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\JAGADESHAN R\\eclipse\\jaga01\\GPS\\driver\\chromedriver.exe");
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
	    chromePrefs.put("credentials_enable_service", false);
        options.setExperimentalOption("prefs", chromePrefs);
	    driv = new ChromeDriver(options);
        driv.get(url);
		driv.manage().window().maximize();
		}
	  public void closeBrowser() {
		  driv.close();
	  }
	  public Select langu(WebElement e) {
		s=new Select(e);
		return s;
		}
	  public void send(String value,WebElement ele) {
		  ele.sendKeys(value);
	  }
	  public void click(WebElement ele)
	  {
		ele.click();
	  }
      public void clickaction(WebElement elem) {
    	  a= new Actions(driv);
    	  a.moveToElement(elem).click().build().perform();
	
       }
      public void waits(WebElement eleme) {
    	  gWait = new FluentWait<WebDriver>(driv).withTimeout(Duration.ofSeconds(60))
  		        .pollingEvery(Duration.ofMillis(500)).ignoring(Exception.class);
    	  gWait.until(ExpectedConditions.elementToBeClickable(eleme));
      }
      public void waitsurl(String url) {
    	  gWait = new FluentWait<WebDriver>(driv).withTimeout(Duration.ofSeconds(60))
  		        .pollingEvery(Duration.ofMillis(500)).ignoring(Exception.class);
    	  gWait.until(ExpectedConditions.urlContains(url));
      }
      public String Attrib(WebElement ele) {
    	String text= ele.getAttribute("value");  
      return text;
      }
      public void URLmail() {
    	    driv.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

      }
      public void waitss() {
    	  driv.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
      }
}
