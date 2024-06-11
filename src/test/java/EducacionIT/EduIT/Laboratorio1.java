package EducacionIT.EduIT;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Laboratorio1 {

	@Test
	public void lab1_test() {
		System.out.print("Hola Mundo de Automatización");
	}

	@Test
	public void lab1_e1() {

		System.setProperty("webdriver.chrome.driver",
				"/Users/lorenamartins/eclipse-workspace/EduIT/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.automationpractice.pl/index.php?");
		driver.close();

	}

	@Test
	public void lab1_e2() {

		System.setProperty("webdriver.gecko.driver",
				"/Users/lorenamartins/eclipse-workspace/EduIT/Drivers/geckodriver");
		FirefoxOptions options = new FirefoxOptions();
		options.setBinary("/Applications/Firefox.app/Contents/MacOS/firefox");
		WebDriver driver = new FirefoxDriver(options);
		driver.get("http://www.automationpractice.pl/index.php?");
		driver.close();

	}

	@Test
	public void lab1_e3() {

		System.setProperty("webdriver.chrome.driver",
				"/Users/lorenamartins/eclipse-workspace/EduIT/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.automationpractice.pl/index.php?");
		WebElement txtBuscador = driver.findElement(By.id("search_query_top"));
		txtBuscador.clear();
		txtBuscador.sendKeys("Blouse");
		txtBuscador.sendKeys(Keys.ENTER);
		driver.close();

	}

}
