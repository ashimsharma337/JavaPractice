import java.io.FileInputStream;

public class Risky {
       
	public static void main(String[] args) {
		
		// Runtime Exception or Unchecked Exception
		
		// int x = 5/0;           // ArithmeticException
		// Object obj = null;      
		// obj.toString();        // NullPointerException 
		int[] arr = new int[5];
		arr[100] = 10;            // IndexOutOfBoundsException 
		
		
		// Checked Exception // FileNotFoundException
		FileInputStream file = new FileInputStream("file.txt");
		
	}
}