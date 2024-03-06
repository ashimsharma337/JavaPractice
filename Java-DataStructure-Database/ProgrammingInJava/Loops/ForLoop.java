// for loop in a java is a counter control loop
// which is useful for doing something certain number of time

public class ForLoop {

	public static void main(String[] args) {
		loop(10);

	}
	
	static void loop(int max) {
		// counter variable; condition; increment 
		for(int i = 0; i < max; i++) {
			System.out.print(i);
		}
	}

}
