package reusable;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


public class Webdriverhelper {
	
	
	static WebDriver driver;
	static Actions actions;
	 public Webdriverhelper(WebDriver driver)
	 {
		 this.driver=driver;
	}
	 
	 public Webdriverhelper()
	 {
		 this.driver=driver;
	}
	
	

	public void sendText(By element, String text) throws IOException {

		driver.findElement(element).sendKeys(text);
		
	}
	public void click(By element) throws IOException, InterruptedException {
         Thread.sleep(1000);
		driver.findElement(element).click();
	}
	public void waiting() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	public boolean displayed(By element) throws IOException {
		
	

		return driver.findElement(element).isDisplayed();
	}
	public void getText(By element, String text) throws IOException {

		driver.findElement(element).getText();
		
	}
	public String geturl()
	{
		return driver.getCurrentUrl();
	
	}
	
	public void keydown(int num)
	{
		 actions = new Actions(driver);
		for(int i=0;i<num;i++)
		{
			actions.sendKeys(Keys.DOWN).perform();
		}
	}
	public void Enterkey()
	{
		actions.sendKeys(Keys.ENTER).perform();
		
	}
	
//	public void takeSCreenshot(ITestResult result) throws IOException
//	{
//		
//	  System.out.println("taking screenshot");
//	  System.out.println(result.getName());
//	  File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	  FileUtils.copyFile(src, new File("D:\\MIndtreeassign\\NoBrokerHybrid\\screenshots\\"+result.getName()+".png"));
//	}

}
