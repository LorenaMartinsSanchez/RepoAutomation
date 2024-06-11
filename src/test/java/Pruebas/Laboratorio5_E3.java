package Pruebas;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import paginas.paginaLogin;


public class Laboratorio5_E3{
	

	WebDriver driver;
	paginaLogin login;
	
	
	String URL="http://omayo.blogspot.com/";
	String PATH="/Users/lorenamartins/eclipse-workspace/EduIT/Drivers/chromedriver";

	
	@BeforeSuite
	public void setUp() {
		
		    System.setProperty("webdriver.chrome.driver", PATH);
		    driver=new ChromeDriver();
		    driver.get(URL);
		    driver.manage().window().maximize();
	}
	
	
	@AfterSuite
	public void cierreNavegador() {
		
		driver.close();
		
	}
	
	   @Test
	   public void popUp() throws InterruptedException {
	       
	      WebElement btnAlert=driver.findElement(By.id("alert1"));
	      btnAlert.click();
	      Thread.sleep(2000);
	      Alert popUp=driver.switchTo().alert();
	      popUp.accept();
	     
	       
	   }

	    
	}
