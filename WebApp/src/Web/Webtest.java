package Web;

import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Webtest extends Base{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
	
		AndroidDriver<AndroidElement> driver = Capability();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("IBM");
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		List<AndroidElement>links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
	//	for(int i=0;i<links.size();i++);
	//	{
			
	//		System.out.println(links.get().getText());		
	//	}
	JavascriptExecutor js = (JavascriptExecutor)driver;
	WebElement element = driver.findElement(By.xpath("//*[contains(text(),'IBM - Wikipedia')]"));
	Thread.sleep(3000);
	js.executeScript("arguments[0].scrollIntoView(true)",element);
	element.click();
	
	
	}

	}

