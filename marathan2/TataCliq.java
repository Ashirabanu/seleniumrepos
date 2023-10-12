package selenium.marathan2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TataCliq {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.tatacliq.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='Ask me later']")).click();
		WebElement mouseOver = driver.findElement(By.xpath("//div[text()='Brands']"));
		Actions obj=new Actions(driver);
		obj.moveToElement(mouseOver).perform();
		Thread.sleep(2000);
		WebElement mouseOver1 = driver.findElement(By.xpath("//div[text()='Watches & Accessories']"));
		Actions obj1=new Actions(driver);
		obj1.moveToElement(mouseOver1).perform();
		
		
		 driver.findElement(By.xpath("//div[text()='Casio']")).click();
		
		
		WebElement Select = driver.findElement(By.xpath("//select[@class='SelectBoxDesktop__hideSelect']"));
		Select opt=new Select(Select);
		opt.selectByVisibleText("New Arrivals");
		
		driver.findElement(By.xpath("//div[text()='Men']")).click();
        List<WebElement> watches= driver.findElements(By.xpath("//div[@class='ProductModule__dummyDiv']"));
		int price=watches.size();
		System.out.println("price for all watches"+price);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@aria-label='Casio']/parent::div")).click();
		Set<String> windowHandles=driver.getWindowHandles();
		List<String> window=new ArrayList<String>(windowHandles);
		driver.switchTo().window(window.get(1));
		
		String text = driver.findElement(By.xpath("//h3[text()='MRP:  ₹9195']")).getText();
		System.out.println("watch price :"+text);
		String s="MRP: ₹9195";
		if(s.equals(text)) {
			System.out.println("it is similar ");
		}else
			System.out.println("it is not similar");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
		String text2 = driver.findElement(By.xpath("//span[text()='1']")).getText();
		System.out.println("count of the watche :"+text2);
		 
		driver.findElement(By.xpath("//div[@class='DesktopHeader__myBagShow']")).click();
		//snap
		 File src=driver.getScreenshotAs(OutputType.FILE);
	        File destination= new File("./Snap/img3.jpg");
	        FileUtils.copyFile(src, destination);
	        
		driver.switchTo().window(window.get(0));
		driver.close();
		
		driver.quit();
		
		
		
		
	}

}
