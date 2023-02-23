

// final can be used on variable, method, class
// -variable(constant), method(to prevent method overriding), class(to stop inheritance)

final class P          // if class is final it will stop inheritance, so sub class can not be created
{
    public final void show()   // if the method is final it can not be over ride
    {
        System.out.println("in P show");
    }
    public void add(int a, int b)
    {
        System.out.println(a+b);
    }
}

class AdvP extends P
{
   public void show()
   {
    System.out.println("In Adv show");
   }
}


public class Demo {
    
    public static void main(String[] args) {
        
        // final int num = 8;      // Once final can not be change
        // num = 9;                // it will not change
        // System.out.println(num);

        P obj = new P();
        obj.show();
        obj.add(4, 5);

    }
}
