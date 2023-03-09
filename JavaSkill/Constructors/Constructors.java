// Constructors initialize an object state
// Calling the constructor creates an object at runtime (new keyword)
// Java provides default constructor if we don't provide constructor
// We can define as many constructor (Constructor overloading)


public class Constructors {
    

        public static void main(String[] args) {
            
            Pizza pizza = new Pizza();
            pizza.slices = 8;
            
            Pizza pie = new Pizza(6);
            pizza.eat();
            
            System.out.println(pizza.slices);
            System.out.println(pie.slices);
        }
    
    }
    
    class Pizza {
        int slices;
        String topping;
        Pizza(){
            
        }
        Pizza(int pieces){
            slices = pieces;
        }
        public void eat() {
            slices = slices - 1;
        }
    
}
