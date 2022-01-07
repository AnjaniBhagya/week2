package week2day2Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4part4 {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		// Using get method
		driver.get("http://leafground.com/pages/checkbox.html");
		
		//Selecting Checkbox
		System.out.println("Selecting the language I know.");
		driver.findElement(By.xpath("//div[text()='Java']/input")).click();
		
		//Verifying whether checked or not
		boolean selec = driver.findElement(By.xpath("//div[text()='Selenium']/input")).isSelected();
		if (selec) {
			System.out.println("Yes Selenium is selected.");
			
		} else {
			System.out.println("Yes Selenium is not selected.");
		}
		
		//Deselecting the selected checkbox
		System.out.println("Now deselecting the selected ones .");
		if(driver.findElement(By.xpath("//div[text()='Not Selected']/input")).isSelected())
		{
			driver.findElement(By.xpath("//div[text()='Not Selected']/input")).click();
		}
		else
		{
			System.out.println("This checkbox with text[Not Selected] was not selected.");
		}
		if(driver.findElement(By.xpath("//div[text()='I am Selected']/input")).isSelected())
		{
			driver.findElement(By.xpath("//div[text()='I am Selected']/input")).click();
		}
		else
		{
			System.out.println("This checkbox with text[I am Selected] was not selected.");
		}
		
		//Selecting all checkboxes
		System.out.println("Now Selecting all the options: ");
		driver.findElement(By.xpath("//div[text()='Option 1']/input")).click();
		driver.findElement(By.xpath("//div[text()='Option 2']/input")).click();
		driver.findElement(By.xpath("//div[text()='Option 3']/input")).click();
		driver.findElement(By.xpath("//div[text()='Option 4']/input")).click();
		driver.findElement(By.xpath("//div[text()='Option 5']/input")).click();
		
		
	}

}
