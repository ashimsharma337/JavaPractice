// Arrays

// Stores multiple values in a single reference variables
// Stores in a Continuous (Sequential block of memory)
// Access elements by index


public class Arrays {
    
    public static void main(String[] args) {
		
		//define the size
		int[] array = new int[6];
		array[0] = 155;
		array[5] = 77;
		System.out.println(array[5]);
		// array[6] = 10; // cause ArrayIndexOutOfBoundsException
		
		// Array Initializer
		String[] words = {"abc", "def", "jkl"};
		words[0] = "dee";
		
		System.out.println(words[2]);
		

	}

}
