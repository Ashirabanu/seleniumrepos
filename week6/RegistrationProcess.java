package homeassign.week6;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RegistrationProcess extends ProjectMethod{

	@BeforeTest
	public void setData() {
		filename="w3school";
	}

	@Test(dataProvider="setupData")
		public void registration(String fname,String mailid,String address,String city,String zipnum,String state,String cardname ,String cardnum,String cvv) {
		
		driver.findElement(By.id("fname")).sendKeys(fname);
		driver.findElement(By.id("email")).sendKeys(mailid);
		driver.findElement(By.id("adr")).sendKeys(address);
		driver.findElement(By.id("city")).sendKeys(city);
		driver.findElement(By.id("zip")).sendKeys(zipnum);
		driver.findElement(By.id("state")).sendKeys(state);
		driver.findElement(By.id("cname")).sendKeys(cardname);
		driver.findElement(By.id("ccnum")).sendKeys(cardnum);
		driver.findElement(By.id("expmonth")).sendKeys("October");
		driver.findElement(By.id("cvv")).sendKeys(cvv);
		driver.findElement(By.id("expyear")).sendKeys("2018");
		
		
			
	}		
}
