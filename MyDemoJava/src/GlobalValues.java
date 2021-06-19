import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValues {
	
	
	public static void main(String[] args) throws IOException {
		
		Properties prop= new Properties();
		FileInputStream fis = new FileInputStream("//Users//sr20015260//eclipse-workspaceNew//MyDemoJava//data.properties");
		prop.load(fis);
	    System.out.println(prop.getProperty("browser"));
		prop.setProperty("browser", "Chrome");
	    //write back to file
	    
	    FileOutputStream  fos = new FileOutputStream("//Users//sr20015260//eclipse-workspaceNew//MyDemoJava//data.properties");
prop.store(fos, null);
	    
	    
}
	
}
