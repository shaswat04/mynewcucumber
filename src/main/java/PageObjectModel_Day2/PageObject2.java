package PageObjectModel_Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class PageObject2 {
	
	@Test
	public void f()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6b.01.16\\Desktop\\browsers driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		PageClass2 PageObject2=new PageClass2(driver);
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		PageClass2 locateElements =PageFactory.initElements(driver, PageClass2.class);
		locateElements.loginMethod("hemant.acc@gmail.com", "hemant");
	}

}
