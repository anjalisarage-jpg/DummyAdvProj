package GenericUtility;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesFileUtility {
	
	public String toReadDtaFromProp(String key) throws Throwable
	{
		FileInputStream fis= new FileInputStream("./src/test/resources/Commondata.properties");
		Properties prop= new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;
	}

}
