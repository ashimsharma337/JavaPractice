
// from java 8 it is no more verbose(more code than needed). 
// with the help of java 8 feature code are shorten

// Note: lambda expression can only be used with functional interface

@FunctionalInterface
interface A2
{
    void show(int i);
    // void work();     // not allowed, can not have two abstract method
}



public class Demo
{
    public static void main(String[] args) {
        
        A2 obj = (i) ->             // annonymous inner class is simplified
                                    // with the help of lambda expression
            {                       // syntactical sugar code is reduced
                                    // it is one statement so we can remove curly braces as well
                                    // we can reduced the parenthesis if there is one variable also
            System.out.println("in show " + i);

            }
        ;
        obj.show(5);
    }
}