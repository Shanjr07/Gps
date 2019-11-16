package com.eit.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eit.resource.base;

public class GridViewpage   extends base{
		public GridViewpage() {
			PageFactory.initElements(driv,this);
			
		}
		@FindBy(xpath="//a[@href='#/gridview']")
		private WebElement Grid;
		public WebElement getGrid() {
			return Grid;
		}
		@FindBy(id="logout_sidebarId")
		private WebElement logout;
		public WebElement getLogout() {
			return logout;
		}

}
