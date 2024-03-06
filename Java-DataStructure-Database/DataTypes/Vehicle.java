

class Vehicle { // class body
	
    int speed = 200000000; // variable
	byte wheel = 4; // wheels are not high in number
	short weight = 2000; // it will not go over 32,000 pound
	char fuel = 'D'; // D for desiel, P for petrol
	boolean running = false; // whether or not vehicle is running
	long serial = 3432242342341114L;
	double fuelRemaining = 100.122234234d; // double is more precise
	float fuel1 = 100.383838383f; // less precise 
	
	
	String make = "Toyota";
	
	Vehicle toy;
	
	
	
	void accelerate() { //method body
		
	}

	Vehicle() { // constructor, it is used to initialize state of the variable
		speed = 0;
	}
    
    public static void main(String[] args) {
        Vehicle obj = new Vehicle();
        float result = obj.fuel1;
        System.out.println(result);
    
    }

}






