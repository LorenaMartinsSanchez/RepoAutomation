package Pruebas;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.*;

public class CrossBrowserTest {
	
	WebDriver driver = null;
	String URL="http://www.automationpractice.pl/index.php";
	String PATH="/Users/lorenamartins/eclipse-workspace/EduIT/Drivers/chromedriver";
	String PATHF="/Users/lorenamartins/eclipse-workspace/EduIT/Drivers/geckodriver";
	
	@BeforeMethod
	@Parameters("navegador")
	public void setUp(String navegador) {
		
		if(navegador.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver",PATH);
		driver = new ChromeDriver();
		
		}
		else {
		System.setProperty("webdriver.gecko.driver",PATHF);
		FirefoxOptions options = new FirefoxOptions();
		options.setBinary("/Applications/Firefox.app/Contents/MacOS/firefox");
		driver = new FirefoxDriver(options);
		}
		
		 driver.get(URL);   
		 driver.manage().window().maximize();
		
	}
	
	
	
	@Test
	public void buscarPalabra() {

		WebElement txtBuscador=driver.findElement(By.cssSelector("input[placeholder='Search']"));

		txtBuscador.clear();

		txtBuscador.sendKeys("Blouse");

		txtBuscador.sendKeys(Keys.ENTER);
	}
	
	@AfterMethod
	public void cierreNavegador() {
		
		driver.close();
		
	}
	
}

