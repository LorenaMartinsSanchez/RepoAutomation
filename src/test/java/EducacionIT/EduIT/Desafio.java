package EducacionIT.EduIT;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Desafio {

	String URL = "https://www.saucedemo.com/";
	String PATH = "/Users/lorenamartins/eclipse-workspace/EduIT/Drivers/geckodriver";

	WebDriver driver;

	@BeforeMethod
	public void inicioSesion() {

		try {
			System.setProperty("webdriver.gecko.driver", PATH);
			FirefoxOptions options = new FirefoxOptions();
			options.setBinary("/Applications/Firefox.app/Contents/MacOS/firefox");
			WebDriver driver = new FirefoxDriver(options);

			driver.get(URL);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		} catch (Exception e) {
			// Imprimir la pila de errores para facilitar la depuración
			e.printStackTrace();
			// Falla la configuración si ocurre una excepción
			AssertJUnit.fail("Setup failed: " + e.getMessage());
		}

		WebElement txt_UserName = driver.findElement(By.id("user-name"));
		txt_UserName.sendKeys("standard_user");

		WebElement txt_Password = driver.findElement(By.id("password"));
		txt_Password.sendKeys("secret_sauce");

		WebElement btn_Login = driver.findElement(By.id("login-button"));
		btn_Login.click();

	}

	@Test
	public void testCompra() {
		elegirProducto();
		finalizarCompra();
		registro();
	}

	public void elegirProducto() {

		WebElement btnAddToCart = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		btnAddToCart.click();

		WebElement btnCart = driver.findElement(By.id("shopping_cart_container"));
		btnCart.click();
	}

	public void finalizarCompra() {

		WebElement btnCheckout = driver.findElement(By.id("checkout"));
		btnCheckout.click();
	}

	public void registro() {

		WebElement txt_FirstName = driver.findElement(By.id("first-name"));
		txt_FirstName.sendKeys("Luciana");

		WebElement txt_LastName = driver.findElement(By.id("last-name"));
		txt_LastName.sendKeys("Calvi");

		WebElement txt_PostalCode = driver.findElement(By.id("postal-code"));
		txt_PostalCode.sendKeys("5519");

		WebElement btnContinue = driver.findElement(By.id("continue"));
		btnContinue.click();

		WebElement btnFinish = driver.findElement(By.id("finish"));
		btnFinish.click();

	}

	@AfterMethod
	public void cerrarNavegador() {

		driver.close();

	}

}
