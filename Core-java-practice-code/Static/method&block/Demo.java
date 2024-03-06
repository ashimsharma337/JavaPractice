

class Mobile {

    String brand;         // instance variable it differs between objects
    int price;
    static String name;   // it is class level and shared by all the object, saves memroy as well

     //constructor
     public Mobile()      // this will be called each time when object is created
     {
         brand = "";
         price = 200;
         System.out.println("in constructor");
     }

    // static block
    static                  //this will call once no matter how many objects are created
    {
      name = "Phone";
      System.out.println("In static block.");

    }

    public void show()     // non static method
    {
        System.out.println(brand + " : " + price + " : " + name);
    }

    public static void show1()   // static method no need to create object we can use by using class name
    {                            // all variables used in static method must be static
        System.out.println("in static method");
    }
    // To use instance variable in static method we have to pass it
    public static void show2(Mobile obj1)
    {
        System.out.println(obj1.brand + " : " + obj1.price + " : " + name);
    }
    
}


public class Demo
{
    public static void main(String[] args)
    {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;

        Mobile obj2 = new Mobile();
        obj2.brand = "Apple";
        obj2.price = 1500;

        // static method
        Mobile.show1();

        // non static method
        obj1.show();
    }

    // if no object is created static block does not execute
    // but with the help of Class.forName("Mobile"); it will load the class
    // Normally it is not used but in jdbc it is used

    
}
