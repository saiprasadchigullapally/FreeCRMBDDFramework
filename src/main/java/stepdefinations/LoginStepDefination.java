package stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefination {
	WebDriver driver;

	@Given("^User is already on login page$")
	public void User_is_alredy_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium softwares\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.freecrm.com/index.html");

	}

	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("#1 Free CRM software in the cloud for sales and service", title);
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password() {
		driver.findElement(By.name("username")).sendKeys("saiprasad");
		driver.findElement(By.name("password")).sendKeys("hanuman@12c");

	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_buttons() {
		WebElement loginbtn = driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", loginbtn);

	}

//	@Then("^user is on homepage$")
//	public void user_is_on_homepage() {
//
//		String title = driver.getTitle();
//		System.out.println("home page title is::" + title);
//		Assert.assertEquals("CRMPRO", title);
//
//	}

}
