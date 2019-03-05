package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.FWUtil;
import page.LoginPage;
import page.TimeTrackPage;

public class ValidLogin extends BaseTest {

	@Test(priority=1)
	public void testValidLogin() {

		String un = FWUtil.getXLData(INPUT_PATH, "ValidLogin", 1, 0);
		String pw = FWUtil.getXLData(INPUT_PATH, "ValidLogin", 1, 1);
		String homePageTitle = FWUtil.getXLData(INPUT_PATH, "ValidLogin", 1, 2);

		// Enter User Name
		LoginPage l = new LoginPage(driver);
		l.setUserName(un);

		// Enter Valid Password
		l.setPassword(pw);

		// click on LoginButtom
		l.clickOnLogin();

		// Verifying HomePage

		TimeTrackPage t = new TimeTrackPage(driver);
		t.verifyHomePageDisplayed(driver, homePageTitle, ETO);
	}
}
