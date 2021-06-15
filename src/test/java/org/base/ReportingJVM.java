package org.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportingJVM {
	public static void generateJVMReport(String json) {
		File file=new File("C:\\Users\\Administrator\\eclipse-workspace\\karthika\\SampleCucumber\\target");
		Configuration configuration=new Configuration(file, "Sample Facebook Project");
		configuration.addClassifications("Browser Name", "Chrome Browser");
		configuration.addClassifications("Platform", "win-10");
		configuration.addClassifications("Environment", "QA");
		configuration.addClassifications("Sprint No", "12");
		List<String> li=new ArrayList<String>();
		li.add(json);
		ReportBuilder builder=new ReportBuilder(li, configuration);
		builder.generateReports();
		

	}

}
