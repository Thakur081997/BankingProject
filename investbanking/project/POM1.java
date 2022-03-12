package amazon.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM1 {
	
	private WebDriver driver;
@FindBy(id="nav-link-accountList-nav-line-1") private WebElement signin;
@FindBy(name="email") private WebElement email;
@FindBy(xpath="//input[@type='submit']") private WebElement conti;
@FindBy(name="password") private WebElement pass;
@FindBy(xpath="//input[@id='signInSubmit']") private WebElement signin1;
@FindBy(xpath = "//i[@class='hm-icon nav-sprite']") private WebElement all;
@FindBy(xpath="(//a[@class='nav-a  '])[1]") private WebElement amzpay;
@FindBy(xpath="(//a[@class='nav-a  '])[2]") private WebElement giftcard;
@FindBy(xpath="(//a[@class='nav-a  '])[3]") private WebElement buy;
@FindBy(xpath="(//a[@class='nav-a  '])[4]") private WebElement helth;
@FindBy(xpath="(//a[@class='nav-a  '])[5]") private WebElement giftidea;
@FindBy(xpath="(//a[@class='nav-a  '])[6]") private WebElement home;
@FindBy(xpath="(//a[@class='nav-a  '])[7]") private WebElement books;
@FindBy(xpath = "(//a[@class=\"hmenu-item\"])[27]") private WebElement signout;

//xpath = "//i[@class='hm-icon nav-sprite']"
//a[text()='Sign Out']
POM1(WebDriver driver){
	PageFactory.initElements(driver, this);
	this.driver=driver;
}
public void sign() {
	signin.click();
}
public void Email(String en) {
	email.sendKeys(en);
}
public void contineoue() {
	conti.click();
}
public void password(String ps) {
pass.sendKeys( ps);
}
public void signin11() {
	signin1.click();
}
public void all1() {
	all.click();
}
public void Pay() {
	amzpay.click();
}
public void gcard() {
	giftcard.click();
}
public void buy1() {
	buy.click();
}
public void heath1() {
	helth.click();
}
public void gidea() {
 giftidea.click();
}
public void home1() {
	home.click();
}
public void books1() {
	books.click();
}
public void out() {
	signout.click();
}
















}
