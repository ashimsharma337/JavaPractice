import java.util.LinkedList;
/*
 * class in the collections API in java 
 * - Linear series of Nodes 
 *          - Node wraps up a value (String, Pizza e.t.c)
 * - "Linked" by a reference to the next node 
 * - LinkedList is "doubly-linked"
 *              - Nodes have a previous and next refrence 
 * - Allow duplicate elements 
 * - Order of insertion is preserved
 * NOTE: shifting does not occur, random access is slow, mutation operation is fast 
 */



public class ArrayB {

	public static void main(String[] args) {
		LinkedList<Pickle> list = new LinkedList<Pickle>();
		list.add(new Pickle("Dill"));
		list.add(new Pickle("Sweet"));
		
		list.get(1);          // random access is slow 
		list.remove();        // mutation operation is fast
        
		
	}

}

class Pickle{
	String flavor;
	public Pickle(String flavor) {
		this.flavor = flavor;
	}
}
