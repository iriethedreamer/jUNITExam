package mavenExam;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
     
public class LearnMaven {
	 
	String browser="chrome";
	 WebDriver driver;

         @Before        
        public void init() {
        	 
        	 
        	 if(browser.equalsIgnoreCase("chrome")) {
             	System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
            	driver=new ChromeDriver();
        		 
        		 
        	 }else if(browser.equalsIgnoreCase("edge")) {
             	System.setProperty("webdriver.edge.driver","drivers\\msedgedriver.exe");
            	driver= new EdgeDriver();
        	 } 
        		
        	 driver.manage().deleteAllCookies();
         	driver.get("https://techfios.com/test/107/");
         	driver.manage().window().maximize();
         	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
            }
        

        	
       
        	
        	
        	
        	
        	
         @Test
        public void test1() throws InterruptedException {
        	
         driver.findElement(By.name("allbox")).click();
         Thread.sleep(3000);
         }
         
         @Test
         public void test2() throws InterruptedException {
    	 driver.findElement(By.name("todo[0]")).click();
    	 driver.findElement(By.name("submit")).click();
    	 Thread.sleep(3000);
         }
         
        
         @Test
         public void test3() throws InterruptedException {
         driver.findElement(By.name("allbox")).click();
         driver.findElement(By.name("submit")).click();
         Thread.sleep(3000); 
         }
         
         
         @After
         public void TearDown() {
        	 
        	driver.close();
        	driver.quit();
        	 
         
         
         
         
         
         
         
         
         
         
        
         }


 







}
