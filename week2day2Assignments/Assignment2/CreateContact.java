package week2day2Assignments.Assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact 
{
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
	   //createContactForm_firstNameLocal
	   driver.findElement(By.id("lastNameField")).sendKeys("Anjani");
	   driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Anjani");
	   driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Bhagya");
	   driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Information Technology");
	   driver.findElement(By.id("createContactForm_description")).sendKeys("This is the duplicate sample content description");
	   driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("work2anjani@gmail.com");
	   WebElement mywebDD7 = driver.findElement(By.id("createContactForm_generalCountryGeoId"));
	   Select mydd7 = new Select(mywebDD7);
	   if(mydd7.getFirstSelectedOption().isSelected())
	   {
	   WebElement mywebDD6 = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
	   Select mydd6 = new Select(mywebDD6);
	   mydd6.selectByVisibleText("New York");	   
	   }	
	   driver.findElement(By.xpath("//input[@value='Create Contact']")).click();
	   driver.findElement(By.linkText("Edit")).click();
	   driver.findElement(By.id("updateContactForm_description")).clear();
	   driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("This is the Updated Important Note");
	 
	   driver.findElement(By.xpath("//input[@value='Update']")).click();
	   String title1= driver.getTitle();
	   System.out.println("The Title of the page is: "+title1);
	   driver.close();
	   
	}
}
