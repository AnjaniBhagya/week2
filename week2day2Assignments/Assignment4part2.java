package week2day2Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4part2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		// Using get method
		driver.get("http://leafground.com/pages/Link.html");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("(//a[contains(text(),'Go to Home Page')])[1]")).click();
	    
	    //Using getTitle method
	    String title1 = driver.getTitle();
	    if (title1.contains("TestLeaf"))
	    {
			System.out.println("Page Title: TestLeaf - Interact with HyperLinks");
		} else
		{
			System.out.println("We are not able to retrive Title");
		}
	    driver.get("http://leafground.com/pages/Link.html");
	    
	    //Using getAttribute method	    
	    System.out.println("The link in this given element is : " + driver.findElement(By.xpath("//a[contains(text(),'clicking me')]")).getAttribute("href").toString());
	    
	  //Using getAttribute method	
	    String linkstr = driver.findElement(By.xpath("//a[contains(text(),'broken')]")).getAttribute("href").toString();
	    System.out.println(linkstr);
	    if (linkstr.contains("error")) {
	    	System.out.println("Yes the link is broken and goes to a Error Page");
			
		} 
	    else
	    {
	    	System.out.println("No the link is not broken.");
		}
	    driver.get("http://leafground.com/pages/Link.html");

	  //Using  getCurrentUrl method
	    String linkname = driver.getCurrentUrl();
	    if (linkname.contains("Link"))
	    {
			System.out.println("We are in Link page");
		} else
		{
			System.out.println("We are not in Link page");
		}
	    
	    //Using tagName method
	    List<WebElement> links = driver.findElements(By.tagName("a"));
	    System.out.println("Total Number of links in the given page : " + links.size());
	    driver.close();
	}

}
