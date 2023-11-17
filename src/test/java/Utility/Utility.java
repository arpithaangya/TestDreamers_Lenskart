package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utility {
		
	

public String strUrl;
public String stremail;

	public Utility() {
		login2();
	}
	public void login2(){
		File file = new File("C:\\Users\\ashekharangya\\Git Lenskart\\TestDreamers_Lenskart\\src\\test\\resources\\LoginData.properties");
		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties prop = new Properties();
		try {
			prop.load(fileInput);
		}catch(IOException e) {
			e.printStackTrace();
		}

		strUrl = prop.getProperty("url");
		stremail = prop.getProperty("email");


}


}
