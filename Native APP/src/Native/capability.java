package Native;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class capability {

	public static AndroidDriver<AndroidElement> Capability() throws MalformedURLException {
		
		//File fp = new File("src\\ApiDemos-debug.apk");
		DesiredCapabilities capability = new DesiredCapabilities();	
		//capability.setCapability(MobileCapabilityType.APP, fp.getAbsolutePath());
		capability.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "io.appium.android.apis");
        capability.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "io.appium.android.apis.ApiDemos");
		//capability.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.calculator2");
        //capability.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.android.calculator2.Calculator");
		capability.setCapability(MobileCapabilityType.DEVICE_NAME, "mahita Android");
		capability.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capability.setCapability(MobileCapabilityType.AUTOMATION_NAME,AutomationName.ANDROID_UIAUTOMATOR2);
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),capability);
		return driver;

	}

}
