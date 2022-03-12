package amazon.project;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import actionclass1.SetUp;

public class RunnerClass {
	WebDriver driver;
     POM ama;

	@BeforeClass
	public void BrowerLaunch() {
		SetUp set = new SetUp();
		driver = set.pom();
		driver.manage().window().maximize();
		}
	@BeforeMethod
	public void signin() {
		driver.get("https://www.amazon.in/");
		ama = new POM(driver);
		ama.signin();
		ama.entermailid("9503348054");
		ama.clickContinue();
		ama.enterpassword("9503348054");
		ama.clicksignin();
	}
   @Test(priority = 1)
	public void clickFresh() {
		ama.clickFresh();
	}

	@Test(priority = 2)
	public void AmazonPay() {
		ama.clickAPay();
	}

	@Test(priority = 3)
	public void GiftCard() {
		ama.clickGiftcard();
	}

	@Test(priority = 4)
	public void GiftIdea() {
		ama.clickGiftIdea();
	}

	@AfterMethod
	public void all() {
		ama.All();
		ama.signout();
	}
}

