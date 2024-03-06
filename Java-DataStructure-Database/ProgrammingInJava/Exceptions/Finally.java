import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Finally {

	public static void main(String[] args) {
		FileInputStream f = null;
		try {
			f = new FileInputStream("demo.txt");
			System.out.println((char) f.read());
		}catch(FileNotFoundException e) {
			System.out.println("FileNotFoundException");
		}catch(IOException e) {}
        finally {
        	System.out.println("Finally");
        	// To-Do: try-with resource statement 
        	if(f != null) {
        		try {
        			f.close();
        		}catch(IOException e) {}
        	}
        }
	}

}