package pavithra21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://shareselenium.herokuapp.com/DropDown.html");


		//Select slt = new Select(driver.findElement(By.xpath("//select[@id='dropdown1']")));
		//slt.selectByIndex(2);
		
		//Select slt1 = new Select(driver.findElement(By.xpath("//select[@id='dropdown3']")));
		//slt1.selectByValue("4");
		
		
		WebElement element = driver.findElement(By.xpath("//select[@id='dropdown1']"));
		Select slt2 =new Select(element);
		slt2.selectByVisibleText("Selenium");


		// TODO Auto-generated method stub

	}

}
