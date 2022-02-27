package framework_structure;

import org.openqa.selenium.WebDriver;

import actionclass1.Setup1;
import parametrization1.Configuration1;

public class Test2 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = Setup1.pom();    // using static static method
		
		  driver.get(Configuration1.appURL);
	      driver.manage().window().maximize();
	      
	      SignupPOM1 sign=new SignupPOM1(driver);
	      
	      //TC01
	      sign.fname1("abc");
	      sign.lname1("ttt");
	      sign.email1("test@gmail.com");
	      sign.password("ttttabc");
	      sign.button();
	      sign.month1("Mar");
	      Thread.sleep(3000);
	      
	      //TC02
	      driver.get(Configuration1.appURL);
	      sign.fname1("xbc");
	      sign.lname1("ntt");
	      sign.email1("tester@gmail.com");
	      sign.password("abcccc");
	      sign.button();
	      sign.month1("Oct");
	}
	}
