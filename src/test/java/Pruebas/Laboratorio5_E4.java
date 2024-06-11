package Pruebas;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import paginas.paginaLogin;


public class Laboratorio5_E4{
	

	WebDriver driver;
	paginaLogin login;
	
	
	String URL="https://demo.guru99.com/test/table.html";
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
	    public void verCelda() {
	        
	        WebElement verCelda=driver.findElement(By.xpath("//tbody/tr[4]/td[3]"));
	        Assert.assertEquals(verCelda.getText(),"8");
	        
	    }

	}