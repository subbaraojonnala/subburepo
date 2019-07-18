package config;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFile {


	
	
	public static  Properties readPropertiesFile() {
		

		Properties prop = new Properties();
		try {
			
			InputStream input = new FileInputStream("C:\\Users\\kul_subbarao\\eclipse-workspace\\PhoenixAutomation\\src\\main\\java\\config\\config.properties");
		
			
			prop.load(input);

			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return prop;
		
	}

}
