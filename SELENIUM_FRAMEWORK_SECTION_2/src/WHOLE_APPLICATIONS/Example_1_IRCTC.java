package WHOLE_APPLICATIONS;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_1_IRCTC 
{
     public static void main(String[] args) throws InterruptedException 
     {
    	 System.setProperty("webdriver.chrome.driver",
 				"D:\\SELENIUM_SOFTWEAR\\chromedriver_win32 (1) - Copy\\chromedriver.exe");
 				
 				WebDriver driver = new ChromeDriver();
 		
 		       driver.get("https://www.irctc.co.in/nget/train-search");
 				
 		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
 		// Click on ok                   
 	 driver.findElement(By.xpath("//button[text()='OK']")).click();
 		                Thread.sleep(1000);
 		//Click on From destination                
  WebElement fromText = driver.findElement(By.xpath("(//input[@role='searchbox'])[1]"));
                            fromText.click();
                            fromText.sendKeys("PUN");
                        Thread.sleep(1000);
                        
	// Select Option from From destination
 List<WebElement> selectAll = driver.findElements(By.xpath("(//*[@id=\"origin\"]/span/div//li)[3]"));
 
 String Expt = "PUNE JN - PUNE";
 
 for(WebElement s1:selectAll)
 {
	String ActOpt = s1.getText();
	
	if(ActOpt.equalsIgnoreCase(Expt))
	{
		s1.click();
		break;
	}
	        Thread.sleep(2000);
	// click on TO Textbox
	WebElement Dest_From = driver.findElement(By.xpath("(//input[@role='searchbox'])[2]"));
	          Dest_From.click();
	          Dest_From.sendKeys("NAG");
	 // Select Option From TO textFeild    
	 List<WebElement> toText = driver.findElements(By.xpath("(//input[@autocomplete='off'])[2]"));
	          
	       String Expt_1 = "NAGPUR - NGP";
	       for(WebElement S2:toText)
	       {
	    	  String ActOpt_1 = S2.getText();
	    	  
	    	  if(Expt_1.equalsIgnoreCase(Expt_1))
	    	  {
	    		    S2.click();
	    		     break;
	    	  }
	    	 
	       }
	       
 }         
 
}
}
