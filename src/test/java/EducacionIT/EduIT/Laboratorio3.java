package EducacionIT.EduIT;

	import static org.testng.Assert.assertTrue;
	
	import java.io.File;
	import java.io.IOException;
	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterSuite;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeSuite;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;
	import org.testng.Assert;
	
	public class Laboratorio3 {
	        
	        WebDriver driver;
	        
	        String URL="http://www.automationpractice.pl/index.php?controller=authentication&back=my-account";
	        
	        @BeforeSuite
	        public void setUP() {
	                 System.setProperty("webdriver.chrome.driver","/Users/lorenamartins/eclipse-workspace/EduIT/Drivers/chromedriver");
	             driver= new ChromeDriver();
	        }
	        
	        @BeforeTest
	        public void irUrl() {
	                driver.get(URL);                
	                
	        }
	    @BeforeClass
	    public void maxVentana() {
	            driver.manage().window().maximize();
	            
	    }
	   
	    @Test
	    public void registrarUsuario() {
	            WebElement txt_Email=driver.findElement(By.id("email_create"));
	                txt_Email.sendKeys("micorreo"+Math.random()+"@correo.com");
	                WebElement btn_create=driver.findElement(By.id("SubmitCreate"));
	                btn_create.click();
	                
	                
	                WebDriverWait mywait=new WebDriverWait(driver,10);
	                mywait.until(ExpectedConditions.elementToBeClickable(By.id("id_gender1")));
	                
	                WebElement opt_gender=driver.findElement(By.id("id_gender1"));
	                opt_gender.click();
	                
	                
	                WebElement txt_FirstName=driver.findElement(By.name("customer_firstname"));
	                txt_FirstName.sendKeys("Juan");
	                
	                WebElement txt_Password=driver.findElement(By.name("passwd"));
	                txt_Password.sendKeys("123456");
	                
	                Select months=new Select (driver.findElement(By.id("months")));
	                
	                months.selectByValue("4");
	                
	                
	                WebElement btn_Register=driver.findElement(By.xpath("//*[text()='Register']"));
	                btn_Register.click();
	            Assert.assertEquals("http://www.automationpractice.pl/index.php?controller=authentication", driver.getCurrentUrl());
	            
	    }
	        
	    @Test
	    public void pruebaTest() {
	            
	            assertTrue(true);
	    }
	   
	    @AfterMethod
	    public void CapturaPantalla() throws IOException {
	    	File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    	FileUtils.copyFile(screen, new File("/Users/lorenamartins/eclipse-workspace/EduIT/Evidencias/pantalla.png"));
	    }
	    
	    @AfterClass
	    public void finPrueba() {
	            
	            System.out.println("fin prueba");
	    }
	    
	        @AfterTest
	    public void cierraNavegador() {
	                
	                driver.close();        
	        }
	        
	        @AfterSuite
	        public void finSuite() {
	            System.out.println("fin suite");
	        }
	}

