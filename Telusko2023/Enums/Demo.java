// enum is a class but we can not extend it
// enum extend enum class which is super class

// enum Status{
//     Running, Failed, Pending, Success;    // These are all object
// }

// using enum for constructor
enum Laptop{
    Macbook(2000), Surface(1500), ThinkPad;

    private int price;

    public int getPrice() {
        return price;
    }


    private Laptop() {   // default constructor
        price = 500;
    }


    public void setPrice(int price) {
        this.price = price;
    }

    private Laptop(int price) {
        this.price = price;
    }

    

}

public class Demo {
    public static void main(String[] args) {
        
        // Status s = Status.Running;
        // System.out.println(s);
        // System.out.println(s.ordinal()); // Prints 0

        // To print all values
        // Status[] ss = Status.values();  // Gives value as an array
        // System.out.println(ss[0]);      // Prints Running

        // for (Status s : ss)
        // {
        //     System.out.println(s);      // Prints all status
        //     System.out.println(s + " : " + s.ordinal());
        // }

        // with conditionals
        // Status s = Status.Pending;

        // if(s == Status.Running)
        //    System.out.println("All Good");
        // else if(s == Status.Failed)
        //    System.out.println("Try Again");
        // else if(s == Status.Pending)
        //    System.out.println("Please Wait");
        // else 
        //    System.out.println("Done"); 

        // Switch also supports enums

        // switch(s)          // In switch we can use constant  itself 
        // {
        //     case Running:
        //          System.out.println("All Good");
        //          break;
        //     case Failed:
        //          System.out.println("Try Again");
        //          break;
        //     case Pending:
        //          System.out.println("Please Wait");
        //          break;
        //     default:
        //          System.out.println("Done");
        //          break;
        // }


        // using constructor
        // Laptop lap = Laptop.Macbook;
        // System.out.println(lap + " : " + lap.getPrice());

        for(Laptop lap : Laptop.values())
        {
            System.out.println(lap + " : " + lap.getPrice());
        }


    }
}
