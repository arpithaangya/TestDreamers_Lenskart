package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class RegisterUtility {
	public String url;
	public String firstName;
	public String lastName;
	public String mobile;
	public String email;
	public String password;
	
	public RegisterUtility(){
		registerData();
	}
	
	public void registerData() {
		File file = new File("C:\\Users\\dmulinti\\TestDreamers_Lenskart\\src\\test\\resources\\registerData.properties");
		
		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
		} catch(FileNotFoundException e){
			e.printStackTrace();
		}
		Properties prop = new Properties();
		
		try {
			prop.load(fileInput);
		}catch(IOException e){
			e.printStackTrace();
		}
		url = prop.getProperty("url");
		firstName = prop.getProperty("firstName");
		lastName = prop.getProperty("lastName");
		mobile = prop.getProperty("mobile");
		email = prop.getProperty("email");
		password = prop.getProperty("password");
	}
}
