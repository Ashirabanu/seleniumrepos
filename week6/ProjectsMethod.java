package homeassign.week6;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class ProjectsMethod {

	public RemoteWebDriver driver;
	public String filename;
	
	
@Parameters({"url","browser"})
	@BeforeMethod
	public void precondition(String url,String browser) {
		
	if(browser.equalsIgnoreCase("chrome")) {
		driver=new ChromeDriver();
	}else if(browser.equalsIgnoreCase("edge")) {
		driver=new EdgeDriver();
	}

		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.switchTo().frame("iframeResult");
}
@AfterMethod

public void postcondition() {
	driver.close();
}
@DataProvider(name="datasetup")
public String[][] sendsData() throws IOException{

return	IntegrationWithXL.exelData(filename);

}


}
