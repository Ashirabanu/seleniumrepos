package homeassign.week4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonAction {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");
		driver.findElement(By.xpath("//div[text()='oneplus 9 pro']")).click();
		String price = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		System.out.println("first product price : "+price);
		Thread.sleep(2000);
		String rating = driver.findElement(By.xpath("//span[text()='1017']")).getText();
		System.out.println("no of customer ratings : "+rating);
		driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
		for (String string : driver.getWindowHandles()) {
			driver.switchTo().window(string);
		}
		File src=driver.getScreenshotAs(OutputType.FILE);
		File des=new File("./Snaps/img.png");
		FileUtils.copyFile(src, des);
		WebElement scrolldown = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
			Actions obj=new Actions(driver);
			obj.scrollToElement(scrolldown).perform();
			obj.click(scrolldown).perform();
		String carttotal = driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']")).getText();
		System.out.println("cart subtotal is : "+carttotal);
		if(price==carttotal) {
			System.out.println("the price is equal to carttotal");
		}else
			System.out.println("its not equal");
		}
	}


