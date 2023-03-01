package WHOLE_APPLICATIONS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\SELENIUM_SOFTWEAR\\chromedriver_win32 (1) - Copy\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
		
		       driver.get("https://www.facebook.com/");
				
	}

}
