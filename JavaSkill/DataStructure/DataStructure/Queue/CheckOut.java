import java.util.LinkedList;
import java.util.Queue;

/*
 * Queue 
 * A Queue is a collection for holding elements prior to processing.
 * Queues provide basic collection operations, additional insertion, removal, and inspection operations
 * It focuses on first-in/first-out(FIFO)
 * 
 * Interface in the collections API in java 
 * - First-in/First-out 
 * - Push to the tail 
 * - Pop from the head 
 * - Allows duplicate elements 
 * - Order of insertion is preserved 
 * 
 *  NOTE: LinkedList implements Queue 
 */

public class CheckOut {

	public static void main(String[] args) {
		Queue<Person> queue = new LinkedList<Person>();
		//Queue<Person> queue = new PriorityQueue<Person>(); // if something has more priority
		                                                     // need to go to the front of the line
		// add new Person to tail "push"
        queue.offer(new Person());
        
        // check what's at the head of the queue 
        queue.peek();
        
        // 'pop' the head of the queue 
        System.out.println(queue.poll());
	}

}

class Person {}