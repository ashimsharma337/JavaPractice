
public class Conditional {

    public static void main(String[] args) {

                     //...if else

        // int x = 28;
                            // if there is there is one statement inside if we don't need curly bracket.
        // if(x>10) 
        //  System.out.println("Hello");
        // if(true) // works
        // if(false) // does not execute
        // System.out.println("It is true..");

        // if(x>10 && x<=20) // Accepted value is 11-20(including 20)
        //   System.out.println("Hello");
        
        // System.out.println("Bye");

        // using if and else together (if can be alone else can not be)
        
        // if(x>10 && x<=20) 
        //   System.out.println("Hello");
        // else 
        //   System.out.println("Bye");

        // another example

        // int x = 5;
        // int y = 7;

        //To print the greatest number 

        // if(x>y)
        //    System.out.println(x);
        // else
        //    System.out.println(y);

        // if(x<y) {
        //    System.out.println(x);     // If there are multiple statement we need curly bracket  
        //    System.out.println("Thank you!");  // Prints 5 and thank you.

        // }
        // else
        //    System.out.println(y);

                 // if else with three value

        int x = 8;
        int y = 7;
        int z = 9;

                 // to print the greatest of three value

        if(x>y && x>z) {
           System.out.println(x);       
           System.out.println("Thank you!");  
        }
        else if(y>z) {
           System.out.println(y);
        }
        else {
            System.out.println(z);
        }


    }
}