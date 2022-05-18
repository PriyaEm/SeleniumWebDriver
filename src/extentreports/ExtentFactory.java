package extentreports;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentFactory {
	public static ExtentReports getInstance() {
		ExtentReports extent;
		String path = "C:\\Users\\priya\\Desktop\\report-demo";
		extent = new ExtentReports(path, false);
		return extent;	
//		extent.addSystemInfo("Seleniu Verison", "4.0");
//		.addSystemInfo("platform", "Windows");
	}

}
