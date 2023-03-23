import java.util.ArrayList;

/* ArrayList 
 * - class in the collections API Java
 * - Creates an array and provides methods for working with it 
 *           - Default size is 16
 * - The size of the array is mutable!
 * - It grows 50 % larger to accomodate more elements
 * - Allows duplicate elements
 * - Order of insertion is preserved as with any other List
 */

 public class ArrayA {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(2);
		list.add("ABC");
		list.add("DEF");
		list.add("GHJ");
		list.add("YZX");
		
		// access
		System.out.println(list.get(2));
		list.remove(3);
		list.size();
		
		// Printing
		System.out.println(list);
		
		for(String item : list) {
			System.out.println(item);
		}

	}

}