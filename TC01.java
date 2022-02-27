package framework_structure;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import parametrization1.Configuration1;

public class TC01 {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", Configuration1.driverPath);
		WebDriver driver = new ChromeDriver();	
		driver.get(Configuration1.appURL);
		driver.manage().window().maximize();
		
		LoginPage_POM login = new LoginPage_POM(driver);
		
		//TC01
		login.setUserId("Tester");
		login.setPassword("12345");
		login.clickLoginBtn();
		
		Thread.sleep(2000);
		///TC02
		driver.get(Configuration1.appURL);
		login.setUserId("Tejaswini");
		login.setPassword("225588");
		login.clickLoginBtn();
		
		///TC03
		Thread.sleep(2000);
		driver.get(Configuration1.appURL);
		login.setUserId("Thakur");
		login.setPassword("123456789");
		login.clickLoginBtn();
		
		
	}

}

