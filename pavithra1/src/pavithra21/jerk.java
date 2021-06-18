package pavithra21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class jerk {
	
	@Test
	public void down() {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://shareselenium.herokuapp.com/DropDown.html");


	Select slt = new Select(driver.findElement(By.xpath("//select[@id='dropdown1']")));
	slt.selectByIndex(2);
	
		
		
}
}