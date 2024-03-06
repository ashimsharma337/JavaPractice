
class Student 
{
    int rollno;             
    String name;
    int marks;
}

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
        
        // int ar[] ={ 50, 60, 80, 90, 10 };

        // for (int element : ar)
        // {
        //     System.out.println(element + " ");  // output: 50, 60, 80, 90, 10
        // }

        // The above syntax is equivalent to 
        // for (int i = 0; i < ar.length; i++)
        // {
        //      int element = ar[i];
        //      System.out.println(element + " ");

        // }

        // if we don't know the size of column in internal rows (jagged array)

        // int nums[][] = new int[3][];   //jagged

        // nums[0] = new int[3];
        // nums[1] = new int[4];
        // nums[2] = new int[2];
        
        // for(int i=0;i<nums.length;i++)
        // {
        //     for(int j=0; j<nums[i].length;j++)
        //     {
        //         nums[i][j] = (int)(Math.random() * 10);
        //     }
        // }

        // for(int n[] : nums)
        // {
        //     for(int m: n)
        //     {
        //         System.out.print(m + " ");
        //     }
        //     System.out.println();
        // }  

        // More examples

        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Navin";
        s1.marks = 88;
        
        // System.out.println(s1);  // prints Student@73a28541(address format) not printing the value of s1 
        // System.out.println(s1.name); // prints student(s1) name

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Ashim";
        s2.marks = 67;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Kiran";
        s3.marks = 96;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // for(int i=0; i<students.length; i++)
        // {
        //     System.out.println(students[i].name + " : " + students[i].marks);

        //     /* Output
        //      * Navin : 88
        //        Ashim : 67
        //        Kiran : 96
        //      */
        // }

        // Using for each loop

        // int nums[] = new int[4];
        // nums[0] = 4;
        // nums[1] = 8;
        // nums[2] = 3;
        // nums[3] = 9;
        
        // using for looop
        // for(int i=0; i<nums.length; i++)
        // {
        //     System.out.println(nums[i]);
        // }

        // for each loop only works with array and array types data

        // for (int n : nums)     // it will iterate the nums and give value to n
        // {
        //     System.out.println(n);
        // }
        
        // using for each loop(enhanced for loop) on student array
        
        for(Student stud : students)
        {
            System.out.println(stud.name + " : " + stud.marks);
        }

    }
}
