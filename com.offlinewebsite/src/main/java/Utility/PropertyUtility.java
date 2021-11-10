package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtility {
	//1.Why we need utility----->read property file
		//2.what is input----------->Key 
		//3.what will be output----->Value
		
		public String readProperty(String key) {
			Properties prop=new Properties();
			FileInputStream fis;
			try {
				fis = new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/config.properties");
				prop.load(fis);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
			 catch (IOException e) {
				
				e.printStackTrace();
			}
			return prop.getProperty(key);
		}

}
