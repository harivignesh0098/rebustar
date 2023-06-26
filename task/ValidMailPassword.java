package task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidMailPassword 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://abservetechdemo.com/products/rebustar/webadminpro/#/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//valid mail id and password
		driver.findElement(By.id("input-email")).sendKeys("abservetech.com@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("123456");
		driver.findElement(By.xpath(" //button[text()=' Log In ']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
		Thread.sleep(5000);
		String title2 = driver.getTitle();
		System.out.println(title2);
		if (title.equals(title2))
		{
			System.out.println("Test passed");
		}
			else
		{
			System.out.println("Test failed");		
		}

	}

}
