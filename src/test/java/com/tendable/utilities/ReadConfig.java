package com.tendable.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

		//similar to pageobject
		Properties pro;
		public ReadConfig() {
			File src =new File("./configration/config.properties");
			
			try {
				FileInputStream fis= new FileInputStream(src); //used when we want to read data
				//src represent the property file
				pro=new Properties();
				pro.load(fis); //load complete file
				
			}catch(Exception e) {
				System.out.println("Exception is "+e.getMessage());
			}
		}
		
		public String getApplicationURL() {
			String url=pro.getProperty("baseURL");
			return url;
		}
}
