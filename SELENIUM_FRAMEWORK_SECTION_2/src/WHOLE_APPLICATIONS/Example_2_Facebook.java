package WHOLE_APPLICATIONS;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example_2_Facebook 
{
 public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
//		FileInputStream file = new FileInputStream("D:\\TESTING EXCEL SHEET MAINTAIN\\Upstox.xlsx");
//		
//		Sheet SheetOpen = WorkbookFactory.create(file).getSheet("UPSTOX");
		
  System.setProperty("webdriver.chrome.driver",
				"D:\\SELENIUM_SOFTWEAR\\chromedriver_win32 (1) - Copy\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://www.facebook.com/");
//	String nameText = SheetOpen.getRow(2).getCell(0).getStringCellValue();
//	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(nameText);
//	
//	String SurText = SheetOpen.getRow(2).getCell(1).getStringCellValue();
//	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(SurText);
//	
//	String MOText = SheetOpen.getRow(1).getCell(1).getStringCellValue();
//	driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(MOText);
//		
//	String PwdText = SheetOpen.getRow(0).getCell(0).getStringCellValue();
//	driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys(PwdText);
//	
//	WebElement DateText = driver.findElement(By.xpath("//select[@name='birthday_day']"));
//	
//	    Select sc = new Select(DateText);
//	 String DT = SheetOpen.getRow(2).getCell(2).getStringCellValue();
//	        sc.selectByVisibleText(DT);
	}

}
