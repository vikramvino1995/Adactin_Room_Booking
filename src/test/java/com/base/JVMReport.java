package com.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;



public class JVMReport {
	
	public static void generateJVMReport(String jsonFile) {
		
		File reportDirectory = new File(System.getProperty("user.dir")+"\\target\\Reports");
		
		Configuration configuration = new Configuration(reportDirectory,"Project_Adactin");
		
		configuration.addClassifications("OS","Windows");
		configuration.addClassifications("Browser","Chrome");
		configuration.addClassifications("Version","89");
		configuration.addClassifications("Sprint","32");
	
		List<String> jsonFiles = new ArrayList<>();
		
		jsonFiles.add(jsonFile);
		
		ReportBuilder reportBuilder = new ReportBuilder(jsonFiles,configuration);
		
		reportBuilder.generateReports();
		
	}
}
