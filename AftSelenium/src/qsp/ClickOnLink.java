package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClickOnLink {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Faculty/Desktop/link.html");
		Thread.sleep(1500);
		WebElement firsttext = driver.findElement(By.name("hello"));
		firsttext.sendKeys("Hello");
		Thread.sleep(1500);
		firsttext.clear();
		Thread.sleep(2000);
		driver.findElement(By.className("world")).sendKeys("world");
		Thread.sleep(1500);
		driver.findElement(By.className("world")).clear();
		
	}

}
