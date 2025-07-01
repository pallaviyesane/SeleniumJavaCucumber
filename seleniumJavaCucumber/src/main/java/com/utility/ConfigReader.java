package com.utility;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

public class ConfigReader {

	private Properties properties;
	private final String propertyFilePath = "C:\\Users\\SUHAS\\Documents\\SeleniumJavaCucumber\\seleniumJavaCucumber\\src\\main\\java\\com\\utility\\testData.properties";
	//private final String propertyFilePath = ".\\com\\utility\\testData.properties";

	public ConfigReader() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("testData.properties not found at " + propertyFilePath);
		}
	}

	public String getBrowser() {
		return properties.getProperty("browser");
	}

	public String getUrl() {
		return properties.getProperty("url");
	}
	
	public String getUrlAfterLogin() {
		return properties.getProperty("urlAfterLogin");
	}
}
