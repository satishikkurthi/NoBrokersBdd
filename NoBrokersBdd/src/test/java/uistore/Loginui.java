package uistore;

import org.openqa.selenium.By;

public class Loginui {
	
public static By loginbutton = By.xpath("//*[@id=\"navHeader\"]/div[5]/div[2]/div[2]/div");
public static By phonenumberfield=By.xpath("//input[@id='signUp-phoneNumber']");
public static By radiopassword = By.xpath("//input[@id='login-signup-form-login-radio-password']");   
public static By passwordfield=By.xpath("//input[@id='login-signup-form__password-input']");
public static By sigin =By.xpath("//*[@id=\"signUpSubmit\"]");
public static By symbolsign = By.xpath("//*[@id=\"navHeader\"]/div[5]/div[3]/div[1]/div/span");
public static By incorrectpasswordresponse=By.xpath("//*[@id=\"login-signup-form\"]/div[4]/div/div/span[2]");

	

}
