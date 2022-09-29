package GenericUtilities;



	import java.io.File;
	import java.io.IOException;
	import java.time.LocalDateTime;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;

	public class ScreenshotUtility {
	public void takingScreenshot(WebDriver driver, String screenshotName ) throws IOException {
		TakesScreenshot screenshot=(TakesScreenshot) driver;
		File photo = screenshot.getScreenshotAs(OutputType.FILE);
		String time = LocalDateTime.now().toString();
		String date = time.replace(':', '-');
		System.out.println(date);
		File file=new File("./errorshots/"+screenshotName+""+date+".png");
		FileUtils.copyFile(photo, file);
	}
	}


