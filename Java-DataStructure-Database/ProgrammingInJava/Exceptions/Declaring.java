import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Declaring {

	public static void main(String[] args) {
		read(); // handle somewhere else 
	}
	
	// declaring the exception 
	static void read() throws FileNotFoundException{
		FileInputStream file = new FileInputStream("file.txt");
	}

}
