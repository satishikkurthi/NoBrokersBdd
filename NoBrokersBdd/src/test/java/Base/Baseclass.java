package Base;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import reusable.Webdriverhelper;
import uistore.Buyui;
import uistore.Homepage;
import uistore.Loginui;
import utility.Chromedriver;
import utility.ExcelData;
import utility.Logs;

public class Baseclass {

	Chromedriver chrome = new Chromedriver();
	static WebDriver driver;
	static Webdriverhelper helper;
	static ExcelData data;
	 static Logs log;
   static	ExtentHtmlReporter extent;
	static ExtentReports report;
	static ExtentTest test;
	static SimpleDateFormat formatter;
	static Date date;
	
	public void once()
	{
		formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		date = new Date();
		String name = "" + date;
		String name1 = name.substring(11, 13) + "_" + name.substring(14, 16) + "_" + name.substring(17, 19) + "_"
				+ name.substring(4, 7) + name.substring(8, 10) + "report.html";
		extent = new ExtentHtmlReporter("D:\\MIndtreeassign\\NoBrokersBdd\\reports\\report.html");
		report = new ExtentReports();
		report.attachReporter(extent);
	}

	public void hitdriver() throws IOException {
		
		driver = chrome.loadDriver();
		helper = new Webdriverhelper(driver);
		data = new ExcelData();
		data.getlogindata();
		log = new Logs();
		log.createLogger(Baseclass.class);
		log.enterInfoLog("loading the driver");
		

	}
	public void getdriver() throws IOException
	{
		driver=chrome.loadDriver();
	}

	public void Entercreds() throws IOException, InterruptedException {
		test = report.createTest("validcredentials");
		log.enterInfoLog("clicking on login icon");
		helper.click(Loginui.loginbutton);
		
		log.enterInfoLog("entering the phone number");
        helper.sendText(Loginui.phonenumberfield, data.getcorrectphonenumber());
		log.enterInfoLog("clicking on i have password");
		helper.click(Loginui.radiopassword);
		log.enterInfoLog("entering the password");

		helper.sendText(Loginui.passwordfield, data.getcorrectpassword());
		helper.waiting();
		helper.click(Loginui.sigin);
		log.enterInfoLog("clicking on sign in");
		System.out.println(helper.geturl()+"before");
	}

	public void EnterWrongcreds() throws IOException, InterruptedException {
		test = report.createTest("Invalidcredentials");
		helper.click(Loginui.loginbutton);
		log.enterInfoLog("entering the phone number");

		helper.sendText(Loginui.phonenumberfield, data.getcorrectphonenumber());
		log.enterInfoLog("clicking on i have password");
		helper.click(Loginui.radiopassword);
		log.enterInfoLog("entering the password");

		helper.sendText(Loginui.passwordfield, data.getincorrectpassword());
		helper.waiting();
		helper.click(Loginui.sigin);
		helper.waiting();
		helper.waiting();
		log.enterInfoLog("clicking on sign in");
		System.out.println(helper.geturl()+"wrongcreds");
	}

	public void verifyLogin() throws IOException, InterruptedException {
		Thread.sleep(2000);

//		if (helper.displayed(Loginui.symbolsign)) {
//			assertTrue(true);
//
//		} else {
//			assertTrue(false);
//		}
//		helper.waiting();
		System.out.println(helper.geturl()+"after creds");
		
	}
	
