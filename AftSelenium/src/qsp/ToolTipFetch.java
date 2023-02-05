package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToolTipFetch 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", 
				"./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(1000);
		Dimension d=new Dimension(420, 420);
		driver.manage().window().setSize(d);
		Thread.sleep(1000);
		Point p=new Point(420, 420);
		driver.manage().window().setPosition(p);
		
	}
}