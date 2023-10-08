package homeassign.week5;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class CreateLead extends ProjectSpecifiedMethod {
	
	@DataProvider(name="fetchData")
	public String[][] sendData(){
		
		String[][] data=new String[3][3];
		
		data[0][0]="TestLeaf";
		data[0][1]="sri";
		data[0][2]="R";
		
		data[1][0]="TestLeaf";
		data[1][1]="vino";
		data[1][2]="N";
		
		data[2][0]="TestLeaf";
		data[2][1]="priya";
		data[2][2]="I";
		
		return data;
	}
	
	
	
	
	
	
@Test(dataProvider="fetchData")
	public void runCreate(String comName,String fName,String lName) {
		
	
	driver.manage().window().maximize();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(comName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.name("submitButton")).click();
		
}
}






