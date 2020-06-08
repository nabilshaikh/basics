package Selenium.practise;

import java.io.File;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		File file = new File(System.getProperty("user.dir") + "\\"
				+ PropertiesFile.getProperty("driverpath") + "\\" + PropertiesFile.getProperty("driverfile"));
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
    }

    public static void screenShot(ChromeDriver driver) throws IOException, InterruptedException {
        File scr=(driver).getScreenshotAs(OutputType.FILE);
        File dest= new File("filPath/screenshot_"+timestamp()+".png");
        FileUtils.copyFile(scr, dest);
        Thread.sleep(3000);
    }

    public static String timestamp() {
        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
    }


}