	public void rentalagreement() throws IOException, InterruptedException
	{
		log.enterInfoLog("clicking on menu");
		test = report.createTest("rental agreement");
		log.enterInfoLog("clicking on rentalagreement");
		helper.click(Homepage.menu);
		   Thread.sleep(1000);
		   helper.click(Homepage.rental);
		   Thread.sleep(1000);
		   helper.click(Homepage.location);
		   
	}
	public void paintings() throws IOException, InterruptedException
	{
		
		log.enterInfoLog("clicking on menu");
		test = report.createTest("paintings and cleaning");
		log.enterInfoLog("clicking on painting option");
		helper.click(Homepage.menu);
		   Thread.sleep(1000);
		   helper.click(Homepage.painters);
		   Thread.sleep(1000);
		   helper.click(Homepage.location);
		   
	}
	public void referandearn() throws IOException, InterruptedException
	{
		log.enterInfoLog("clicking on menu");
		test = report.createTest("refer and earn");
		log.enterInfoLog("clicking on refer and earn");
		helper.click(Homepage.menu);
		   Thread.sleep(1000);
		   helper.click(Homepage.refer);
		   Thread.sleep(1000);
	
		   
	}
	public void Buyerplans() throws IOException, InterruptedException
	{
		log.enterInfoLog("clicking on menu");
		test = report.createTest("Buyerplans");
		log.enterInfoLog("clicking on buyer plans");
		helper.click(Homepage.menu);
		   Thread.sleep(1000);

		helper.click(Homepage.Buyer);
	
		   
	}
	public void ownerplans() throws IOException, InterruptedException
	{
		log.enterInfoLog("clicking on menu");
		test = report.createTest("Buyerplans");
		log.enterInfoLog("clicking on ownerplans");
		helper.click(Homepage.menu);
		   Thread.sleep(1000);
		   helper.click(Homepage.owner);
		   Thread.sleep(1000);
	
		   
	}
	public void invalidloginverify()
	{
		System.out.println(helper.geturl());
	}
	public void close() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
		
	}
	
	public void takeSCreenshot(String result) throws IOException, InterruptedException
	{
		log.enterInfoLog("taking screenshot");
		Thread.sleep(1000);
	
	
	  File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(src, new File("D:\\MIndtreeassign\\NoBrokersBdd\\screenshots\\"+result+".png"));
	}
	public void HyderabadflatsBuy() throws IOException, InterruptedException
	{
		//test = report.createTest("Hyderabad flats");
		log.enterInfoLog("clicking on buy");
		helper.click(Buyui.Buyradio);
		log.enterInfoLog("selecting the location dropdown");
		// System.out.println("location select");
		helper.click(Buyui.locationdropdown);
		// System.out.println("selecting location");
		log.enterInfoLog("selecting the location");
		helper.keydown(5);
		helper.Enterkey();
		log.enterInfoLog("clicking on apartment type dropdown");
		helper.click(Buyui.ApartmentTypedropdown);
		log.enterInfoLog("selecting the apartment types");
		helper.keydown(2);
		helper.Enterkey();
		helper.keydown(1);
		helper.Enterkey();
		log.enterInfoLog("clicking on propertystatus type dropdown");
		helper.click(Buyui.propertStatusdropdown);
		helper.keydown(1);
		helper.Enterkey();
		log.enterInfoLog("clicking on search");
		helper.click(Buyui.SearchBox);
		log.enterInfoLog("sending the  information");
		helper.sendText(Buyui.SearchBox, data.gethydloaction());
		Thread.sleep(1000);
		helper.keydown(1);
		helper.Enterkey();
		Thread.sleep(1000);

		log.enterInfoLog("clicking on search");
		helper.click(Buyui.Searchicon);
		
	}
	public void BangloreflatsBuy() throws IOException, InterruptedException
	{
		log.enterInfoLog("clicking on buy");
		helper.click(Buyui.Buyradio);
		log.enterInfoLog("selecting the location dropdown");
		// System.out.println("location select");
		helper.click(Buyui.locationdropdown);
		// System.out.println("selecting location");
		log.enterInfoLog("selecting the banglore location");
		helper.keydown(1);
		helper.Enterkey();
	}
	public void Bangloreflats() throws IOException, InterruptedException
	{
		test = report.createTest("Banglore flats");
		log.enterInfoLog("clicking on apartment type dropdown");
		helper.click(Buyui.ApartmentTypedropdown);
		log.enterInfoLog("selecting the apartment types 2BHk 3BHK");
		helper.keydown(2);
		helper.Enterkey();
		helper.keydown(1);
		helper.Enterkey();
		log.enterInfoLog("clicking on propertystatus type dropdown and selecting under construction");
		helper.click(Buyui.propertStatusdropdown);
		helper.keydown(2);
		helper.Enterkey();
		log.enterInfoLog("clicking on search");
		helper.click(Buyui.SearchBox);
		log.enterInfoLog("sending the information");
		helper.sendText(Buyui.SearchBox, data.getbangloaction());
		Thread.sleep(1000);
		helper.keydown(2);
		helper.Enterkey();
		Thread.sleep(1000);

		log.enterInfoLog("clicking on search");
		helper.click(Buyui.Searchicon);
		
		
	}


	public void flushing()
	{
		report.flush();
	}

}
