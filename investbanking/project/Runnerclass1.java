package amazon.project;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import actionclass1.SetUp;
import parametrization1.Configuration1;

public class Runnerclass1 {
WebDriver driver;
	POM1 amazon;
	
	@BeforeClass
	public void browserlaunch() {
		SetUp set=new SetUp();
		 driver = set.pom();
		driver.manage().window().maximize();
	}
	@BeforeMethod
	public void signin() {
		driver.get("https://www.amazon.in/");
		amazon=new POM1(driver);
	    amazon.sign();
		amazon.Email("9503348054");
		amazon.contineoue();
		amazon.password("9503348054");
		amazon.signin11();
	}
	@Test
	public void pay1() {
		amazon.Pay();
	}
	@Test
	public void gcard1() {
		amazon.gcard();
	}
	@Test
	public void buy11() {
		amazon.buy1();
	}
	@Test
	public void heath11() {
		amazon.heath1();
	}
	@Test
	public void giidea() {
		amazon.gidea();
	}
	@Test
	public void home11() {
		amazon.home1();
	}
	@Test
	public void book() {
		amazon.books1();
	}

    @AfterMethod
   public void aall() {
	amazon.all1();
	amazon.out();
}
	}
