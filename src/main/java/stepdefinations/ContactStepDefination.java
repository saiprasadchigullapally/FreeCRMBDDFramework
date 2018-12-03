package stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;

public class ContactStepDefination {
	WebDriver driver=new ChromeDriver();
	
	@Given("^User is already on homepage$")
	public void user_is_already_on_homepage() {
		driver.get("https://www.freecrm.com/index.html");
		driver.findElement(By.name("username")).sendKeys("saiprasad");
		driver.findElement(By.name("password")).sendKeys("hanuman@12c");
		WebElement loginbtn = driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", loginbtn);
		driver.switchTo().frame("mainpanel");
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("// a[text()='Contacts']"))).build().perform();
		driver.findElement(By.xpath("//a[text()='New Contact']")).click();
		driver.findElement(By.id("first_name")).sendKeys("Gubba");
		driver.findElement(By.id("surname")).sendKeys("workhard");
		driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
		
		
	}

	

}
