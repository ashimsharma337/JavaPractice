
class Mobile
{
    String brand;         // instance variable it differs between objects
    int price;
    static String name;   // it is class level and shared by all the object, saves memroy as well
    


    public void show()
    {
        System.out.println(brand + " : " + name);
    }
}


public class Demo {
    
    public static void main(String[] args)
    {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile.name = "iPhone 6";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1700;
        Mobile.name = "SmartPhone";
        
        Mobile.name = "Phone"; // it change name of both obj1 and obj2
        // can call static variable by class name as well
        System.out.println("This is static variable "+ Mobile.name);

        obj1.show();
        obj2.show();

    }
}
