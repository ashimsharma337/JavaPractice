// Lambda expression is, essentially, an anonymous or unnamed method. 
// The lambda expression does not execute on its own. 
// Instead, it is used to implement a method defined by a functional interface.
// Lambda expression only works with functional expression
// because they must contain only one method
// If multiple methods were allowed in the interface, there will be confusion
// which method should a lambda pick if the argument lists are the same

@FunctionalInterface
interface add {
    int add1(int a, int b);
    // int sub1(int a, int b) // not allowed not a functional expression
}                             // lambda will be confused which method to pick

public class Lambda {
    
    public static void main(String[] args) {
        
        add obj = (a, b) -> a+b;

        int result = obj.add1(5, 4);
        System.out.println(result);
    }
}
