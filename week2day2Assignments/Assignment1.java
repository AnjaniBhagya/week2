package week2day2Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E://MyTestLeaf//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//day month year
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Anjani");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Bhagya");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("work2anjani@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("testleaf@123");
		WebElement mywebDD1 = driver.findElement(By.id("day"));
		Select dd1 = new Select(mywebDD1);
		WebElement mywebDD2 = driver.findElement(By.id("month"));
		Select dd2 = new Select(mywebDD2);
		WebElement mywebDD3 = driver.findElement(By.id("year"));
		Select dd3 = new Select(mywebDD3);
		dd1.selectByIndex(8);
		dd2.selectByIndex(9);
		dd3.selectByVisibleText("1999");
		driver.findElement(By.xpath("//input[@value='1']")).click();
		System.out.println("All Steps Performed.");
		//driver.close();
	}

}
