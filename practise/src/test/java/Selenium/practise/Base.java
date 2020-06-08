package Selenium.practise;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public static WebDriver driver;
	
	public static void initialization() throws IOException {
		
		File file = new File(System.getProperty("user.dir") + "\\"
				+ PropertiesFile.getProperty("driverpath") + "\\" + PropertiesFile.getProperty("driverfile"));
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	
	public void failed(String testMethodName) throws IOException {
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("C:/Users/NABIL/Workspace/Java/practise/Screenshots"+"\\" 
				  +testMethodName + "_" + timeStamp() +".jpg"));
		//new File("C:/Users/NABIL/Workspace/Java/practise/Screenshots" + this.getClass().getName() +"_"+testMethodName +".jpg")
	}
	
	public String timeStamp() {
        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
       // return new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss ").format(new Date());
}

}
