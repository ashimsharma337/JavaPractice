
class A1
{
     public void showMethodBelongsToThisClass()
     {
        System.out.println("in A show");
     }
}

class B1 extends A1
{                            // debugging in compile time
     @Override               // override annotations will make sure we are calling right method
     public void showMethodBelongsToThisClass() 
     {
        System.out.println("in a B show");
     }
}
public class Demo {
       
    public static void main(String[] args) {

        B1 obj = new B1();
        obj.showMethodBelongsToThisClass(); // will show method of A1 due to spelling mistake
                                            // override annotaion will help to debug
        
    }
}
