

public class Abstraction {
    
    public static void main(String[] args) {
		Shape shape = new Shape();   // can-not instantiate because it's abstract class

	}

}

abstract class Shape {
	int var;          // We can define variable in abstract class too 
	abstract double area(); 
}

class Traingle extends Shape {
	double area () {
		return 0;
	}
}

class Square extends Shape {
	double area() {
		return 10;
	}
}
