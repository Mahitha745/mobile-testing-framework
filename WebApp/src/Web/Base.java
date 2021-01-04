package Web;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

	public static AndroidDriver<AndroidElement> Capability() throws MalformedURLException {
		

		DesiredCapabilities capability = new DesiredCapabilities();
		capability.setCapability(MobileCapabilityType.DEVICE_NAME, "mahita Android");
		capability.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capability.setCapability(MobileCapabilityType.AUTOMATION_NAME,AutomationName.ANDROID_UIAUTOMATOR2);
		capability.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		capability.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE, "C:\\Users\\NarreddiMahitha\\Desktop\\chrome exe file\\chromedriver_win32 (1)\\chromedriver.exe" );
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),capability);
		return driver;
		
	}

}
