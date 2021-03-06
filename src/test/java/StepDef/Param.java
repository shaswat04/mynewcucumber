package StepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Param {
	WebDriver driver=null;
	@Given("^user is open the application$")
	public void user_is_open_the_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6b.01.16\\Desktop\\browsers driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();
	   
	}

	@When("^User click on to signin link$")
	public void user_click_on_to_signin_link() throws Throwable {
		driver.findElement(By.linkText("SignIn")).click();
	   
	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String username, String password) throws Throwable {
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.name("Login")).click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/a")).click();
		driver.close();	   
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
	   
	}

}
