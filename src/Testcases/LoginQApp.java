package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepo.Gmailloginpage;
import objectrepo.HomePage;

public class LoginQApp {
	@Test
	public void login(){
		System.setProperty("webdriver.chrome.driver","E:\\Google Drive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/SignUp?hl=en");
		Gmailloginpage gp= new Gmailloginpage(driver);
		gp.FirstName().sendKeys("Rajesh");
		gp.LastName().sendKeys("Beg");
		gp.submit().click();
		HomePage hp = new HomePage(driver);
			hp.scroll();
		

}
}