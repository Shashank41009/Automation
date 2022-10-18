package assignmentClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class NotePad {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("./data/text.property.txt");
		Properties p = new Properties();
		p.load(fis);
		String url = p.getProperty("url");
		String usn = p.getProperty("username");
		String password = p.getProperty("password");
		System.out.println(url);
		System.out.println(usn);
		
		System.out.println(password);
		
		
		
		
	}

}
