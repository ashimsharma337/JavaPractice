
class Human
{
    private int age;          
    private String name;    
    
    
    
    // constructor it looks like method it self

    // public Human()          // even if we don't mention JVM will create default constructor    
    // {                       // constructor name should be same as a class name
    //     age = 12;           // whenever we perform an operation do it in method
    //     name = "John";      // database connection and net work connection are writtern in a constructor which is very important 
    //    // System.out.println("in constructor");
    // }

    // constructor with two parameter, also method overloading
    // public Human(int a, String n)           // Parameterized Constructor
    // {
    //     age = a;
    //     name = n;
    // }
    
    // using VS code shortcut
    public Human() {
    }
    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) { 
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
 
    
}

public class Demo {
    
    public static void main(String[] args)
    {
        Human obj = new Human();                // while creating new object value is assign null for string and 0 for int
        // obj.setAge(30);                      // we can put default value with the help of constructor
        // obj.setName("Ashim");                // every time we create a object constructor will be called
        Human obj1 = new Human(18, "Ashim");               // constructor will be call again
        System.out.println(obj.getName() + " : " + obj.getAge());

    }

}