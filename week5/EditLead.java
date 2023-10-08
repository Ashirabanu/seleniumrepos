package homeassign.week5;

import org.testng.annotations.DataProvider;
//import java.time.Duration;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead extends ProjectSpecifiedMethod {
	
	@DataProvider(name="editleads")
	public String[][] sendData(){
		
		String[][] data=new String[3][2];
		
		data[0][0]="TestLeaf";
		data[0][1]="98";
		
		
		data[1][0]="TCS";
		data[1][1]="99";
		
		
		data[2][0]="CTS";
		data[2][1]="68";
		
		
		return data;
	}

	
	
	
	
@Test(dataProvider="editleads")
	public  void runEditLead(String phonenum,String compName) throws InterruptedException {
		
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phonenum);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(compName);
		driver.findElement(By.name("submitButton")).click();
		
}
}






