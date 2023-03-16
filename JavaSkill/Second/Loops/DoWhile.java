// do while loop always has a chance to executes once then check the condition
public class DoWhile {

	public static void main(String[] args) {
		loop(false);

	}
	
	static void loop(boolean running) {
		do {
			System.out.println("Running");
		} while(running);
	}

}
