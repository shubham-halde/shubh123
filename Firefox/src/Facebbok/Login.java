package Facebbok;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {
	
	public static void main(String[]args) {
		System.setProperty("webdriver.gecko.driver","C:\\Selenium\\Geckodriver\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.get("https://www.facebook.com/");
		d.manage().window().maximize();
		d.findElement(By.id("email")).sendKeys("shubham.halde@gmail.com");
		d.findElement(By.name("pass")).sendKeys("8983404579");
		d.findElement(By.id("u_0_b")).click();
		
		
	}

}
