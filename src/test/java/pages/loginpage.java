package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {

	protected WebDriver driver;
	
	private By txt_username = By.id("name");
	
	private By txt_password = By.id("password");
	
	private By submit_btn = By.id("login");
	
	private By Logout_btn = By.id("logout");
	
	public loginpage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void enterUsername(String username)
	{
		driver.findElement(txt_username).sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		driver.findElement(txt_password).sendKeys(password);
	}
	public void submitbutton()
	{
		driver.findElement(submit_btn).click();
	}
	public void logoutbtn()
	{
		driver.findElement(Logout_btn).click();
	}
}
