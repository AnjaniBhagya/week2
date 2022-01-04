package week2day1Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1 {

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver = new ChromeDriver();
	    driver.get("http://leaftaps.com/opentaps/");
	    driver.manage().window().maximize();
	   
	    WebElement username = driver.findElement(By.id("username"));
	   username.sendKeys("DemoSalesManager");
	   driver.findElement(By.id("password")).sendKeys("crmsfa");
	   driver.findElement(By.className("decorativeSubmit")).click();
	   driver.findElement(By.linkText("CRM/SFA")).click();
	   driver.findElement(By.linkText("Contacts")).click();
	   driver.findElement(By.linkText("Create Contact")).click();
	   driver.findElement(By.id("firstNameField")).sendKeys("Anjani");
	   WebElement wfname =driver.findElement(By.id("firstNameField"));	   
	   String fname = wfname.getAttribute("value");	  
	   driver.findElement(By.id("lastNameField")).sendKeys("Bhagya");
	   driver.findElement(By.name("submitButton")).click();
	   
	   System.out.println(fname);
	   String title = driver.getTitle();
	    System.out.println(title);
	    driver.close();
	}

}
