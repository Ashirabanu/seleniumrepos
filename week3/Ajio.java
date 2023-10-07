package homeassign.week3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(" https://www.ajio.com/ ");
		driver.manage().window().maximize();
		driver.findElement(By.name("searchVal")).sendKeys("bags");
		driver.findElement(By.xpath("//span[@class='ic-search']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Men (3,347)']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Fashion Bags (919)']")).click();
		WebElement r = driver.findElement(By.xpath("//div[@class='length']"));
		String count = r.getText();
		System.out.println(count);
		//findelements- list<webelement>
				List<WebElement> links = driver.findElements(By.tagName("div"));
				
				int totallinks = links.size();
				System.out.println("total number of link :"+ totallinks);
				
				
									for (int i = 0; i < totallinks; i++) {
						System.out.println(links.get(i).getText());
						
					}
				
				
				//Collections.sort(list);
				//System.out.println(list);
				
	}

}
