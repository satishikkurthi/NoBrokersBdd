package utility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Chromedriver {
	
	
	Readprops read;
	WebDriver driver;
	
	public WebDriver loadDriver() throws IOException
	{
		read = new Readprops();
		if(read.getDriverName().equals("chrome"))
		{
		System.out.println("i was called");
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(read.geturl());
		}
		return driver;
		
	}
	

}
