

public class Override {

	public static void main(String[] args) {
        // Poppable obj = new Balloon();
		Poppable obj = new Bubble();
		obj.pop();

	}

}

class Poppable {
	public void pop() {
		System.out.println("Pop");
	}
}

class Balloon extends Poppable {
	public void pop() {
		System.out.println("Pop!");
	}
	
	//method overloading
	public void pop(int x) {}
}

class Bubble extends Poppable {
	public void pop() {
		System.out.println("p");
	}
}