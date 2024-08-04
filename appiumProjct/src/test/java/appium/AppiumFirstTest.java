package appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class AppiumFirstTest {
/*app package and app activity instead of URL
 * adb command = android debug bridge commandline tool by android studio, debugging bridge between 
 * our laptop and phone*/
	@Test
	public static void apiDemos() throws MalformedURLException {
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("platformName", "android");
		dc.setCapability("automationName", "uiautomator2");
		dc.setCapability("UDID", "RZ8M73S5Q1K");
		
		dc.setCapability("appPackage", "");
		dc.setCapability("appActivity", ".ApiDemos");
		
		URL u = new URL("http://localhost:4723");
		
		
	}
	
}
