package util;

import java.io.File;
import java.nio.file.Files;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TestUtil {

	public static void captureScreenshot(WebDriver driver, String screenshortName)
	
	{
		
try {
	TakesScreenshot ts = (TakesScreenshot)driver;
			
			File source = ts.getScreenshotAs(OutputType.FILE);
					
					Files.copy(source.toPath(),  new File("./Screenshots/"+ screenshortName+".png").toPath());
					
					System.out.println("Screenshot taken");
					
} catch (Exception e) {
	
	System.out.println("Exception while taking screenshot");
	
} 
}

	}
		
		
		
	


