package utils;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class ReadConfigurationProperty {
	public static String browserName() throws IOException {
		File file = new File("./src/main/resources/configuration/configuration.properties");
		FileInputStream fileIS = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fileIS);

		return prop.getProperty("browserName");
	}

	public static String baseURL() throws IOException {
		File file = new File("./src/main/resources/configuration/configuration.properties");
		FileInputStream fileIO = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fileIO);

		return prop.getProperty("baseURL");
	}

}
