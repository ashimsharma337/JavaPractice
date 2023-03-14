

public class Interface {
    public static void main(String[] args) {
		Drawable a = new Drawable();    // Interface can-not be instantiated

	}
}

interface Drawable {
	// public abstract void draw();       // All the methods in interface are public abstract
	void draw();
}

interface Colorable extends Drawable {    // Interface can extends another interface
	void color();
}

class Rectangle implements Drawable, Runnable {  // classes can implements as many interface seprated with comma
	public void draw() {}
	public void run() {}
}

class Circle implements Colorable {
	public void color() {}
	public void draw() {}
}

