package com.reports;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;



public class Reporting {
	public static void generateJVMReport(String jsonFile) {
		//1. Mention the path of jvmreport where to store?
		File file = new File ("C:\\Users\\ajith\\eclipse-workspace\\OMRBranchAdactinHotelAutomation\\target");
		
		//2. Create the Object for configuration class
		Configuration configuration = new Configuration(file, "OMRBranchAdactinHotelAutomation");
		
		//3. Mention the os, browser type and version
		configuration.addClassifications("OS", "WIN8");
		configuration.addClassifications("BrowserType", "Chrome");
		configuration.addClassifications("Version", "IOS");
		configuration.addClassifications("Sprint", "34");
		
		//4. Pass the json file to fetch results from json report file
		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(jsonFile);
		ReportBuilder builder = new ReportBuilder(jsonFiles, configuration);
		
		//5. Build the JVm Report
		builder.generateReports();
	}
	

}
