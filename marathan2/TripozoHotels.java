package selenium.marathan2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TripozoHotels {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.tripozo.com/");
		driver.manage().window().maximize();
        driver.findElement(By.partialLinkText(" Hotels")).click();
        driver.findElement(By.id("CityData")).sendKeys("Goa");
        driver.findElement(By.xpath("//span[text()='Goa']")).click();
        driver.findElement(By.id("checkin_checkout")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[text()='12']")).click();
        driver.findElement(By.xpath("//div[text()='13']")).click();
        driver.findElement(By.xpath("//span[text()=' Search']")).click();
        driver.findElement(By.xpath("//span[text()='Air Conditioning']")).click();
        driver.findElement(By.xpath("//span[text()='Laundry Facility']")).click();
        driver.findElement(By.xpath("//span[text()='Parking']")).click();
        driver.findElement(By.xpath("//span[text()='Restaurant']")).click();
        driver.findElement(By.xpath("(//ul[@class='ant-rate ant-rate-disabled starRating'])[5]")).click();
        driver.findElement(By.xpath("//span[text()='Choose']")).click();
        
        String s="Check In : 12 Oct 2023";
        String text = driver.findElement(By.xpath("//p[@class='pl-2']")).getText();
        System.out.println(text);
        if(s.equals(text)) {
        	System.out.println("it is correct");
        }else
        	System.out.println("its not verified one");
        driver.findElement(By.xpath("//button[text()='View Rooms']")).click();
        driver.findElement(By.xpath("//span[text()='Choose Room ']")).click();
        driver.findElement(By.xpath("//span[text()='Amenities & Details']")).click();
        //snap
        File src=driver.getScreenshotAs(OutputType.FILE);
        File destination= new File("./Snap/img2.jpg");
        FileUtils.copyFile(src, destination);
        
       driver.findElement(By.xpath("//span[@class='ant-modal-close-x']")).click();
       driver.close();
        
	}

}
