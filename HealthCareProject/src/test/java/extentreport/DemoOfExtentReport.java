package extentreport;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class DemoOfExtentReport {
	@Test

	public void report1() {
		ExtentHtmlReporter reporter=new ExtentHtmlReporter("./Reports/demo.html");
		ExtentReports report=new ExtentReports();	
		report.attachReporter(reporter);
		ExtentTest logger=report.createTest("report");
		logger.log(Status.PASS,"my test is passsed");
		logger.log(Status.FAIL,"my test is failed");

		report.flush();


	}
}
