package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import page.BasePage;

public class RunningTestNG extends BasePage {

	WebDriver driver;

	@BeforeMethod
	public void init() {

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://techfios.com/test/101/");
		// return driver;

	}

	@Test
	public void TestNGAutomation() {

		WebElement DUE_MONTH_DROPDOWN_ELEMENT1 = driver.findElement(By.xpath("//select[@name = 'due_month']"));

		Select sel1 = new Select(DUE_MONTH_DROPDOWN_ELEMENT1);
		sel1.selectByVisibleText("Jan");
		
		WebElement DUE_MONTH_DROPDOWN_ELEMENT2 = driver.findElement(By.xpath("//select[@name = 'due_month']"));

		Select sel2 = new Select(DUE_MONTH_DROPDOWN_ELEMENT2);
		sel2.selectByVisibleText("Feb");
		
		WebElement DUE_MONTH_DROPDOWN_ELEMENT3 = driver.findElement(By.xpath("//select[@name = 'due_month']"));

		Select sel3 = new Select(DUE_MONTH_DROPDOWN_ELEMENT3);
		sel3.selectByVisibleText("Mar");
		
		WebElement DUE_MONTH_DROPDOWN_ELEMENT4 = driver.findElement(By.xpath("//select[@name = 'due_month']"));

		Select sel4 = new Select(DUE_MONTH_DROPDOWN_ELEMENT4);
		sel4.selectByVisibleText("Apr");
		
		WebElement DUE_MONTH_DROPDOWN_ELEMENT5 = driver.findElement(By.xpath("//select[@name = 'due_month']"));

		Select sel5 = new Select(DUE_MONTH_DROPDOWN_ELEMENT5);
		sel5.selectByVisibleText("May");
		
		WebElement DUE_MONTH_DROPDOWN_ELEMENT6 = driver.findElement(By.xpath("//select[@name = 'due_month']"));

		Select sel6 = new Select(DUE_MONTH_DROPDOWN_ELEMENT6);
		sel6.selectByVisibleText("Jun");
		
		WebElement DUE_MONTH_DROPDOWN_ELEMENT7 = driver.findElement(By.xpath("//select[@name = 'due_month']"));

		Select sel7 = new Select(DUE_MONTH_DROPDOWN_ELEMENT7);
		sel7.selectByVisibleText("Jul");
		
		WebElement DUE_MONTH_DROPDOWN_ELEMENT8 = driver.findElement(By.xpath("//select[@name = 'due_month']"));

		Select sel8 = new Select(DUE_MONTH_DROPDOWN_ELEMENT8);
		sel8.selectByVisibleText("Aug");
		
		WebElement DUE_MONTH_DROPDOWN_ELEMENT9 = driver.findElement(By.xpath("//select[@name = 'due_month']"));

		Select sel9 = new Select(DUE_MONTH_DROPDOWN_ELEMENT9);
		sel9.selectByVisibleText("Sep");
		
		WebElement DUE_MONTH_DROPDOWN_ELEMENT10 = driver.findElement(By.xpath("//select[@name = 'due_month']"));

		Select sel10 = new Select(DUE_MONTH_DROPDOWN_ELEMENT10);
		sel10.selectByVisibleText("Oct");
		
		WebElement DUE_MONTH_DROPDOWN_ELEMENT11 = driver.findElement(By.xpath("//select[@name = 'due_month']"));

		Select sel11 = new Select(DUE_MONTH_DROPDOWN_ELEMENT11);
		sel11.selectByVisibleText("Nov");
		
		WebElement DUE_MONTH_DROPDOWN_ELEMENT12 = driver.findElement(By.xpath("//select[@name = 'due_month']"));

		Select sel12 = new Select(DUE_MONTH_DROPDOWN_ELEMENT12);
		sel12.selectByVisibleText("Dec");
		
		
		
		boolean lastMonth = driver.findElement(By.xpath("//*[@id=\"extra\"]/select[3]/option[13]")).isSelected();
		
		if(lastMonth) {
			System.out.println("All months have been selected with this code.");
		}else {
			System.out.println("Something is incorrect in your code.");
		}
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
