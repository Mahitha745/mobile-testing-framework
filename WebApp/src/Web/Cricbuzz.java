package Web;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Cricbuzz extends Base{

	public static void main(String[] args) throws MalformedURLException {
		
        AndroidDriver<AndroidElement> driver = Capability();
        driver.get("http://www.cricbuzz.com");
        //driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        //driver.findElement(By.xpath("//*[contains(text(),'Menu')]")).click();
        driver.findElementByXPath("//a[@href='#menu']").click();
        driver.findElement(By.xpath("//a[@title='Cricbuzz Home']")).click();
        String url = driver.getCurrentUrl();
        String title = driver.getTitle();
        System.out.println(url + " and " + title);
        WebElement ele = driver.findElement(By.xpath("//*[contains(text(),'Top Stories')]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", ele);
        
        
    }

        }

