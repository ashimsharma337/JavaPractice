import java.util.concurrent.ExecutionException;
import java.util.zip.DataFormatException;

public class MultiCatch {

	public static void main(String[] args) {
		try {
			process();
			
		}catch(Exception e) {} // can-not do this // specialized first -> more generalized  
		 catch(ExecutionException e) {}
		 catch(DataFormatException e) {}
		
		// java 7 multi-catch 
		// catch(ExecutionException | DataFormatException e) {
			// same code
		// }
	}
	
	static void process() throws DataFormatException, ExecutionException{
		
	}

}