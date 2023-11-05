package ExcelUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ObjectRepositorys {
	
	Properties properties;
	FileInputStream fis;
	String filePath ="./ExternalFiles/Object.properties";
	
	public ObjectRepositorys(){
		
		try {
			fis = new FileInputStream(filePath);
			if(fis==null) {
				throw new IllegalStateException("Url not found");
			}
			properties = new Properties();
			try {
				properties.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		
	}
	
	public String getUrl() {
		String amazonURL = properties.getProperty("Url");
		System.out.println("Url is.." + amazonURL);
		return amazonURL;
	}
	

}
