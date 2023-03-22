
public class Equals {

	public static void main(String[] args) {
		Pizza one = new Pizza();
		Pizza two = new Pizza();
		// System.out.println(one == two); bad practice
        System.out.println(one.equals(two));
	}

}


class Pizza {
	int size = 0;
	String topping = "bacon";           // if null object method does not work 
	public boolean equals(Object o) {   // overriding equals method 
		Pizza other = (Pizza) o;
		if(this.size == other.size) {
			if(this.topping.equals(other.topping)) {
				return true;
			}
		}
		return false;
	}
}