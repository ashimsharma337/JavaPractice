public class Enhanced {
    
    public static void main(String[] args) {
		loop(new int[] {1,2,3,4,5});

	}
	
	static void loop(int [] array) {
		for(int i : array) {
			System.out.print(i); // for each element this operation is performed
		}
	}
}
