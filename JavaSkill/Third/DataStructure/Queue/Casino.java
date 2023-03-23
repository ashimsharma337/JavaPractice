import java.util.Stack;

/*
 * Stack 
 * - A Deque is a double-ended-queue. It is linear collection of elements that support insertion, removal
 *   and examination of elements at both end points. The Deque interface imlements both stack and queues at the same time
 *                  First-in/Last-out(FILO) stacks
 * 
 * - class in the collections API in Java
 * - First-in/Last-out
 * - Push to the tail 
 * - Pop from the tail 
 * - Allows duplicate elements 
 * - Order of insertion is preserved 
 *         e.g Stack of plates, deck of a cards 
 */

public class Casino {

	public static void main(String[] args) {
		Stack<Card> stack = new Stack<Card>();
		stack.push(new Card("A of Spades"));
		stack.push(new Card("K of Diamonds")); 
		stack.push(new Card("Q of Hearts"));
		
		System.out.println(stack.pop().value);  // Prints queen of Hearts, and it is removed
		System.out.println(stack.peek().value); // Checks what's at the head, and does not remove
		System.out.println(stack.pop().value);  // K of diamonds is removed 
		

	}

}

class Card {
	String value;
	public Card(String value) {
		this.value = value;
	}
} 