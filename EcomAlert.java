package homeassign.week4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EcomAlert {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://buythevalue.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@class='product-title'])")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("wk_zipcode")).sendKeys("613001");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='btn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@data-hover='View Cart']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("checkout")).click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
		
		
		

	}

}
