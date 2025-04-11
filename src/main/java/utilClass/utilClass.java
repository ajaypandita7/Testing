package utilClass;

import java.io.FileInputStream;
import java.util.Properties;

public class utilClass {

	public static String util(String key) throws Exception{
		
		Properties pro=new Properties();
		FileInputStream file=new FileInputStream("./src/test/resources/proparties/flipkart.properties");
		pro.load(file);
		String data = pro.getProperty(key);
		
		return data ;
	}
}
