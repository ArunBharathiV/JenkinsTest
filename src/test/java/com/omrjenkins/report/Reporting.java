package com.omrjenkins.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting {
	
public static void generateJvmReport(String jsonFile) {
		
		File file = new File("C:\\Users\\anith\\Desktop\\JenkFolder\\JenkinsTest\\target");
		
		Configuration config = new Configuration(file, "Jenkins test Proj");
		
		config.addClassifications("Browser Name", "Chrome");
		config.addClassifications("Browser Version", "126");
		config.addClassifications("OS", "Win 11");
		config.addClassifications("Sprint", "35");
		
		List<String> jsonFileList = new ArrayList<>();
		jsonFileList.add(jsonFile);
		ReportBuilder builder = new ReportBuilder(jsonFileList, config);
		builder.generateReports();
	}
}