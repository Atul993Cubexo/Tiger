package page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(name = "username")
	private WebElement unTB;

	@FindBy(name = "pwd")
	private WebElement pwdTB;

	@FindBy(id = "loginButton")
	private WebElement logButton;

	@FindBy(xpath = "//span[contains(text(),'invalid')]")
	private WebElement errmsg;
	
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void setUserName(String un) {
		unTB.sendKeys(un);

	}

	public void setPassword(String pw) {
		pwdTB.sendKeys(pw);

	}

	public void clickOnLogin() {
		logButton.click();

	}
	
	
public void verifyErrorMessageDisplayed() {
		Assert.assertTrue(errmsg.isDisplayed());
	}

}
