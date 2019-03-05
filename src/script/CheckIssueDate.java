package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.FWUtil;
import page.LicensePage;
import page.LoginPage;
import page.TimeTrackPage;

public class CheckIssueDate extends BaseTest{
	@Test(priority=3)
	public void testVerifyIssueDate() throws InterruptedException{
		String un = FWUtil.getXLData(INPUT_PATH, "CheckIssueDate", 1, 0);
		String pw = FWUtil.getXLData(INPUT_PATH, "CheckIssueDate", 1, 1);
		String issueDate = FWUtil.getXLData(INPUT_PATH, "CheckIssueDate", 1, 2);

		// Enter User Name
		LoginPage l = new LoginPage(driver);
		l.setUserName(un);

		// Enter Valid Password
		l.setPassword(pw);

		// click on LoginButtom
		l.clickOnLogin();
		
		// click on Settings
		TimeTrackPage tp = new TimeTrackPage(driver);
//		Thread.sleep(5000);
		
		tp.clickOnSettings();
		
		// Click on Licenses
		tp.clickOnLicense();
		
		// verify Issue Date
		LicensePage le = new LicensePage(driver);
		le.verifyIssueDate(issueDate);
		
		//click on logout button
		le.clickLogout();
	}

}
