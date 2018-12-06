package seleniumwddemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelDemo1 {

	public static void main(String[] args) throws InterruptedException {
//step-1 Launch browser
		//WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pbommidi\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
//step-2 Navigate to application
		
		driver.get("file://ndafile/Study%20Materials/JEE/2018/Java%20Full%20Stack/Module%203/App/login.html");
//step-3 Enter Username(find the element and perform action)
		//driver.findElement(By.name("userName")).sendKeys("capgemini");
		//driver.findElement(By.xpath("//input[@type ='text']")).sendKeys("capgemini");
		WebElement pass1 = driver.findElement(By.xpath("//input[@type ='text']"));
		pass1.clear();
		pass1.sendKeys("capgemini");
//step-4 Enter password
		//driver.findElement(By.name("userPwd")).sendKeys("capg1234");
		//driver.findElement(By.xpath("//input[@type ='password']")).sendKeys("capg1234");
		WebElement pass = driver.findElement(By.xpath("//input[@type ='password']"));
		pass.clear();
		Thread.sleep(1000);
		pass.sendKeys("capg1234");
//step -5 hit Login button
		//driver.findElement(By.className("btn")).click();
		//driver.findElement(By.xpath("//input[@type ='button']")).click();
		WebElement pass2 = driver.findElement(By.xpath("//input[@type ='button']"));
		pass2.click();
		Thread.sleep(1000);
//step-6 close browser
		driver.close();

	}

}
