package pavithra21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selected {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://shareselenium.herokuapp.com/CheckBox.html");
//boolean element = driver.findElement(By.xpath("(//input[@type='checkbox'][6])")).isSelected();
//System.out.println(element);
		
		WebElement element = driver.findElement(By.xpath("//input[@type='checkbox'][5]"));
		if (element.isSelected())
		{
			System.out.println("checkbox is selected");
		}
		else
		{
			System.out.println("checkbox not selected");
			element.click();
		}
			
		
		
		
	}
}
