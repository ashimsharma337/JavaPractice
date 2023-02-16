

public class Array {
    
    public static void main(String[] args) {
        
        // int nums[] = {3,7,2,4};

        // To print the value
        // System.out.println(nums[0]); // output 3
        // To update second value
        // nums[1] = 6;
        // System.out.println(nums[1]);

        // Another way to create array 
        // int nums[] = new int[4];
        // nums[0] = 4;
        // nums[1] = 8;
        // nums[2] = 3;
        // nums[3] = 9;
        // System.out.println(nums[1]); // output 8

        // we can print all the value by using loop

        // for(int i = 0; i < 4; i++) {
            
        //     System.out.println(nums[i]);
        // }

        // Multi-Dimensional array

        // int nums [] [] = new int[3][4];

        // for(int i = 0; i<3; i++) {      // i represent row j represent column
             
        //     for(int j = 0; j<4; j++) {
        //         System.out.print(nums[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // Assigning values in array 

        // int nums [] [] = new int[3][4];

        // for(int i = 0; i<3; i++) {     
             
        //     for(int j = 0; j<4; j++) {
        //         nums[i][j] = (int)(Math.random()*100); // changing value to int with the help of type casting
                 // System.out.println(nums[i][j]);
        //     }
            
        // }

        // for(int i = 0; i<3; i++) {    
             
        //     for(int j = 0; j<4; j++) {
        //         System.out.print(nums[i][j] + " ");
        //     }
        //     System.out.println();      // prints number in a table form with row and column
        // }

         // Enhanced for loop or for each loop
        // for(int n[] : nums) {
        //     for(int m : n) {
        //         System.out.print(m + " ");
        //     }
        //     System.out.println();
        // }

        // It is commonly used to iterate over an array or a collections class(eg, ArrayList)
        // syntax
        //    for(type var : array)
        //    {
        //       statements using var;
        //    }
        
        int ar[] ={ 50, 60, 80, 90, 10 };

        // for (int element : ar)
        // {
        //     System.out.println(element + " ");  // output: 50, 60, 80, 90, 10
        // }

        // The above syntax is equivalent to 
        for (int i = 0; i < ar.length; i++)
        {
             int element = ar[i];
             System.out.println(element + " ");

        }


    }
}
