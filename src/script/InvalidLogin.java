package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.FWUtil;
import page.LoginPage;
import page.TimeTrackPage;

public class InvalidLogin extends BaseTest{
	@Test(priority=2)
	public void testInvalidLogin() {

		String un = FWUtil.getXLData(INPUT_PATH, "InValidLogin", 1, 0);
		String pw = FWUtil.getXLData(INPUT_PATH, "InValidLogin", 1, 1);
		String homePageTitle = FWUtil.getXLData(INPUT_PATH, "InValidLogin", 1, 2);

		// Enter InvalidUser Name
		LoginPage l = new LoginPage(driver);
		l.setUserName(un);

		// Enter Invalid Password
		l.setPassword(pw);

		// click on LoginButtom
		l.clickOnLogin();

		// Verifying HomePage

		TimeTrackPage t = new TimeTrackPage(driver);
		t.verifyHomePageDisplayed(driver, homePageTitle, ETO);
	}


}
