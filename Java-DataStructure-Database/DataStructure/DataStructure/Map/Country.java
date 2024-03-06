import java.util.HashMap;

public class Country {

	public static void main(String[] args) {
		// High performance to search value based on key 
		       // key    value
		HashMap<String, Citizen> citizens = new HashMap<String, Citizen>();
		citizens.put("5001", new Citizen("Brian"));
		citizens.put("4524", new Citizen("Diane"));
		citizens.put("5001", new Citizen("Dan"));
		
		// get the value of particular key
		System.out.println(citizens.get("5001").name);
		
		// get the size of map
		System.out.println(citizens.size());
		
		// to search key and values 
		System.out.println(citizens.containsKey("5001")); // true 
		System.out.println(citizens.containsValue(new Citizen("Brian"))); // false because brain is overwritten
		
		// to loop over
		System.out.println(citizens.entrySet()); // returns key and value 
		System.out.println(citizens.keySet());   // returns key 
		System.out.println(citizens.values());   // returns value 
		

	}

}

class Citizen{
	String name;
	Citizen(String name){
		this.name = name;
	}
}