package EducacionIT.EduIT;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Laboratorio2 {

	@Test
	public void lab2_E1test() {

		String URL = "http://www.automationpractice.pl/index.php?controller=authentication&back=my-account";
		String PATH = "/Users/lorenamartins/eclipse-workspace/EduIT/Drivers/chromedriver";

		System.setProperty("webdriver.chrome.driver", PATH);
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();

		WebElement txt_Email = driver.findElement(By.id("email_create"));
		txt_Email.sendKeys("micorreo" + Math.random() + "@correo.com");
		WebElement btn_create = driver.findElement(By.name("SubmitCreate"));
		btn_create.click();

		WebDriverWait mywait = new WebDriverWait(driver, 10);
		mywait.until(ExpectedConditions.elementToBeClickable(By.id("id_gender1")));

		WebElement opt_gender = driver.findElement(By.id("id_gender1"));
		opt_gender.click();

		WebElement txt_Firstname = driver.findElement(By.name("customer_firstname"));
		txt_Firstname.sendKeys("Juan");

		WebElement txt_Password = driver.findElement(By.name("passwd"));
		txt_Password.sendKeys("123456");

		Select months = new Select(driver.findElement(By.id("months")));
		months.selectByValue("4");

		WebElement btn_Register = driver.findElement(By.xpath("//*[text()='Register']"));
		btn_Register.click();
	}

}
