package week2day2Assignments.Assignment2;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead 
{
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver = new ChromeDriver();
	    driver.get("http://leaftaps.com/opentaps/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    WebElement username = driver.findElement(By.id("username"));
	   username.sendKeys("DemoSalesManager");
	   driver.findElement(By.id("password")).sendKeys("crmsfa");
	   driver.findElement(By.className("decorativeSubmit")).click();
	   driver.findElement(By.linkText("CRM/SFA")).click();
	   driver.findElement(By.linkText("Leads")).click();
	   driver.findElement(By.linkText("Find Leads")).click();
	   driver.findElement(By.xpath("//span[contains(text(),'Email')]/ancestor::a")).click();
	   driver.findElement(By.name("emailAddress")).sendKeys("work2anjani@gmail.com");
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	   
	   driver.findElement(By.xpath("//button[text()='Find Leads']")).click(); 
	   //thread sleep
	   try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	   System.out.println("Find Leads are displayed.");
	   String leadname=" ";	   
	    leadname = driver.findElement(By.xpath("//div[@class=\"x-grid3-cell-inner x-grid3-col-firstName\"]//a[1]")).getText();	  	   
	    driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[@class='linktext'])[1]")).click();
	    driver.findElement(By.xpath("//a[@class='subMenuButton' and contains(text(),'Duplicate Lead') ]")).click();
	   
	   String title1 = driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
	   System.out.println("Page Title now is : "+title1);
	   driver.findElement(By.xpath("//input[@type='submit'and @value='Create Lead']")).click();
	   
	   System.out.println("Now in Create Lead Section ");
	   String leadname2 = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
	   System.out.println(leadname2);
	   if(leadname.equals(leadname2))
	   {
		 System.out.println("Duplicate Name is same as Captured");  
	   }
	  
	}
}
