package pavithra21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enabled {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\chromedriver_win32 (1)\\chromedrive.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://shareselenium.herokuapp.com/Edit.html");
		//boolean element =driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled();
		//System.out.println(element);
		
		//WebElement element = driver.findElement(By.xpath("//input[@id='email']"));
		//if(element.isEnabled())
	//	{
	//System.out.println("print values");
	//element.sendKeys("pavithra");
	
	
	//	}
	//	else
	//	{
	//		System.out.println("dont print the values");
	//	}
			
		WebElement element = driver.findElement(By.xpath("//input[@disabled='true']"));
		if(element.isEnabled())
		{
			System.out.println("print values");
			element.sendKeys("pavithra");
			
		}
		else
		{
			System.out.println("dont print the values");
		}
			



		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
			
			
		}

	

	}

