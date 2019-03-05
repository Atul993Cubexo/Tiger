package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class TimeTrackPage {
	
	@FindBy(linkText = "Settings")
	private WebElement setting;

	@FindBy(xpath = "//a[contains(text(),'Licenses')]")
	private WebElement license;

	public TimeTrackPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

	
	public void clickOnSettings() {
		try{
			Thread.sleep(5000);
		
			setting.click();
		}
catch(Exception e){
	e.printStackTrace();
}
	}
	public void clickOnLicense() {
		license.click();

	}
	
	public void verifyHomePageDisplayed(WebDriver driver, String etitle , long ETO){
		WebDriverWait wait = new WebDriverWait(driver, ETO);
		wait.until(ExpectedConditions.titleContains(etitle));
		String atitle = driver.getTitle();
		Assert.assertEquals(atitle, etitle);
		
	}

}
