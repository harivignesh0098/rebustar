package task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidMailPassword 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://abservetechdemo.com/products/rebustar/webadminpro/#/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Invalid Mail and Password
		driver.findElement(By.id("input-email")).sendKeys("abservetech.@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("12345");
		driver.findElement(By.xpath(" //button[text()=' Log In ']")).click();
		
		WebElement valid = driver.findElement(By.xpath("//li[@class='alert-message']"));
		String mapa = valid.getText();
		System.out.println(mapa);


	}

}
