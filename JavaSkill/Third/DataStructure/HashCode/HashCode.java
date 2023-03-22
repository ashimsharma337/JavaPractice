


public class HashCode {
    
    public static void main(String[] args) {
		Pizza1 one = new Pizza1();
		one.size = 14;
		one.topping = "Pepperoni";    // sometimes hashCode may be same for two object try "Ea" and "FB"
		Pizza1 two = new Pizza1();
		two.size = 14;
		two.topping = "Cheese";
		System.out.println(one.hashCode()); 
        System.out.println(two.hashCode());
	}

}

class Pizza1 {
	int size = 0;                        
	String topping = null;  
    public int hashCode()  {   // We can generate hashCode from IDE as well
    	if(topping != null) {
        // return size;        // depending on the size pizza will store on that bucket e.g 12" one bucket, 14" one bucket
        return size * topping.hashCode();   // to create unique the closer we get more unique 
    	} else {
    		return size;
    	}
    }        
	public boolean equals(Object o) {   
		Pizza1 other = (Pizza1) o;
		if(this.size == other.size) {
			if(this.topping.equals(other.topping)) {
				return true;
			}
		}
		return false;
	}
}
