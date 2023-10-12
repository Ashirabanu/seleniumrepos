package selenium.marathan2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TripozoFlight {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.tripozo.com/");
		driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='search-form_origin']")).sendKeys("MAA");
        driver.findElement(By.xpath("//span[text()='Chennai']")).click();
        driver.findElement(By.xpath("//input[@id='search-form_destination']")).sendKeys("GOX");
        driver.findElement(By.xpath("//span[text()='Goa']")).click();
        driver.findElement(By.id("search-form_fromDate")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@class='calBtn'])")).click();
        driver.findElement(By.xpath("//span[text()='Search']")).click();
        driver.findElement(By.xpath("//span[text()='Refundable']")).click();
        driver.findElement(By.xpath("//span[text()='6 AM - 12PM']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Air India']")).click();
        //to check
        String s="Air India";
        String text1 = driver.findElement(By.xpath("//div[@class='flight-name']/div")).getText();
        System.out.println(text1);
        if (s.equals(text1)) {
        	System.out.println("displayed airlines r selected airlines");
        }else
        	System.out.println("displayed airlines r not selected airlines");
        
        driver.findElement(By.xpath("(//button[@class='choose-button tpz-btn nowrap'])")).click();
        Thread.sleep(2000);
        
        String s1="Refundable";
        String text2 = driver.findElement(By.xpath("(//span[@class='ant-tag ant-tag-green'])[2]")).getText();
        System.out.println(text2);
        if (s1.equals(text2)) {
        	System.out.println("selected airlin s refundable");
        }else
        	System.out.println("is not refundable");
        driver.findElement(By.xpath("//span[text()='Flight Info']")).click();
        //snap
        File src=driver.getScreenshotAs(OutputType.FILE);
        File desti= new File("./Snap/img.jpg");
        FileUtils.copyFile(src, desti);
        driver.findElement(By.xpath("//span[@class='ant-modal-close-x']")).click();
        driver.findElement(By.xpath("//span[text()='Fare Info']")).click();
        File src1=driver.getScreenshotAs(OutputType.FILE);
        File desti1= new File("./Snap/img1.jpg");
        FileUtils.copyFile(src1, desti1);
        
        
        driver.findElement(By.xpath("//span[@class='ant-modal-close-x']")).click();
        driver.close();
	}

}
