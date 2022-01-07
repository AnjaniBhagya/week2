package week2day2Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4part3 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		// Using get method
		driver.get("http://leafground.com/pages/Image.html");
		
		//go to home page
				driver.findElement(By.xpath("(//img)[2]")).click();
				System.out.println("Link takes Us to Home Page ");
				
		//verifying Image link
				driver.get("http://leafground.com/pages/Image.html");
				System.out.println("Verifying the Image by click :");
				driver.findElement(By.xpath("(//img)[3]")).click();
				System.out.println("Image is Broken");
				driver.get("http://leafground.com/pages/Image.html");
				
		//Getting Location of image
				System.out.println("The Location of the Image in X&Y coordinates is :" + driver.findElement(By.xpath("(//img)[4]")).getLocation().toString());
				driver.close();
				
	}

}
