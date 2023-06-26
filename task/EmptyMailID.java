package task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmptyMailID 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://abservetechdemo.com/products/rebustar/webadminpro/#/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Empty Mail Invalid password 
		driver.findElement(By.id("input-email")).sendKeys("");
		driver.findElement(By.id("input-password")).sendKeys("1234");
		driver.findElement(By.xpath(" //button[text()=' Log In ']")).click();
		
		WebElement valid = driver.findElement(By.xpath("//p[@class='error-message']"));
		String mail = valid.getText();
		System.out.println(mail);
	}

}
