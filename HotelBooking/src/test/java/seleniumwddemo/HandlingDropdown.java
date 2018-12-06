package seleniumwddemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingDropdown {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pbommidi\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize(); // to maximize the browser window
		//driver.get("file://ndafile/Study%20Materials/JEE/2018/Java%20Full%20Stack/Module%203/App/login.html");
		driver.navigate().to("file://ndafile/Study%20Materials/JEE/2018/Java%20Full%20Stack/Module%203/App/hotelbooking.html");
		//implicit wait statement - (navigating to complete application)until title get loaded
		//it waits until all the elements gets downloaded(synchronization statements)
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(1000);
		driver.findElement(By.name("txtFN")).sendKeys("puja");
		driver.findElement(By.name("txtLN")).sendKeys("Bommidi");
		driver.findElement(By.name("Email")).sendKeys("puja18@capgemini.com");
		
		// to selct from dropdown 
		WebElement city = driver.findElement(By.name("city"));
		Select select = new Select(city);
		//select.selectByVisibleText("Hyderabad");
		Thread.sleep(1000);
		
		//select by value
		
		//select.selectByValue("Hyderabad");
		
		//select by index for multiple selections
		
		select.selectByIndex(4);
		
		//for deselect the buttons we use
		
		/*select.deselectAll();
		//to get all selected values it returns boolean value
		select.isMultiple();*/
		
		WebElement confirmBooking = driver.findElement(By.className("btn"));
		confirmBooking.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		
		alert.accept(); //click ok button
		
		driver.close();
	
	}
}
