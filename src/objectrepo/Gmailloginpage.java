package objectrepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.FindElement;

public class Gmailloginpage {

	WebDriver driver ;

	public Gmailloginpage(WebDriver driver){
		this.driver=driver;
	}
	By FirstName=By.xpath("//input[@id='FirstName']");
	By Lastname=By.xpath("//input[@id='LastName']");
	By Submit = By.xpath(".//*[@id='submitbutton']");
	public WebElement FirstName(){
		return driver.findElement(FirstName);	
	}
	public WebElement LastName(){
		return driver.findElement(Lastname);	
	}

	public WebElement submit() {
		// TODO Auto-generated method stub
		return driver.findElement(Submit);	
	}
}
