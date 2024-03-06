
interface Computer
{
    void code();
    
}

class Laptop implements Computer
{
    public void code()
    {
        System.out.println("code, compile, run");
    }
}

class Developer
{
    // public void devApp(Laptop lap)      // devloper depend on laptop(Tight coupling)
    public void devApp(Computer lap)
    {
        lap.code();
    }
}

class Desktop implements Computer
{
    public void code()
    {
        System.out.println("code, compile, run : Faster");
    }
}

public class NeedOfInterface {
       
    public static void main(String[] args)
    {
    //   Laptop lap = new Laptop();
    //   Desktop desk = new Desktop();

      // Using Computer Interface

      Computer lap = new Laptop();
      Computer desk = new Desktop();
       

      Developer ashim = new Developer();
     //   ashim.devApp(lap);
         ashim.devApp(desk);
    }
}

