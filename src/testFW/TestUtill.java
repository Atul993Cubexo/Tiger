package testFW;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.FWUtil;

public class TestUtill extends BaseTest {
	static{
		
	}
	@Test
	public void testA(){
		String path = "./Data/input.xlsx";
		String sheet = "Sheet1";
		String v = FWUtil.getXLData(path, sheet, 0, 0);
//		System.out.println(v);
		int rc = FWUtil.getXLRowCount(path, sheet);
//		System.out.println(rc);
//		FWUtil.setXLData(path, sheet, 0, 0, 123);
//		FWUtil.setXLData(path, sheet, 1, 0, "BTR");
		
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://www.google.com");
//		FWUtil.getPhoto(driver,SCREENSHOT_PATH+"Google.png");
		
//		driver.close();
		
	}

}
