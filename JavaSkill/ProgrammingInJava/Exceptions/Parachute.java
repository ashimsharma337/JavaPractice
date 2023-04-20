

public class Parachute {

	public static void main(String[] args) {
		pull();

	}
	
	static void pull() throws DeploymentException{ // throws tell that this method has potential of throwing exception
		if(Math.random() < 0.001) {
			throw new DeploymentException();       // throw key word is used to create exception object and stop execution 
		}
	}

}


// custom exception          
class DeploymentException extends RuntimeException {} //adding Runtime and changing it to unchecked exception
