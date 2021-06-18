package pavithra21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Coding {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\chromedriver_win32 (1)\\chromedrive.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://facebook.com/");
		//driver.findElement(By.id(" email")).sendKeys("Pavithra ID");
		
		//driver.findElement(By.name("email")).sendKeys("Pavithra");
		
		//driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("pavithra");
		
		//driver.findElement(By.linkText("Forgotten password?")).click();
		
		//driver.findElement(By.partialLinkText("Forgotten")).click();
		
		//driver.findElement(By.cssSelector("data-testid=\"royal_email\"")).sendKeys("pavithra");
		
		//driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form"));
		
	//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pavithra");
		
	//driver.findElement(By.xpath("//div[@class='_6lux'][1]")).sendKeys("pavithra");
		
		//driver.findElement(By.xpath("//button[@text()='Log In']")).click();
		
		//WebElement email_address = driver.findElement(By.id("email"));
	//email_address.sendKeys("pavithra");
		
		//String tittle = driver.getTitle();
		//System.out.println("Facebook");
		
		//String pagesource = driver.getPageSource();
		//System.out.println(pagesource);
		
		//String current_url = driver.getCurrentUrl();
		//System.out.println(current_url);
		
		//WebElement element = driver.findElement(By.xpath("//h2[@class='_8eso']"));
		//String text = element.getText();
		//System.out.println(text);
		
	//WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
	//username.sendKeys("pavithra");
	//String input_values = username.getAttribute("value");
	//System.out.println(input_values);
		
		//driver.findElement(By.xpath("//a[@text()='Create a Page']")).click();
		//driver.close();
		
		//driver.navigate().to("https://www.facebook.com/");
		
		//driver.navigate().back();
		
		//driver.navigate().forward();
		
		
		
	
	
		
		
	}
}
