// class - class -> extends
// class - interface -> implements
// interface - interface -> extends

interface H                  // By default every method on interface is public abstract
{   
    int age = 44;           // By default variable declared are final and static
    String area = "Virginia";

    public abstract void show();
    public abstract void config();

    //By default following method is public abstract
    void show2();
}

interface j
{
    void run();
}

interface k extends j           // interface can extends interface
{

}

class I implements H, j         // class can implement multiple interface
{
    public void show()          // All methods of interface must be in class which implements it
    {
        System.out.println("In a show");
    }

    public void config()
    {
        System.out.println("In a config");
    }

    public void show2()
    {
        System.out.println("In a show2");
    }

    public void run()
    {
        System.out.println("Run");
    }
}

public class Demo {
    public static void main(String[] args) {
        I obj;
        obj = new I();
        obj.show();
        obj.config();
        obj.show2();

        System.out.println(H.area);

        // H.area = "Kathmandu";       // not allowed 
        
        j obj1 = new I();
        obj1.run();

    }
}
