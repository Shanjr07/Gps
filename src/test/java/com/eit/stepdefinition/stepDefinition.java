package com.eit.stepdefinition;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;


import java.awt.AWTException;
import java.util.List;

import com.eit.objects.GridViewpage;
import com.eit.objects.Loginpage;
import com.eit.resource.base;


public class stepDefinition extends base {
	@BeforeMethod
	public void browse() throws AWTException, InterruptedException {
		openbrowser("https://ntrack.thegoldenelement.com/");
	}
   @Test(priority=1)
   public void English_Login_without_Corporate_ID() {
	   Loginpage page1= new Loginpage();
	   langu(page1.getLang()).selectByIndex(1);
	   waits(page1.getCoopId());
	   page1.getCoopId().clear();
	   clickaction(page1.getLogin());
	   String text = page1.getErrormess().getAttribute("textContent");
	   Assert.assertTrue(text.equals("Enter Corporate ID"));	   
   }
   @Test(priority=2)
   public void Arabic_Login_without_Corporate_ID() {
	   Loginpage page1= new Loginpage();
	   langu(page1.getLang()).selectByIndex(2);
	   waits(page1.getCoopId());
	   page1.getCoopId().clear();
	   clickaction(page1.getAralogin());
	   String text = page1.getErrormess().getAttribute("textContent");
	   Assert.assertTrue(text.equals("أدخل معرف الشركة"));	   
   }
   @Test(priority=3)
   public void English_Login_without_Username() {
	   Loginpage page1= new Loginpage();
	   langu(page1.getLang()).selectByIndex(1);
	   waits(page1.getCoopId());
	   send("demo",page1.getCoopId());
	   page1.getUsername().clear();
	   clickaction(page1.getLogin());
	   String text = page1.getErrormess().getAttribute("textContent");
	   Assert.assertTrue(text.equals("Enter User name"));	   
   }
   @Test(priority=4)
   public void Arabic_Login_without_Username() {
	   Loginpage page1= new Loginpage();
	   langu(page1.getLang()).selectByIndex(2);
	   waits(page1.getCoopId());
	   send("demo",page1.getCoopId());
	   page1.getUsername().clear();
	   clickaction(page1.getAralogin());
	   String text = page1.getErrormess().getAttribute("textContent");
	   Assert.assertTrue(text.equals("أادخل اسم المستخدم"));	   
   }
   @Test(priority=5)
   public void English_Login_without_password() {
	   Loginpage page1= new Loginpage();
	   langu(page1.getLang()).selectByIndex(1);
	   waits(page1.getCoopId());
	   send("demo",page1.getCoopId());
	   send("test",page1.getUsername());
	   page1.getPassword().clear();
	   clickaction(page1.getLogin());
	   String text = page1.getErrormess().getAttribute("textContent");
	   Assert.assertTrue(text.equals("Enter Password"));	   
   }
   @Test(priority=6)
   public void Arabic_Login_without_password() {
	   Loginpage page1= new Loginpage();
	   langu(page1.getLang()).selectByIndex(2);
	   waits(page1.getCoopId());
	   send("demo",page1.getCoopId());
	   send("test",page1.getUsername());
	   page1.getPassword().clear();
	   clickaction(page1.getAralogin());
	   String text = page1.getErrormess().getAttribute("textContent");
	   Assert.assertTrue(text.equals("أدخل كلمة المرور"));	   
   }
   @Test(priority=7)
   public void English_Login_with_incorrect_Corporate_ID() {
	   Loginpage page1= new Loginpage();
	   langu(page1.getLang()).selectByIndex(1);
	   waits(page1.getCoopId());
	   send("AAAA",page1.getCoopId());
	   page1.getUsername().clear();
	   clickaction(page1.getLogin());
	   String text = page1.getErrormess().getAttribute("textContent");
	   Assert.assertTrue(text.equals("Enter Valid Corporate ID"));	   
   }
   @Test(priority=8)
   public void Arabic_Login_with_incorrect_Corporate_ID() {
	   Loginpage page1= new Loginpage();
	   langu(page1.getLang()).selectByIndex(2);
	   waits(page1.getCoopId());
	   send("AAAA",page1.getCoopId());
	   page1.getUsername().clear();
	   clickaction(page1.getAralogin());
	   String text = page1.getErrormess().getAttribute("textContent");
	   Assert.assertTrue(text.equals("أدخل معرف الشركة صالح"));	   
   }
   @Test(priority=9)
   public void English_Login_with_incorrect_User_name() {
	   Loginpage page1= new Loginpage();
	   langu(page1.getLang()).selectByIndex(1);
	   waits(page1.getCoopId());
	   send("demo",page1.getCoopId());
	   send("BBBB",page1.getUsername());
	   page1.getPassword().clear();
	   clickaction(page1.getLogin());
	   String text = page1.getErrormess().getAttribute("textContent");
	   Assert.assertTrue(text.equals("Enter Valid User name"));	   
   }
   @Test(priority=10)
   public void Arabic_Login_with_incorrect_User_name() {
	   Loginpage page1= new Loginpage();
	   langu(page1.getLang()).selectByIndex(2);
	   waits(page1.getCoopId());
	   send("demo",page1.getCoopId());
	   send("BBBB",page1.getUsername());
	   page1.getPassword().clear();
	   clickaction(page1.getAralogin());
	   String text = page1.getErrormess().getAttribute("textContent");
	   Assert.assertTrue(text.equals("أدخل اسم مستخدم صالح"));	   
   }
   @Test(priority=11)
   public void English_Login_with_incorrect_Password() {
	   Loginpage page1= new Loginpage();
	   langu(page1.getLang()).selectByIndex(1);
	   waits(page1.getCoopId());
	   send("demo",page1.getCoopId());
	   send("test",page1.getUsername());
	   send("cccc",page1.getPassword());
	   clickaction(page1.getLogin());
	   String text = page1.getErrormess().getAttribute("textContent");
	   Assert.assertTrue(text.equals("Enter valid Password"));	   
   }
   @Test(priority=12)
   public void Arabic_Login_with_incorrect_Password() {
	   Loginpage page1= new Loginpage();
	   langu(page1.getLang()).selectByIndex(2);
	   waits(page1.getCoopId());
	   send("demo",page1.getCoopId());
	   send("test",page1.getUsername());
	   send("cccc",page1.getPassword());
	   clickaction(page1.getAralogin());
	   String text = page1.getErrormess().getAttribute("textContent");
	   Assert.assertTrue(text.equals("أدخل كلمة مرور صالحة"));	   
   }
   @Test(priority=13)
   public void English_Login() {
	   Loginpage page1= new Loginpage();
	   GridViewpage page2 = new GridViewpage();
	   langu(page1.getLang()).selectByIndex(1);
	   waits(page1.getCoopId());
	   send("demo",page1.getCoopId());
	   send("test",page1.getUsername());
	   send("12345",page1.getPassword());
	   clickaction(page1.getLogin());
	   waitsurl("gridview");
	   Assert.assertTrue(page2.getGrid().isDisplayed());
	   }
	   @Test(priority=14)
	   public void Arabic_Login() {
		   Loginpage page1= new Loginpage();
		   GridViewpage page2 = new GridViewpage();
		   langu(page1.getLang()).selectByIndex(2);
		   waits(page1.getCoopId());
		   send("demo",page1.getCoopId());
		   send("test",page1.getUsername());
		   send("12345",page1.getPassword());
		   clickaction(page1.getAralogin());
		   waitsurl("gridview");
		   Assert.assertTrue(page2.getGrid().isDisplayed());
	   }
	   @Test(priority=15)
	   public void English_Login_RememeberMe(){
	   Loginpage page1= new Loginpage();
	   GridViewpage page2 = new GridViewpage();
	   langu(page1.getLang()).selectByIndex(1);
	   waits(page1.getCoopId());
	   send("demo",page1.getCoopId());
	   send("test",page1.getUsername());
	   send("12345",page1.getPassword());
	   page1.getRememberme().click();
	   clickaction(page1.getLogin());
	   waitsurl("gridview");
	   page2.getLogout().click();
	   waits(page1.getCoopId());
	   driv.navigate().refresh();
	   waits(page1.getCoopId());
	   String co=Attrib(page1.getCoopId());
	   String email=Attrib(page1.getUsername());
	   String pass=Attrib(page1.getPassword());
	   if(co.isEmpty()||email.isEmpty()||pass.isEmpty()) {
	   remember=false;
	   }
	   else{
	   remember = true;
	   }
	   Assert.assertTrue(remember);
	   }
	   @Test(priority=16)
	   public void Arabic_Login_RememeberMe(){
	   Loginpage page1= new Loginpage();
	   GridViewpage page2 = new GridViewpage();
	   langu(page1.getLang()).selectByIndex(2);
	   waits(page1.getCoopId());
	   send("demo",page1.getCoopId());
	   send("test",page1.getUsername());
	   send("12345",page1.getPassword());
	   page1.getRememberme().click();
	   clickaction(page1.getAralogin());
	   waitsurl("gridview");
	   page2.getLogout().click();
	   waits(page1.getCoopId());
	   driv.navigate().refresh();
	   waits(page1.getCoopId());
	   String co=Attrib(page1.getCoopId());
	   String email=Attrib(page1.getUsername());
	   String pass=Attrib(page1.getPassword());
	   if(co.isEmpty()||email.isEmpty()||pass.isEmpty()) {
	   remember=false;
	   }
	   else{
	   remember = true;
	   }
	   Assert.assertTrue(remember);
	   }
	   @Test(priority=17)
	   public void English_ForgetPassword_without_Corporate_ID() {
		   Loginpage page1= new Loginpage();
		   langu(page1.getLang()).selectByIndex(1);
		   waits(page1.getCoopId());
		   page1.getCoopId().clear();
		   clickaction(page1.getForget());
		   clickaction(page1.getSubmit());
		   String text = page1.getErrormess().getAttribute("textContent");
		   System.out.println(text);
		   Assert.assertTrue(text.equals("Enter Corporate ID"));
		   }
	   @Test(priority=18)
	   public void Arabic_ForgetPassword_without_Corporate_ID() {
		   Loginpage page1= new Loginpage();
		   langu(page1.getLang()).selectByIndex(2);
		   waits(page1.getCoopId());
		   page1.getCoopId().clear();
		   clickaction(page1.getForget());
		   clickaction(page1.getSubmit());
		   String text = page1.getErrormess().getAttribute("textContent");
		   System.out.println(text);
		   Assert.assertTrue(text.equals("أدخل معرف الشركة"));
		   }
	   @Test(priority=19)
	   public void English_ForgetPassword_without_User_name() {
		   Loginpage page1= new Loginpage();
		   langu(page1.getLang()).selectByIndex(1);
		   waits(page1.getCoopId());
		   send("demo",page1.getCoopId());
		   page1.getUsername().clear();
		   clickaction(page1.getForget());
		   clickaction(page1.getSubmit());
		   String text = page1.getErrormess().getAttribute("textContent");
		   System.out.println(text);
		   Assert.assertTrue(text.equals("Enter User name"));
		   }
	   @Test(priority=20)
	   public void Arabic_ForgetPassword_without_User_name() {
		   Loginpage page1= new Loginpage();
		   langu(page1.getLang()).selectByIndex(2);
		   waits(page1.getCoopId());
		   send("demo",page1.getCoopId());
		   page1.getUsername().clear();
		   clickaction(page1.getForget());
		   clickaction(page1.getSubmit());
		   String text = page1.getErrormess().getAttribute("textContent");
		   System.out.println(text);
		   Assert.assertTrue(text.equals("أادخل اسم المستخدم"));
		   } 
	   @Test(priority=21)
	   public void English_ForgetPassword_without_Email_ID() {
		   Loginpage page1= new Loginpage();
		   langu(page1.getLang()).selectByIndex(1);
		   waits(page1.getCoopId());
		   send("demo",page1.getCoopId());
		   send("test",page1.getUsername()); 
		   clickaction(page1.getForget());
		   clickaction(page1.getSubmit());
		   String text = page1.getErrormess().getAttribute("textContent");
		   System.out.println(text);
		   Assert.assertTrue(text.equals("Enter your registered Email Id"));
		   }
	   @Test(priority=22)
	   public void Arabic_ForgetPassword_without_Email_ID() {
		   Loginpage page1= new Loginpage();
		   langu(page1.getLang()).selectByIndex(2);
		   waits(page1.getCoopId());
		   send("demo",page1.getCoopId());
		   send("test",page1.getUsername());
		   clickaction(page1.getForget());
		   clickaction(page1.getSubmit());
		   String text = page1.getErrormess().getAttribute("textContent");
		   System.out.println(text);
		   Assert.assertTrue(text.equals("أدخل معرف البريد الإلكتروني المسجل الخاص بك"));
		   }
	   @Test(priority=23)
	   public void English_ForgetPassword_with_incorrect_Corporate_ID() {
		   Loginpage page1= new Loginpage();
		   langu(page1.getLang()).selectByIndex(1);
		   waits(page1.getCoopId());
		   send("AAA",page1.getCoopId());
		   page1.getUsername().clear();
		   clickaction(page1.getForget());
		   clickaction(page1.getSubmit());
		   String text = page1.getErrormess().getAttribute("textContent");
		   System.out.println(text);
		   Assert.assertTrue(text.equals("Enter the correct Corporate ID"));
		   }
	   @Test(priority=24)
	   public void Arabic_ForgetPassword_with_incorrect_Corporate_ID() {
		   Loginpage page1= new Loginpage();
		   langu(page1.getLang()).selectByIndex(2);
		   waits(page1.getCoopId());
		   send("AAA",page1.getCoopId());
		   page1.getUsername().clear();
		   clickaction(page1.getForget());
		   clickaction(page1.getSubmit());
		   String text = page1.getErrormess().getAttribute("textContent");
		   System.out.println(text);
		   Assert.assertTrue(text.equals("أدخل معرف الشركة صالح"));	   
		   } 
	   @Test(priority=25)
	   public void English_ForgetPassword_with_incorrect_User_name() {
		   Loginpage page1= new Loginpage();
		   langu(page1.getLang()).selectByIndex(1);
		   waits(page1.getCoopId());
		   send("demo",page1.getCoopId());
		   send("BBB",page1.getUsername()); 
		   clickaction(page1.getForget());
		   clickaction(page1.getSubmit());
		   String text = page1.getErrormess().getAttribute("textContent");
		   System.out.println(text);
		   Assert.assertTrue(text.equals("Enter the correct User name"));
		   }
	   @Test(priority=26)
	   public void Arabic_ForgetPassword_with_incorrect_User_name() {
		   Loginpage page1= new Loginpage();
		   langu(page1.getLang()).selectByIndex(2);
		   waits(page1.getCoopId());
		   send("demo",page1.getCoopId());
		   send("BBB",page1.getUsername());
		   clickaction(page1.getForget());
		   clickaction(page1.getSubmit());
		   String text = page1.getErrormess().getAttribute("textContent");
		   System.out.println(text);
		   Assert.assertTrue(text.equals("أدخل اسم مستخدم صالح"));	   
		   }
	   @Test(priority=27)
	   public void English_forgetpassword_with_incorrect_password_and_valid_password() throws InterruptedException, AWTException {
		   Loginpage page1= new Loginpage();
		   
		   langu(page1.getLang()).selectByIndex(1);
		   waits(page1.getCoopId());
		   send("demo",page1.getCoopId());
		   send("test",page1.getUsername());
		   clickaction(page1.getForget());
		   for(int i=0;i<3;i++) {
		    	if(i==0){mail="abc@gmail.com";}
		    	else if(i==1){mail="def@gmail.com";}
		    	else if(i==2) {mail="ghi@gmail.com";}
		    send(mail,page1.getEmail());
			clickaction(page1.getSubmit());
			Thread.sleep(4000);
			String text = page1.getErrormess().getAttribute("textContent");
		    System.out.println(text);
		    Assert.assertTrue(text.equals("Invalid Email ID"));
		    page1.getEmail().clear();
		   }
		   send("jagadeshan@eitworks.com",page1.getEmail());
			clickaction(page1.getSubmit());
			Thread.sleep(5000);
			String text = page1.getErrormess().getAttribute("textContent");
		    System.out.println(text);
		    Assert.assertTrue(text.equals("Email sent successfully. Please check your inbox"));
		    URLmail();
			send("jagadeshan@eitworks.com",driv.findElement(By.id("identifierId")));
			clickaction(driv.findElement(By.xpath("//div[@class='ZFr60d CeoRYc']")));
		    Thread.sleep(1000);
			send("eitjagadeshan",driv.findElement(By.xpath("//input[@name='password']")));
			clickaction(driv.findElement(By.xpath("//div[@class='ZFr60d CeoRYc']")));
			Thread.sleep(10000);
			List<WebElement> trow = driv.findElements(By.tagName("tr"));
			System.out.println(trow.size());
			            for(int i=0;i<trow.size();i++){
			            	WebElement TR= trow.get(i);
			            	List<WebElement> tdata = TR.findElements(By.tagName("td"));
			            	for(int j=0;j<tdata.size();j++) {
			                WebElement tdtext=tdata.get(j);
			            	String text1=tdtext.getText();
			            	//System.out.println(text);
			                if(text1.equals("trackingalertsinfo")){  
			                   System.out.println(i);
			                   System.out.println(j);
			                   System.out.println(text1);
			                   tdata.get(j).click();
			                      
			   }}
			}
			            String text2= driv.findElement(By.id(":9o")).getText();
			            String sarray[]=text2.split(" ");
			           
			            	 pass=sarray[sarray.length-1];
			         System.out.println(pass);
			         driv.findElement(By.xpath("//div[@jslog='20283; u014N:cOuCgd,Kr2w4b']")).click();

			         openbrowser("https://ntrack.thegoldenelement.com/");
			         Loginpage page1a=new Loginpage();
			         GridViewpage page2 = new GridViewpage();
			         langu(page1a.getLang()).selectByIndex(1);
					   waits(page1a.getCoopId());
					   send("demo",page1a.getCoopId());
					   send("test",page1a.getUsername());
			           send(pass,page1a.getPassword());
			           clickaction(page1a.getLogin());
			    	   waitsurl("gridview");
			    	   Assert.assertTrue(page2.getGrid().isDisplayed());
			          
	   }
	   @Test(priority=28)
	   public void Arabic_forgetpassword_with_incorrect_password_and_valid_password() throws InterruptedException, AWTException {
		   Loginpage page1= new Loginpage();
		   
		   langu(page1.getLang()).selectByIndex(2);
		   waits(page1.getCoopId());
		   send("demo",page1.getCoopId());
		   send("test",page1.getUsername());
		   clickaction(page1.getForget());
		   for(int i=0;i<3;i++) {
		    	if(i==0){mail="abc@gmail.com";}
		    	else if(i==1){mail="def@gmail.com";}
		    	else if(i==2) {mail="ghi@gmail.com";}
		    send(mail,page1.getEmail());
			clickaction(page1.getSubmit());
			Thread.sleep(4000);
			String text = page1.getErrormess().getAttribute("textContent");
		    System.out.println(text);
		    Assert.assertTrue(text.equals("معرف البريد الإلكتروني غير صالح"));
		    page1.getEmail().clear();
		   }
		   send("jagadeshan@eitworks.com",page1.getEmail());
			clickaction(page1.getSubmit());
			Thread.sleep(5000);
			String text = page1.getErrormess().getAttribute("textContent");
		    System.out.println(text);
		    Assert.assertTrue(text.equals("تم إرسال البريد الإلكتروني بنجاح. يرجى التحقق من البريد الوارد الخاص بك"));
		    URLmail();
			send("jagadeshan@eitworks.com",driv.findElement(By.id("identifierId")));
			clickaction(driv.findElement(By.xpath("//div[@class='ZFr60d CeoRYc']")));
		    Thread.sleep(1000);
			send("eitjagadeshan",driv.findElement(By.xpath("//input[@name='password']")));
			clickaction(driv.findElement(By.xpath("//div[@class='ZFr60d CeoRYc']")));
			Thread.sleep(10000);
			List<WebElement> trow = driv.findElements(By.tagName("tr"));
			System.out.println(trow.size());
			            for(int i=0;i<trow.size();i++){
			            	WebElement TR= trow.get(i);
			            	List<WebElement> tdata = TR.findElements(By.tagName("td"));
			            	for(int j=0;j<tdata.size();j++) {
			                WebElement tdtext=tdata.get(j);
			            	String text1=tdtext.getText();
			            	//System.out.println(text);
			                if(text1.equals("trackingalertsinfo")){  
			                   System.out.println(i);
			                   System.out.println(j);
			                   System.out.println(text1);
			                   tdata.get(j).click();
			                      
			   }}
			}
			            String text2= driv.findElement(By.id(":9o")).getText();
			            String sarray[]=text2.split(" ");
			           
			            	 pass=sarray[sarray.length-1];
			         System.out.println(pass);
			         openbrowser("https://ntrack.thegoldenelement.com/");
			         Loginpage page1a=new Loginpage();
			         GridViewpage page2 = new GridViewpage();
			         langu(page1a.getLang()).selectByIndex(2);
					   waits(page1a.getCoopId());
					   send("demo",page1a.getCoopId());
					   send("test",page1a.getUsername());
			           send(pass,page1a.getPassword());
			           clickaction(page1a.getAralogin());
			    	   waitsurl("gridview");
			    	   Assert.assertTrue(page2.getGrid().isDisplayed());
			          
	   }
	   
	   @AfterMethod
	  public void close()
	  {
		 closeBrowser(); 
	  }
   
}
