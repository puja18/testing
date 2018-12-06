package seleniumwddemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelNavigationCmd {
	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\pbommidi\\Desktop\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();	
	//driver.get("file://ndafile/Study%20Materials/JEE/2018/Java%20Full%20Stack/Module%203/App/login.html");
	driver.navigate().to("file://ndafile/Study%20Materials/JEE/2018/Java%20Full%20Stack/Module%203/App/login.html");
	Thread.sleep(1000);
	System.out.println(driver.getTitle()); // to get title
	System.out.println(driver.getCurrentUrl()); // to get url
	System.out.println(driver.getPageSource()); // to get total html page
	Thread.sleep(1000);
    driver.navigate().refresh(); // to refresh web page
    Thread.sleep(1000);
    driver.navigate().back(); // to move to back page

	Thread.sleep(1000);
	driver.navigate().forward(); // to move to forward page

	driver.close();

 }
}