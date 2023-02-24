
class D 
{
    int age;

    public void show()
    {
         System.out.println("in show");
    }

    class E              // we can make inner class static also
    {
        public void config()
        {
            System.out.println("in config");
        }
    }
}

//Annonymous inner class
class F
{
    public void show()
    {
        System.out.println("in a F show");
    }
}

//using abstract key word
abstract class G
{
    public abstract void show();
}




public class Demo {
    public static void main(String[] args) {
        
        D obj = new D();
        obj.show();

        D.E obj1 = obj.new E();
        obj1.config();

        F obj3 = new F()
        {
            public void show()        // Annonymous inner class
             {                        // This is mostly used. uses in interface, lambda expression e.t.c
               System.out.println("in a new show");
             }
        };
       
        obj3.show();

       G obj4 = new G() {
         public void show()          // Abstract class implemention with annonymous inner class
         {
            System.out.println("in G show");
         }
       };
       obj4.show();
    }
}
