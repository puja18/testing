package seleniumwddemo;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class HotelBooking {
	static WebDriver driver;
	@BeforeClass
	public static void start() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\pbommidi\\Desktop\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("file://ndafile/Study%20Materials/JEE/2018/Java%20Full%20Stack/Module%203/App/hotelbooking.html");
	}
	@AfterClass
	public static void close() {
		driver.close();
	}
	@Test
	public void testAFirstName() throws InterruptedException {
		WebElement firstname = driver.findElement(By.name("txtFN"));
		 firstname.clear();
		 Thread.sleep(1000);
		 firstname.sendKeys("capgemini");
	}
	@Test
	public void testBLastName() throws InterruptedException {
		WebElement  lastname = driver.findElement(By.name("txtLN"));
		lastname.clear();
		Thread.sleep(1000);
		lastname.sendKeys("capg1234");
	}	
	@Test
	public void testCEmail() throws InterruptedException {
		WebElement email = driver.findElement(By.name("Email"));
		email.clear();
		Thread.sleep(1000);
		email.sendKeys("capg12@gmail.com");
	}
	@Test
	public void testDPhoneNumber() throws InterruptedException {
		WebElement phonenumber = driver.findElement(By.name("Phone"));
		phonenumber.clear();
		Thread.sleep(1000);
		phonenumber.sendKeys("9985485173");
	}
	@Ignore
	@Test
	public void testFAddress() throws InterruptedException {
		WebElement address = driver.findElement(By.xpath("//textarea[@rows='5']"));
		address.clear();
		Thread.sleep(1000);
		address.sendKeys("Sipcot IT park, chennai");
	}
	@Test
	public void testGCity() throws InterruptedException {
		WebElement city = driver.findElement(By.name("city"));
		Select select = new Select(city);
		select.selectByIndex(4);
		Thread.sleep(1000);
	}
	@Test
	public void testHState() throws InterruptedException {
		WebElement state = driver.findElement(By.name("state"));
		Select select = new Select(state);
		select.selectByIndex(4);
		Thread.sleep(1000);
	}
	@Test
	public void testINumberOfGuestStaying() throws InterruptedException {
		WebElement NumberOfGuestStaying = driver.findElement(By.name("persons"));
		Select select = new Select(NumberOfGuestStaying);
		select.selectByIndex(2);
	   
		Thread.sleep(1000);
	}
	@Test
	public void testJCardHoldername() throws InterruptedException {
		WebElement cardHoldername = driver.findElement(By.id("txtCardholderName"));
		cardHoldername.clear();
		cardHoldername.sendKeys("pujitha");
		Thread.sleep(1000);
	}
	@Test
	public void testKDebitCardNumber() throws InterruptedException {
		WebElement debitCardNumber = driver.findElement(By.name("debit"));
		debitCardNumber.clear();
		debitCardNumber.sendKeys("1234567");
		Thread.sleep(1000);
	}
	@Test
	public void testLCvv() throws InterruptedException {
		
		WebElement cvv = driver.findElement(By.name("cvv"));
		cvv.clear();
		cvv.sendKeys("054");
		Thread.sleep(1000);
	}	
	@Test
	public void testMExpirationMonth() throws InterruptedException {
		
		WebElement expirationMonth = driver.findElement(By.name("month"));
		expirationMonth.clear();
		expirationMonth.sendKeys("05");
		Thread.sleep(1000);
	}	
	@Test
	public void testNExpirationYear() throws InterruptedException {
		WebElement expirationYear = driver.findElement(By.name("year"));
		expirationYear.clear();
		expirationYear.sendKeys("24");
		Thread.sleep(1000);
	}
	@Test
	public void testOConfirm() throws InterruptedException {
		WebElement confirmBooking = driver.findElement(By.className("btn"));
		confirmBooking.click();
		Thread.sleep(1000);
	}


}

