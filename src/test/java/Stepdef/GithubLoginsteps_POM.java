package Stepdef;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.loginpage;

public class GithubLoginsteps_POM {
	
	EdgeDriver driver=null;
	loginpage logins;
	
	@Given("browser is open Now")
	public void browser_is_open_now() throws Exception {
		System.out.println("=== Inside logindemo file ===");
		System.out.println("Inside step- Broser is open");
		System.setProperty("webdriver.edge.driver", "C:/Users/Admin/eclipse-workspace/Cucumberjava/src/test/resources/Drivers/msedgedriver.exe");
		driver = new EdgeDriver();
		Thread.sleep(8000);
	}

	@And("user is on login page Now")
	public void user_is_on_login_page_now() throws Exception {
	  driver.navigate().to("https://example.testproject.io/web/");
	  Thread.sleep(8000);
	}

	@When("User enter username and password")
	public void user_enter_username_and_password() throws Exception {
		logins = new loginpage(driver);
		logins.enterUsername("Durga");
		logins.enterPassword("12345");
	  /* driver.findElement(By.id("login_field")).sendKeys("bprasad.dp@gmail.com");
	   Thread.sleep(5000);
	   driver.findElement(By.id("password")).sendKeys("1234567");*/
	   Thread.sleep(5000);
	}

	@Then("User click on login button")
	public void user_click_on_login_button()  {
		logins.submitbutton();
		//driver.findElement(By.name("commit")).sendKeys("");
		
	}
	@Then("click on logout button") 
	public void click_on_logout_button() throws Exception
	{
		logins.logoutbtn();
		Thread.sleep(5000);
		
		driver.quit();
	}
}
