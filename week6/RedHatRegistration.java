package homeassign.week6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RedHatRegistration extends ProjectsMethod {

	@BeforeTest
	public void setData() {
		filename="redhat";
	}

	@Test(dataProvider="datasetup")
		public void redhatRegistration(String uname,String password,String confpass,String fname,String lname,String email,String phone ,String address,String pincode,String city) {
		
		driver.findElement(By.xpath("//div[@slot='account']/a")).click();
		
		 String text = driver.findElement(By.xpath("//h1[text()='Register for a Red Hat account']")).getText();
		 System.out.println("page name :"+text);
		 
		 String data="Register for a Red Hat account";

		 if(data.equals(text)) {
			 System.out.println("registration form is displayed correctly");
		 }else
			 System.out.println("reg form is not displayed");
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("confirmPassword")).sendKeys(confpass);
		driver.findElement(By.id("firstName")).sendKeys(fname);
		driver.findElement(By.id("lastName")).sendKeys(lname);
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("user.attributes.phoneNumber")).sendKeys(phone);
		
		driver.findElement(By.xpath("//img[@alt='Close']")).click();
		driver.findElement(By.xpath("//label[text()='Personal']")).click();
		WebElement select = driver.findElement(By.id("user.attributes.country"));
		Select opt=new Select(select);
		opt.selectByVisibleText("India");
		driver.findElement(By.id("user.attributes.addressLine1")).sendKeys(address);
		driver.findElement(By.id("user.attributes.addressPostalCode")).sendKeys(pincode);
		driver.findElement(By.id("user.attributes.addressCityText")).sendKeys(city);
		//WebElement select1 = driver.findElement(By.id("user.attributes.addressState"));
		//driver.findElement(By.id("user.attributes.addressCountyText")).sendKeys("india");
				
	}

}
