package objectrepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
WebDriver driver ;
	
	public HomePage(WebDriver driver){
	this.driver=driver;
	}
	By scroll= By.xpath("xyz");
	public WebElement scroll(){
		return driver.findElement(scroll);
		
	}

}
