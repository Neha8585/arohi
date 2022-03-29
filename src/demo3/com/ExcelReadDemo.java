package demo3.com;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.netty.handler.codec.base64.Base64;
import io.netty.handler.codec.base64.Base64Dialect;



public class ExcelReadDemo {
	String chromedriver= "webdriver.chrome.driver";
	String chromelocation="C:\\Users\\Shree\\eclipse-workspace\\demo3\\chromdriver\\chromedriver.exe";
	WebDriver driver;
	@Test
	public void main() throws IOException, InterruptedException {
		System.setProperty(chromedriver,chromelocation);
		FileInputStream fis=new FileInputStream("C:\\Users\\Shree\\Desktop\\Excel 2013.lnk");
		XSSFWorkbook Workbook=new XSSFWorkbook(fis);
		Sheet sheet=Workbook.getSheet("ExcelReadDemo");
		int rowCount=sheet.getLastRowNum();//row count
		int colCount=sheet.getRow(0).getLastCellNum();//col count
		String name=" ";
		String pass=" ";
		for(int i=1;i<rowCount;i++) {
			Row row= sheet.getRow(i);
			//for (int j=0;j<row.getLastCellNum();j++) {
				name=row.getCell(0).getStringCellValue();
				pass=row.getCell(1).getStringCellValue();
				//break;
				//System.out.println(name+" "+pass);
			}
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Reporter.log("able to facebook page",true);
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys(name);
		driver.findElement(By.id("pass")).sendKeys((pass));
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='-91sb-9ls8")).click();
	
		
		driver.close();
		
}
	//utils things
//	public static String decodepass( String pass) {
//		byte[] decodepass=Base64.decodeBase64(pass);
//		return(new String(decodepass));
	}
//}