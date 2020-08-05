package javaconcept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalData {

	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\THI1901459\\eclipse-workspace\\javaconcept\\src\\data.properties");
		prop.load(fis);                                    //load method will load that file in reading mode
		System.out.println(prop.getProperty("browser"));  //with getproperty method u can call the value frm property file= browser
		System.out.println(prop.getProperty("url"));     //with getproperty method u can call the value frm property file= url
		//to read the data from file we use FileInputStream
		//above 2 steps to get the value frm property file		
		prop.setProperty("browser", "firefox");        //this is to set or modify the property value frm chrome to firefox
		System.out.println(prop.getProperty("browser"));
		//to write back to file we have to use FileOutPutStream
		//below step will store or update the values in your property files  if u mand any update in the code
		//FileOutputStream fos = new FileOutputStream("C:\\Users\\THI1901459\\eclipse-workspace\\javaconcept\\src\\data.properties");
		//prop.store(fos, null);
	}

}
