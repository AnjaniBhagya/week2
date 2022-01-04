package week2day1Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase3 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver = new ChromeDriver();
	    driver.get("http://leaftaps.com/opentaps/");
	    driver.manage().window().maximize();
	   // String title = driver.getTitle();
	   // System.out.println(title);
	    WebElement username = driver.findElement(By.id("username"));
	   username.sendKeys("DemoSalesManager");
	   driver.findElement(By.id("password")).sendKeys("crmsfa");
	   driver.findElement(By.className("decorativeSubmit")).click();
	   driver.findElement(By.linkText("CRM/SFA")).click();
	   driver.findElement(By.linkText("Leads")).click();
	   driver.findElement(By.linkText("Create Lead")).click();
	   driver.findElement(By.id("createLeadForm_companyName")).sendKeys("FirstCompany");
	   driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Anjani");
	   driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Bhagya");
	   WebElement mywebDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
	   Select mydd = new Select(mywebDD);
	   mydd.selectByVisibleText("Existing Customer");
	   
	   WebElement mywebDD2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	   Select mydd2 = new Select(mywebDD2);
	   mydd2.selectByVisibleText("Automobile");
	   driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Anjani");
	   WebElement wfname =driver.findElement(By.id("createLeadForm_firstNameLocal"));	   
	   String fname = wfname.getAttribute("value");	 
	   driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Bhagya");
	   //
	   driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Associate");
	   driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("09/09/99");
	   driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Quality Analyst");
	   driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Information Technology");
	   driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("360000");
	   WebElement mywebDD3 = driver.findElement(By.id("createLeadForm_currencyUomId"));
	   Select mydd3 = new Select(mywebDD3);
	   mydd3.selectByVisibleText("INR - Indian Rupee");
	   WebElement mywebDD4 = driver.findElement(By.id("createLeadForm_industryEnumId"));
	   Select mydd4 = new Select(mywebDD4);
	   mydd4.selectByVisibleText("Computer Software");
	   driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("45");
	   WebElement mywebDD5 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	   Select mydd5 = new Select(mywebDD5);
	   mydd5.selectByVisibleText("Partnership");
	   driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("AA7654");
	   driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("Symb5544");
	   driver.findElement(By.id("createLeadForm_description")).sendKeys("This is the duplicate sample content description");
	   driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("867");
	   driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9546783344");
	   driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("+1");
	   driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Anjani");
	   driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("work2anjani@gmail.com");
	   driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("http://leaftaps.com/opentaps/");
	   driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Anjani");
	   driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("V");
	   driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("976 Harpen Drive");
	   driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Harpen West");
	   driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Medicine Hat");
	   driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("TF3765");
	   driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("45362");
	  
	   WebElement mywebDD7 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
	   Select mydd7 = new Select(mywebDD7);
	   mydd7.selectByVisibleText("Canada");
	   WebElement mywebDD6 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	   Select mydd6 = new Select(mywebDD6);
	   
	   mydd6.selectByIndex(1);
	   
	   driver.findElement(By.name("submitButton")).click();
	   String title=driver.getTitle();
		System.out.println("The title is :"+title);
		
		if(title.contains("View Lead | opentaps CRM"))
			System.out.println("Title is correct");
		else
			System.out.println("Title is incorrect");
	    driver.close();
	   
	}

}
