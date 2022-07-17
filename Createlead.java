package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Createlead {

	public static void main(String[] args) {
		// Load the path driver
		WebDriverManager.chromedriver().setup();
		//Launch the Browser
		ChromeDriver driver=new ChromeDriver();
		//Load the URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		//maximize the window
		driver.manage().window().maximize();
		//Add the wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//enter username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	//enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//enter login
		driver.findElement(By.className("decorativeSubmit")).click();
		//click crm/sfa button
		driver.findElement(By.linkText("CRM/SFA")).click();
		//click on Leads Button
		driver.findElement(By.linkText("Leads")).click();
		//click on create Lead
		driver.findElement(By.linkText("Create Lead")).click();
		//enter company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		//enter first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Testleaf");
		//enter lastname
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Leaf");
		//enter firstname local
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Testl");
		//department field
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Commerce");
		//Description Field
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Need to register course");
		//Enter email
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("preeethirao@gmail.com");
		//select state
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
        Select drop1=new Select(state);
        		//select by visible text
        drop1.selectByVisibleText("Arkansas");
        //click create button
        driver.findElement(By.name("submitButton")).click();
        //get the title
        String title = driver.getTitle();
        System.out.println(title);
        
        
        
        
        		
	}

}
