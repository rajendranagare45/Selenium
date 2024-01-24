package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefination {
	WebDriver driver;
@Given("Open the browser enter url")
public void open_the_browser_enter_url() {
    // Write code here that turns the phrase above into concrete actions
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\ChromeDeiver 120\\chromedriver-win64\\chromedriver.exe");
	 driver =new ChromeDriver();
	
}

@Given("Make sure url is validated")
public void make_sure_url_is_validated() {
   
	 driver.get("https://the-internet.herokuapp.com/login");
}

@When("User enters username")
public void user_enters_username() {
   
	driver.findElement(By.id("username")).sendKeys("tomsmith");
}

@When("User enters password")
public void user_enters_password() {
    
	driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
}

@When("User clicks on Login button")
public void user_clicks_on_Login_button() {
    
	driver.findElement(By.xpath("//button[@type='submit']")).click();
}

@Then("Login should happens successfully")
public void login_should_happens_successfully() {
    
	System.out.println("User Sucessfully login");
}

@Then("Home page should be displayed")
public void home_page_should_be_displayed() {
    
	System.out.println("Sucessfully login and user should be Home page");

}

}
