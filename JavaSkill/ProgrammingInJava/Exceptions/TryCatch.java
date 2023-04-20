import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatch {
    
	static FileInputStream file;
	
	public static void main(String[] args) {
		try {  
			file = new FileInputStream("file.txt");
		} catch(FileNotFoundException e) { // we can use Exception e, but its not good practice
			// recovery procedures 
			// create file.. then opens it 
			// log exception 
		}
	}

}

