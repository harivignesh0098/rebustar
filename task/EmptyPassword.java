package task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmptyPassword 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://abservetechdemo.com/products/rebustar/webadminpro/#/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//empty password Invalid Mail
		driver.findElement(By.id("input-email")).sendKeys("abservetech.@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("");
		driver.findElement(By.xpath(" //button[text()=' Log In ']")).click();
		
		WebElement valid = driver.findElement(By.xpath("//p[@class='error-message']"));
		String password = valid.getText();
		System.out.println(password);
	}

}
