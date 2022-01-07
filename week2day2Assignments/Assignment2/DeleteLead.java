package week2day2Assignments.Assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver = new ChromeDriver();
	    driver.get("http://leaftaps.com/opentaps/");
	    driver.manage().window().maximize();
		
	    WebElement username = driver.findElement(By.id("username"));
	   username.sendKeys("DemoSalesManager");
	   driver.findElement(By.id("password")).sendKeys("crmsfa");
	   driver.findElement(By.className("decorativeSubmit")).click();
	   driver.findElement(By.linkText("CRM/SFA")).click();
	   driver.findElement(By.linkText("Leads")).click();
	   driver.findElement(By.linkText("Find Leads")).click();
	   driver.findElement(By.xpath("(//a[@class='x-tab-right'])[2]")).click();
	   driver.findElement(By.name("phoneAreaCode")).sendKeys("222");
	   driver.findElement(By.name("phoneNumber")).sendKeys("333333");
	   driver.findElement(By.xpath("//button[@class='x-btn-text'and text()='Find Leads']")).click(); String
	   str1 = driver.findElement(By.xpath("(//a)[68]")).getText();
	   System.out.println(str1); 
	   driver.findElement(By.xpath("(//a)[68]")).click();
	   driver.findElement(By.className("subMenuButtonDangerous")).click();
	   driver.findElement(By.linkText("Find Leads")).click();
	   driver.findElement(By.name("id")).sendKeys(str1);
	   driver.findElement(By.xpath("//button[@class='x-btn-text'and text()='Find Leads']")).click();
	   String str2 = driver.findElement(By.className("x-paging-info")).getText();
	   System.out.println(str2);
	   driver.close();
	}

}
