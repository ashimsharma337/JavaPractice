
public class Loops {

    public static void main(String[] args) {
        
        // repeat this statement 4 times
        // loops
            //while, do while, for

        // if finite number like 100 times, 200 times
        // based on conditions -do something till i press button, or system is alive
        
        // int i = 1;    // i is a iterator

        // while(i<=4)   // if true loop occur once the value is false it will stop
        // {
        //    System.out.println("Hi " + i);
        //    i++;
        // }

        // System.out.println("Bye" + 5); // it will print Bye 5 and loop will stop
        /// using degugger will show the value of i clearly

        // nested while loop

        // int i = 1;

        // while(i<=4) {
        //     System.out.println("Hi " + i);
        //     int j = 1;
        //     while(j<=3){
        //         System.out.println("Hello " + j);
        //         j++;
        //     }

        //     i++;
        // }
        
        // System.out.println("Bye " + i);

        // do while loop

        // int i = 5; // if i is equal to 5 loop will not execute so
                    // do while is used to run once even if condition is false
        
        // do
        // {
        //     System.out.println("Hi " + i);

        //     i++;
        // } while(i<=4);  // prints Hi 5

        // for loop

        // for(int i = 0; i<3; i++) {    // first body is executed and then incremented
            
        //     System.out.println("Hi " + i);
        // }

        // printing days and hours

        // for(int i=1;i<=7;i++) {  

        //     System.out.println("DAY " + i);

        //     for(int j=1; j<=9; j++) {

        //         System.out.println("  " + (j+8) + " - " + (j+9));
        //     }
        // }

        // printing pattern using nested loop

        for(int i=0;i<=4;i++) {      
           
                for(int j=i; j<4; j++) {
    
                    System.out.print("*");
                }

            System.out.println("*");
        }

    }
}

// Summary when to use what loop

// Reading a file, reading data from data base, network use while loop
// when using a while loop if we want to execute once even if value is false use do while
// for loop is more popular it is used if we know the number of iterations
