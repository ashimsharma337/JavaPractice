// Method declaration                                                             Combining two(Method signature)
//    access moifier       return type(void doesn't reuturn any value)            method name (Parameter list)
//    public               void                                                   go(int x,, String y) {}

// Method invocation

// refrences variable, and argument list
// object.go(10, "A");

// public void go() {}                     - object.go();
// public void go(int speed) {}            - object.go(100);  (method with same name method overloading) 
// public void go(int x, String y) {}      - object.go(10, 'A');
// public void go(String y, int x) {}      - object.go("A", 10);

// Static Method are called without an object
   // e.g Math.random();
   //     Math.pow(2, 31);
   //     Math.tan(90)
   // Static method are declare with the static modifier

// Methods with non-void return type must declare a return statement
//    public int go(){
//     return 5;
//    }
// code will not compile without a return statement
public class Method {
    
    public static void main(String[] args) {
		Method example = new Method();
		int returned = example.go();
		
		
		// Static Method
		int value = Method.go(5);
		
		System.out.println(returned + " : " + value);

	}
    
	public int go() {
		return 11;
	}
	
	// Static method
	public static int go(int x) {
		return x;
	}
}
