

// creating a class for calculation

class Calculation {
    
    public int add(int a, int b) {
           int result = a + b;
           return result;
    }
}







class Object {
    public static void main(String[] args) {
        System.out.println("calling addition method from calculation class");

        //creation of object using new 

        Calculation calc = new Calculation();

        int myResult = calc.add(4, 5);

        System.out.println(myResult);

    }
}