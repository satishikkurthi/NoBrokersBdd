package uistore;

import org.openqa.selenium.By;

public class Homepage {
	
	public static By menu = By.xpath("//*[@id=\"main-menu\"]/div[1]");
	public static By painters = By.xpath("//*[@id=\"main-menu\"]/div[2]/a[3]");
	public static By rental = By.linkText("Rental Agreement");
	public static By location = By.xpath("//*[@id=\"appPortal\"]/div/div[2]/div/div/div/div[2]/div[1]");
    public static By refer = By.linkText("Refer & Earn");
    public static By owner = By.linkText("Owner Plans");
    public static By Buyer = By.linkText("Buyer Plans");
    
    
}
