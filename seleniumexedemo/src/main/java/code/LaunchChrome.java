package code;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class LaunchChrome {
	

	public static void main(String[] args) throws IOException, InterruptedException
	{
		File file = new File(System.getProperty("user.dir") + "\\"
				+ PropertiesFile.getProperty("driverpath") + "\\" + PropertiesFile.getProperty("driverfile"));
		System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://google.com");
		Thread.sleep(5000);
		driver.quit();
		
	}
	
	
	

}
