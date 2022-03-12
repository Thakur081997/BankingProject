package amazon.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM {
	@FindBy(xpath = "//a[@id='nav-link-accountList']")
	private WebElement signin;

	@FindBy(name = "email")
	private WebElement Email;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement Continue;

	@FindBy(xpath = "//input[@type='password']")
	private WebElement password;

	@FindBy(xpath = "(//input[@class='a-button-input'])[1]")
	private WebElement clicksignin;

	@FindBy(xpath = "//a[text()='Fresh']")
	private WebElement Fresh;

	@FindBy(xpath = "(//a[@class='nav-a  '])[3]")
	private WebElement Giftcard;

	@FindBy(xpath = "(//a[@class='nav-a  '])[2]")
	private WebElement AmazonPay;

	@FindBy(xpath = "(//a[@class=\"nav-a  \"])[4]")
	private WebElement GiftIdeas;

	@FindBy(xpath = "//i[@class='hm-icon nav-sprite']")
	private WebElement All;

	@FindBy(xpath = "(//a[@class='hmenu-item'])[27]")
	private WebElement signouot;

	private WebDriver driver;

	POM(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public void signin() {
		signin.click();
	}

	public void entermailid(String email) {
		Email.sendKeys(email);
	}

	public void enterpassword(String pass) {
		password.sendKeys(pass);
	}

	public void clicksignin() {
		clicksignin.click();
	}

	public void clickContinue() {
		Continue.click();
	}

	public void clickFresh() {
		Fresh.click();
	}

	public void clickGiftcard() {
		Giftcard.click();
	}

	public void clickAPay() {
		AmazonPay.click();
	}

	public void clickGiftIdea() {
		GiftIdeas.click();
	}

	public void All() {
		All.click();
	}

	public void signout() {
		signouot.click();
	}
}

