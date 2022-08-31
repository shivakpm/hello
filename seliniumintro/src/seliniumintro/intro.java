package seliniumintro;

import org.openqa.selenium.chrome.ChromeDriver;

public class intro {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\B R Shivakumaran\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("http://www.facebook.com");
	}
}
