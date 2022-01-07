package week2day2Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4part1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		// Using get method
		driver.get("http://leafground.com/pages/Button.html");
	    driver.manage().window().maximize();
	    driver.findElement(By.id("home")).click();
	    
	    //Using getTitle method
	    String title1 = driver.getTitle();
	    if (title1.contains("TestLeaf"))
	    {
			System.out.println("We are in Home page");
		} else
		{
			System.out.println("We are not in Home page");
		}
	    driver.get("http://leafground.com/pages/Button.html");
	    
	     //Using getLocation method
	     System.out.println("X & Y coordinates of element is : " + driver.findElement(By.id("position")).getLocation().toString());
	     
	   //Using getCssValue method
	     System.out.println("Colour vale is : " + driver.findElement(By.id("color")).getCssValue("background-color"));
	     
	   //Using getSize method	     
	     System.out.println("Size(Height & width) of Text Element : "+driver.findElement(By.id("size")).getSize().toString());
	     driver.close();

	}

}
