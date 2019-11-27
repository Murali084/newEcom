package org.test.pra;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo extends Basecls {
	
	public Pojo () {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='accountInner']")
	private WebElement login;

	public WebElement getLogin() {
		return login;
	}
	
	@FindBy(xpath="//a[text()='login']")
	private WebElement log;

	public WebElement getLog() {
		return log;
	}
		@FindBy(id="userName")
		private WebElement log1;
		
		@FindBy(id="j_password_login_uc")
		private WebElement log2;

		public WebElement getLog1() {
			return log1;
		}

		public WebElement getLog2() {
			return log2;
		}
		@FindBy(id="checkUser")
		private WebElement btn1;
		public WebElement getBtn1() {
			return btn1;
		}

		public WebElement getBtn2() {
			return btn2;
		}

		@FindBy(id="submitLoginUC")
		private WebElement btn2;
		
		@FindBy(id="inputValEnter")
		private WebElement srch;

		public WebElement getSrch() {
			return srch;
		}
		
		@FindBy(xpath="//span[text()='Search']")
		private WebElement srch2;
		

		public WebElement getSrch2() {
			return srch2;
		}
		@FindBy(xpath="(//img[contains(@title,'Apple iPhone 7')])[1]")
		private WebElement phn;

		public WebElement getPhn() {
			return phn;
		}
		@FindBy(xpath="//span[text()='buy now']")
		private WebElement btn3;

		public WebElement getBtn3() {
			return btn3;
		}
		
}


