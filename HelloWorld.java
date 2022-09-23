public class HelloWorld {
    
    public static void main(String[] args) {
        System.out.println("Hello World");
        add(5, 3);
        HelloWorld obj = new HelloWorld();
        obj.mul(6,2);
        divide.division(16, 4);
    }

    static void add(int a, int b) {             // static method no need to create object while accessing
        System.out.println("The addition of given two number is " +(a+b));
    }

    void mul(int d, int e) {                   // non-static method need to create object while accessing
        System.out.println("The multiplication of given two number is "+(d*e));
    }
    
}

class divide {                                // This class is outside public class 
    static void division(int f, int g) {
        System.out.println("The division of given number is "+ (f/g));
    }
}