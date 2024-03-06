

public class Shadow {
    public static void main(String[] args) {
		Child child = new Child();
		int returned = child.getX();
		System.out.println(returned); // Prints 5
	}
}

class Parent {
	int x = 10;
}

class Child extends Parent {
	int x = 5;
	
	public void setX(int x) {
		this.x = x;          // taking parameter x and assigning to instance variable x
	}
	
	public int getX() {
		return x;          // return 5, variable of current  class 
		// return super.x; // return 10, parent x
		// return this.x;  // return 5, instance variable of current class
	}
}
