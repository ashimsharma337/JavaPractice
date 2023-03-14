

public class Farmer {

    public static void main(String[] args) {
		Pickle pickle = new Pickle();
		pickle.grow();

	}

}

class Cucumber {
	double calories;
	
	public void grow() {}
}
	
class Pickle extends Cucumber { // can-not extends salad because multiple inheritance is not allowed
	public Pickle() {
		calories = calories * 0.70;
	}
}

class salad{}
    

