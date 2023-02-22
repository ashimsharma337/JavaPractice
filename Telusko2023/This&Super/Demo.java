
// Note: Every constructor has a method called super even if it is not mention
//       By default every constructor first statement is super
//       super method calls the contructor method of the super class

// Note: Every class in java extends an Object class even if we don't mention
//       so in class A it extends Object class

// Note: super mehod execute the constructor of a super class 
//       and this method execute the constructor of a same class

class A 
{
   public A()
   {  
      super();      //super method calls the constructor method of a super class
      System.out.println("in A");
   }
   public A(int n)
   {  
      super();
      System.out.println("in int A");
   }
}

class B extends A
{
  public B()
  {  
     super();
     System.out.println("in B");
  }
  public B(int n)
  {
    // super(n);             // By passing the value in super it will call parameterized constructor of super class
    this();                  // this will execute the constructor of same class
    System.out.println("in B int");
  }
   
}

public class Demo {
    
    public static void main(String[] args)
    {
        B obj = new B(5);   // when we create a object it call a constructor of 
                           // its class and super class as well
    }
}
