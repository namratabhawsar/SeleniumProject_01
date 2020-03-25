package PageRepositories;

import java.security.PublicKey;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.Base;

public class SignUpClass extends Base{

	/*
	 * @FindBy(xpath="//span[contains(text(),'Log In')]") private WebElement
	 * login_btn;
	 */

	@FindBy(linkText="Register »")
	private WebElement register;

	@FindBy(id = "x")
	private WebElement username;

	@FindBy(id = "m")
	private WebElement password;

	@FindBy(id = "c")
	private WebElement password2;

	@FindBy(xpath = "//input[@id='u']")
	private WebElement email;

	@FindBy(xpath = "//input[@name='register']")
	private WebElement register2;


	public SignUpClass() 
	{
		PageFactory.initElements(driver,this);
	}

	WebDriverWait wait = new WebDriverWait(driver,20);

	/*
	 * public void func_clickOnLogin() {
	 * wait.until(ExpectedConditions.visibilityOf(login_btn)); try {
	 * if(login_btn.isDisplayed() && login_btn.isEnabled()) { login_btn.click(); } }
	 * catch (Exception e) { e.printStackTrace(); } //else throw new
	 * RuntimeException("UserId element is not present");
	 * 
	 * }
	 */

	public void Register()
	{
		wait.until(ExpectedConditions.visibilityOf(register));
		try 
		{
			if(register.isDisplayed() && register.isEnabled())
			{
				register.click();
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void Username()
	{
		wait.until(ExpectedConditions.visibilityOf(username));
		try
		{
			if(username.isDisplayed() && username.isEnabled())
			{
				username.sendKeys("npersonal");				
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}

	public void Password()

	{
		wait.until(ExpectedConditions.visibilityOf(password));
		try
		{
			if(password.isDisplayed() && password.isEnabled())
			{
				password.sendKeys("namrata123");
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}

	}

	public void Password2()
	{
		wait.until(ExpectedConditions.visibilityOf(password2));
		try
		{
			if(password2.isDisplayed() && password2.isEnabled())
			{
				password2.sendKeys("namrata123");
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void Email()
	{
		wait.until(ExpectedConditions.visibilityOf(email));
		try
		{
			if(email.isDisplayed() && email.isEnabled())
			{
				email.sendKeys("npersonal@yahoo.com");
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	public void register2() 
	{
		wait.until(ExpectedConditions.visibilityOf(register2));
		try
		{
			if(register2.isDisplayed() && register2.isEnabled())
			{
				register2.click();
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}
}