

package stepdef3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class stepdef3 {
	WebDriver driver;

	@Given("^OPEN FB URL$")
	public void open_FB_URL() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		 
	}

	@Then("^ENTER INVlid USER AND PASSWORD$")
	public void enter_INVlid_USER_AND_PASSWORD() throws Throwable {
		driver.findElement(By.id("email")).sendKeys("ahgdrw245");
		driver.findElement(By.id("pass")).sendKeys("7890321");
		Thread.sleep(5000);
	}

	@Then("^CLICK ON LOGIN$")
	public void click_ON_LOGIN() throws Throwable {
		  driver.findElement(By.name("login")).click();
		   Thread.sleep(5000);
			
	}

	@Then("^VERIFY USER SHOULD NOT LOGIN$")
	public void verify_USER_SHOULD_NOT_LOGIN() throws Throwable {
		 boolean r= driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[2]/div[2]/form/div/div[1]/div[2]/a")).isDisplayed();
		  Assert.assertTrue(r);
		  Thread.sleep(5000);
		  driver.close(); 
	}
	
}
	
	
		



