
class Computer
{
   public void show()
   {
    System.out.println("I am a computer..");
   }

}

class Laptop extends Computer
{
   public void show()
   {
    System.out.println("I am a Laptop..");
   }

}



class Z
{
    public void show()
    {
        System.out.println("in Z show");
    }
}

class X extends Z
{
    public void show()
    {
        System.out.println("in X show");
    }
}

class Y extends Z
{
    public void show()
    {
        System.out.println("in Y show");
    }
}



public class Demo {
    public static void main(String[] args) {
        
        Z obj = new Z();
        obj.show();

        obj = new X();         // Dynamic method dispatch
        obj.show();            // only works when there is inheritance

        obj = new Y();
        obj.show();

        Computer obj1 = new Laptop();
        obj1.show();
    }
}
