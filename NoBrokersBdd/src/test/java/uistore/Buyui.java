package uistore;

import org.openqa.selenium.By;

public class Buyui {
	
	public static  By Buyradio = By.xpath("//*[@id=\"app\"]/div/div/div[1]/div[3]/div[1]");
	public static  By locationdropdown = By.xpath("//div[@class='css-1hwfws3 nb-select__value-container nb-select__value-container--has-value']");
	public static By ApartmentTypedropdown = By.xpath("//div[@class='css-1hwfws3 nb-select__value-container nb-select__value-container--is-multi']");
	public static By propertStatusdropdown = By.xpath("//div[@class='css-151xaom-placeholder nb-select__placeholder']");
    public static By SearchBox = By.xpath("//input[@id='listPageSearchLocality']");
    public static By Searchicon=By.xpath("//button[@class='prop-search-button btn btn-primary btn-lg']");
    public static By verify =By.xpath("//*[@id=\"propertyCardConatiner\"]/div[1]/h1");
}
