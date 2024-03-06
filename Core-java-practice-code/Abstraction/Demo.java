// Note: We can not create object of a abstract class
//       All abstract method must be implimented
//       If we don't want to use all the abstract method then we have to make it abstract class

abstract class Car
{
    public abstract void drive();  //Declaring method
    public abstract void fly();

    public void playMusic()
    {
        System.out.println("play music");
    }
}

abstract class Honda extends Car 
{
    public void drive()
    {
        System.out.println("Driving....");
    }


}

class updatedHonda extends Honda        // concrete class
{
    public void fly()
    {
        System.out.println("Flying...");
    }
}


public class Demo {
    
    public static void main(String[] args) {
        
        Car obj = new updatedHonda();        // We can not create object of a abstract class
                                      // So instead of Car we are using Honda
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}
