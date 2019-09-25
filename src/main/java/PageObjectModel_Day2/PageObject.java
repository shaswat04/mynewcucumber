package PageObjectModel_Day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageObject {
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6b.01.16\\Desktop\\browsers driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		PageClass PageObject=new PageClass(driver);
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		PageObject.clicklink();
		String username=null;
		PageObject.typeuname(username);
		String password=null;
		PageObject.typepwd(password);
		PageObject.clickonlogin();
		PageObject.clickonlogout();
		System.out.println("title of the page is "+driver.getTitle());
	}
}
