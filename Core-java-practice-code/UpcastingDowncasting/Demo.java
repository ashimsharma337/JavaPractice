
class M 
{
   public void show1()
   {
      System.out.println("in M show");
   }
}

class N extends M
{
   public void show2()
   {
     System.out.println("in N show");
   }
}


public class Demo {
    
    public static void main(String[] args) {
        
        // double d = 4.5;
        // int i = (int) d;       // Type castin (data will be loose)


        // System.out.println(i);
        M obj = (M) new N();     // Upcasting
        obj.show1();             // parent reference child object
        
        N obj1 = (N) obj;        // child refrence
        obj1.show2();           // Downcasting
    }
}
