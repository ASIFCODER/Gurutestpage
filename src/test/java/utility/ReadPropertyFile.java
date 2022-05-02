package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {
	Properties pro;

	public ReadPropertyFile() {
		File src = new File("./ConfiqureFiles\\data.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
	}

	public String getUrl() {
		String url = pro.getProperty("url");
		return url;
	}

	public String getUserName() {
		String username = pro.getProperty("username");
		return username;
	}

	public String getPassWord() {
		String password = pro.getProperty("Password");
		return password;

	}

}
