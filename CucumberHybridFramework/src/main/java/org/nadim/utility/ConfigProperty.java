package org.nadim.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigProperty {

	private Properties pro;

	/*
	 * public static void main(String[] args) throws IOException { Properties data =
	 * getData(); System.out.println(data.getProperty("browser-name")); }
	 */
	public Properties getData() throws IOException {
		pro = new Properties();
		File file = new File(
				System.getProperty("user.dir") + "\\src\\test\\resources\\configuration\\config.properties");
		FileInputStream fis = new FileInputStream(file);
		pro.load(fis);
		return pro;
	}
}
