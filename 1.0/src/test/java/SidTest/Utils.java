package SidTest;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Utils {
	
public static String getData(String a) {
		
		Properties prop = new Properties();


        FileInputStream fis = null;
		try {
			
			String userpath=System.getProperty("user.dir");
			
			String proppath=userpath+"/src/test/java/SidTest/data.json";
			
			fis = new FileInputStream(proppath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

        try {
			prop.load(fis);
			return prop.getProperty(a);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
        
	}

public static void main(String[] args) {
	
	String userpath=System.getProperty("user.dir");
	
	System.out.println(userpath);
	
	String proppath=userpath+"/src/test/java/SidTest/data.json";
	
	System.out.println(proppath);
}

}
