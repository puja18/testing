package seleniumwddemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {
	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\pbommidi\\Desktop\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();	
	//driver.get("file://ndafile/Study%20Materials/JEE/2018/Java%20Full%20Stack/Module%203/App/login.html");
	driver.navigate().to("file://ndafile/Study%20Materials/JEE/2018/Java%20Full%20Stack/Module%203/App/hotelbooking.html");
	Thread.sleep(1000);
	String actualheading = driver.findElement(By.xpath("//h2")).getText();
	System.out.println(actualheading);
	
	// for matching the heading
	if(actualheading.equals("HotelBooking")) {
		System.out.println("matches");
		
	}else {
		System.out.println("not matches");
	}
	//to get attributre name we use getattribute
	String attrname = driver.findElement(By.id("txtFirstName")).getAttribute("name");
      System.out.println(attrname);
      
	//to fetch the value inputed in particular text box
	driver.findElement(By.id("txtFirstName")).sendKeys("capgemini");
	String attributename = driver.findElement(By.id("txtFirstName")).getAttribute("value");// to get value
	System.out.println(attributename);
	
	// to handle alert boxes
	WebElement confirmBooking = driver.findElement(By.className("btn"));
	confirmBooking.click();
	
	Alert alert = driver.switchTo().alert();
	System.out.println(alert.getText());
	
	alert.accept(); //click ok button
	
	//alert.dismiss();
	Thread.sleep(1000);
	driver.close();
	
 }
}
