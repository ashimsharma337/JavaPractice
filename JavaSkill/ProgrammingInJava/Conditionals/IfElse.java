
public class IfElse {

	public static void main(String[] args) {
		branch(false);

	}
	
	static void branch(boolean cond) {
		if(cond) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

}
