package week2day2Assignments.Assignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
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
	   driver.findElement(By.xpath("//span[contains(text(),'Name and ID')]/ancestor::a")).click();
	   driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Anjani");
	   driver.findElement(By.xpath("//button[text()='Find Leads']")).click(); 
	   try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	   driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[@class='linktext'])[1]")).click();
	   String title1 = driver.getTitle();
	   System.out.println("The Page Title is: "+title1);
	    driver.findElement(By.xpath("//a[@class='subMenuButton' and contains(text(),'Edit') ]")).click();
	    System.out.println("We are in Edit Page .");
	    String compname = driver.findElement(By.id("updateLeadForm_companyName")).getAttribute("value");
	    System.out.println("The Present Company Name is : "+compname);
	    driver.findElement(By.id("updateLeadForm_companyName")).clear();
	    driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Changed Company Name");
	    driver.findElement(By.xpath("//input[@value=\"Update\" and @type='submit']")).click();
	    System.out.println("We are in the View Lead Page . ");
	    String newcompname = driver.findElement(By.id("viewLead_firstName_sp")).getText();
	    System.out.println("The Edited Company Name is : "+newcompname);
	    driver.close();
	}

}
