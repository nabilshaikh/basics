package Selenium.practise;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListener.class)
public class ScreenshotTest extends  Base{
	
	@BeforeMethod
	public void setUp() throws IOException {
		initialization();		
	}
	
	@Test
	public void takeScreenshotTest() {
		Assert.assertEquals(true, false);		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
