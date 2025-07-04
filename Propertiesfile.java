package Assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Propertiesfile {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	
		FileInputStream fis=new FileInputStream("./Data/commondata.properties");
		//2.create an object for properties
		Properties propertyobj=new Properties();
				
		//3.load the property
		propertyobj.load(fis);
				
		//4.To fetch the data
		String URL=propertyobj.getProperty("URL");
		System.out.println(URL);
		driver.get(URL);
		String firstname=propertyobj.getProperty("firstname");
		System.out.println(firstname);
		 WebElement element=driver.findElement(By.xpath("//input[@name='firstName']"));
		 element.sendKeys(firstname);
		 String lastname=propertyobj.getProperty("lastname");
		 System.out.println(lastname);
		WebElement element2=driver.findElement(By.xpath("//input[@name='lastName']"));
		 element2.sendKeys(lastname);
		 WebElement element3=driver.findElement(By.xpath("//button[@type='button']"));
		 element3.click();
		 //month
		 WebElement element4=driver.findElement(By.className("VfPpkd-aPP78e"));
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("VfPpkd-aPP78e")));
		 element4.click();

		// Click the month dropdown (simulate opening the dropdown)
		//WebElement monthDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='VfPpkd-aPP78e']")));
		//monthDropdown.click();

		// Wait for the dropdown options to appear
		//WebElement desiredMonth = wait.until(ExpectedConditions.elementToBeClickable( By.xpath("//span[contains(text(),'October')]"))); 
		 // Use actual value from properties if needed
        //desiredMonth.click();
		  WebElement dropdown=driver.findElement(By.className("VfPpkd-rymPhb-pZXsl"));
		 
		 dropdown.click();
		 Select selectobj=new Select(dropdown);
		 boolean res=selectobj.isMultiple();
		 if(res) {
			 System.out.println("drop is multiselect");}
		 else {
			 System.out.println("dropdown is single select");
			 selectobj.selectByIndex(9);
			 
			 //day
			 String day=propertyobj.getProperty("day");
				System.out.println(day);
				 WebElement element7=driver.findElement(By.xpath("//input[@id='day']"));
				 element7.sendKeys(day);
				//year
				 String year=propertyobj.getProperty("year");
					System.out.println(year);
					 WebElement element8=driver.findElement(By.xpath("//input[@id='year']"));
					 element8.sendKeys(year);
				//gender
				WebElement element5=driver.findElement(By.className("VfPpkd-aPP78e"));
				 WebDriverWait wait1 = new WebDriverWait(driver, 10);
				 wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("VfPpkd-aPP78e")));
				 element5.click();
				 WebElement dropdown1=driver.findElement(By.className("VfPpkd-rymPhb-Gtdoyb"));
				 
				 dropdown1.click();
				 Select selectobj1=new Select(dropdown);
				 boolean res1=selectobj1.isMultiple();
				 if(res1) {
					 System.out.println("drop is multiselect");}
				 else {
					 System.out.println("dropdown is single select");
					 selectobj1.selectByIndex(1);
					 
				driver.findElement(By.xpath("//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 BqKGqe Jskylb TrZEUc lw1w4b']")).click();
			 
			 //radio button of create own account
				driver.findElement(By.id("selectionc81")).click();
				 String email=propertyobj.getProperty("email");
					System.out.println(email);
					 WebElement element9=driver.findElement(By.xpath("//input[@name='Username']"));
					 element9.sendKeys(email);
				
				//password
					 String password=propertyobj.getProperty("password");
						System.out.println(password);
						 WebElement element10=driver.findElement(By.xpath("//input[@type='password']"));
						 element10.sendKeys(password);
				//confirm password
						 String confirmpassword=propertyobj.getProperty("confirmpassword");
							System.out.println(confirmpassword);
							 WebElement element11=driver.findElement(By.id("confirm-passwd"));
							 element11.sendKeys(confirmpassword);
				driver.findElement(By.xpath("//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 BqKGqe Jskylb TrZEUc lw1w4b']")).click();
		
				 //click on skip
				
				driver.findElement(By.xpath("//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-INsAgc VfPpkd-LgbsSe-OWXEXe-dgl2Hf Rj2Mlf OLiIxf PDpWxe P62QJc LQeN7 BqKGqe pIzcPc TrZEUc lw1w4b']")).click();
				// click on next
				driver.findElement(By.xpath("//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 BqKGqe Jskylb TrZEUc lw1w4b']")).click();
				//scroll down to i agree button
				//convert web driver obj to javascript executor type
				JavascriptExecutor js=(JavascriptExecutor)driver;
				//call executescript method
				js.executeScript("window.scrollBy(0,500)");
				Thread.sleep(2000);
				js.executeScript("window.scrollBy(0,500)");
				Thread.sleep(2000);
				//click on i agree button
				driver.findElement(By.xpath("//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 BqKGqe Jskylb TrZEUc lw1w4b']")).click();
				//scan the QR code with your mobile phone
				//then enter OTP to verify account
				//The OTP can not automate  in selenium here the automation will stop here
				
				
				 }
		 }
	}
}
		 
	
	



	


