// Logical or conditional operator lets us put multiple boolean expression into single expression
public class Logical {

	public static void main(String[] args) {
		boolean holiday = false;
		boolean weekend = true;
		boolean work = false;
		
		// both condition has to be true 
		// if(holiday | weekend & !work) {    // pipe symbol "|" (OR operator)
			System.out.println("Day off");    // & (AND operator)
		// }                                  // ! Negation operator gives inverse value 
			
		// short-circuit
		if(holiday || weekend && !work) {     // if holiday is true it doesn't check other
			                                  
		}
		
		int x = 10;
		if(x > 10 || x < 0) {
			
		}

	}

}
