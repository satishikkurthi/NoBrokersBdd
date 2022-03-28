package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Readprops {
	
	
	FileInputStream file ;
	Properties property;
	
	public void load() throws IOException
	{
		file = new FileInputStream("D:\\MIndtreeassign\\NoBrokerHybrid\\testdata\\config.properties");
	    property = new Properties();
	    property.load(file);
		
	}
	public String getDriverName() throws IOException
	{
		load();
	    String drivername=property.getProperty("driver");
	    return drivername;
	}
	public String geturl() throws IOException
	{
		
	    String url =property.getProperty("url");
	    return url;
		
	}


}
