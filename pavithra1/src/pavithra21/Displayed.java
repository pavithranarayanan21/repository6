package pavithra21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Displayed {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://facebook.com/");
		
		//boolean displayed = driver.findElement(By.id("email")).isDisplayed();
		//System. out.println(displayed);
		

		// TODO Auto-generated method stub

	}

}
