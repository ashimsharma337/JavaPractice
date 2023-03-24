import java.util.HashSet;
import java.util.Objects;

public class Party {

	public static void main(String[] args) {
		HashSet<Friend> friends = new HashSet<Friend>();
		friends.add(new Friend("Dan", 24));
		friends.add(new Friend("Dana", 41));
		// By default hashCode/equals same memory location so need equal and hashcode
		friends.add(new Friend("Dan", 24));  // Duplicate is not allowed but needs hash code and equal method
		System.out.println(friends);
		
		// method inside hashSet are boring, add, contains, isEmpty e.t.c 
		
		// mostly for loop is used in HashSet doing something with that hashSet
		for(Friend f : friends) {
			// do something with all friends 
		}
		

	}

}

class Friend{
	String name;
	int age;
	Friend(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	
	public int hashCode() {
		return Objects.hash(age, name);
	}

	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Friend other = (Friend) obj;
		return age == other.age && Objects.equals(name, other.name);
	}

	public String toString() {
		return name + " " + age;
	}
}