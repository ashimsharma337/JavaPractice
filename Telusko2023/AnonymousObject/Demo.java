
class A 
{
    public A() 
    {
        System.out.println("object created");
    }
    public void show()
    {
        System.out.println("in A show");
    }
}




public class Demo {
    public static void main(String[] args)
    {  
    //    e.g int marks;
    //        marks = 99;

    //   A obj = new A();  // Here is two steps as well
    //      A obj;
    //      obj = new A();
    //      obj.show();

            new A();     // anonymous object because it does not have name
    }                    // no reference
                         // we can not use this type of object more than once 
                         // because it will create new object each time we create it
}
