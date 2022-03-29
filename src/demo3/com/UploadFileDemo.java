package demo3.com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class UploadFileDemo {


	String chromedriver= "webdriver.chrome.driver";
	String chromelocation="C:\\Users\\Shree\\eclipse-workspace\\demo3\\chromdriver\\chromedriver.exe";
	WebDriver driver;
	@Test

	public void uploadFile() {
		System.setProperty(chromedriver,chromelocation);
		driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/FileUpload.html");
		WebElement web=driver.findElement(By.id("input-4"));
	web.sendKeys("‪C:\\Users\\Shree\\Desktop\\Excel 2013.lnk");
}
}