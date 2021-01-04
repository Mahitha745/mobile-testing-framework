package Native;


import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;
public class Demo1 extends capability{
	
	//@BeforeTest
	//public void bt() throws MalformedURLException 
	//{
		//AndroidDriver<AndroidElement> driver = Capability();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//}

	
	//@Test
	//public void Testcase1()
	//{
	   // System.out.println("The app is opening in the emulator without installing");	
	//}
	
	AndroidDriver<AndroidElement> driver;
	@Test(enabled=false)
    public void testcase1() throws IOException, InterruptedException 
    {
        driver = Capability();
        
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //i want to click on preference
        driver.findElement(MobileBy.AccessibilityId("Preference")).click();
        //i want to click on preference dependices
        driver.findElement(MobileBy.AccessibilityId("3. Preference dependencies")).click();
        //i want to click on the checkbox
        driver.findElement(By.id("android:id/checkbox")).click();
        driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"WiFi settings\")")).click();
        driver.findElement(MobileBy.className("android.widget.EditText")).sendKeys("mahita");	
        driver.hideKeyboard();
        AndroidElement button = driver.findElements(MobileBy.className("android.widget.Button")).get(0);
        button.click();
        Thread.sleep(3000);
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        
        } 
	
	@Test(enabled=false)
	public void testcase2() throws MalformedURLException
	{
        driver = Capability();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Views\")")).click();
        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
        System.out.println(driver.findElementByAndroidUIAutomator("new UiSelector().clickable(true)").getSize());
        AndroidElement expandlist = driver.findElementByAccessibilityId("Expandable Lists");
        //gestures//this is very new feature of appium the import files are not available we have to do it manually
        TouchAction t = new TouchAction(driver);
        t.tap(tapOptions().withElement(element(expandlist))).perform();
        driver.findElementByAccessibilityId("1. Custom Adapter").click();
        AndroidElement LP = driver.findElementByAndroidUIAutomator("text(\"People Names\")");
        t.longPress(longPressOptions().withElement(element(LP)).withDuration(ofSeconds(3))).release().perform();
        //System.out.println(driver.findElements(MobileBy.id("android:id/title")).get(1).getText());
        String Actualtext = driver.findElements(MobileBy.id("android:id/title")).get(1).getText();
	    String ExpectedText = "Sample action";
	    Assert.assertEquals(Actualtext, ExpectedText);
	}
	
	@Test(enabled=false)
	public void testcase3() throws MalformedURLException, InterruptedException
	{
		driver = Capability();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
	     //how to scroll
	    //driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))").click();
	    driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Layouts\"))").click();
	    Thread.sleep(4000); 
	}
	
	@Test(enabled=false)
	public void testcase4() throws MalformedURLException
	{
		driver = Capability();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
	    driver.findElementByAccessibilityId("Date Widgets").click();
	    driver.findElementByAccessibilityId("2. Inline").click();
	    driver.findElementByAccessibilityId("9").click();
	    AndroidElement btn1 = driver.findElementByAccessibilityId("15");
	    AndroidElement btn2 = driver.findElementByAccessibilityId("45");
	    TouchAction t = new TouchAction(driver);
	    t.longPress(longPressOptions().withElement(element(btn1)).withDuration(ofSeconds(3))).moveTo(element(btn2)).release().perform();    
	    
	}
	
	@Test
	public void testcase5() throws MalformedURLException
	{
		driver = Capability();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
	    driver.findElementByAndroidUIAutomator("text(\"Drag and Drop\")").click();
	    AndroidElement btn1=driver.findElementsByClassName("android.view.View").get(0);
        
        AndroidElement btn2=driver.findElementsByClassName("android.view.View").get(1);
        TouchAction t = new TouchAction(driver);
        t.longPress(longPressOptions().withElement(element(btn1))).moveTo(element(btn2)).release().perform();
        
	}
}