
//Arithmetic operator
public class OperatorOfJava {
    
    public static void main(String[] args)
    {
        // int num1 = 7;
        // int num2 = 5;

        // int result = num1 + num2; //add"+",subtract"-",multiplication"*",division"/"" incase of division only quotient 
        // int result = num1 / num2;    // output 1 -only quotient 
        // int result = num1 % num2;       // this gives -only remainder output is 2 "%" modulus operator
        // System.out.println(result);

        // int num3 = 7;
        // num3 = num3 + 2;       // output is 9
        // num3 += 2;                // works with subtrations also 

        // shortcut
        // num3++;        //incrementing -output 8 post-increment
        // num3--;        //decrement    -output 6
        // ++num3;    //output is 8 pre-increment it behaves diffrently when we try to fetch a value
        // int result = num3++;     //output 7 because because first fetch the value after assignment operator(=) then it will increment
        // int result = ++num3;     //first increment and then fetch the value
        // System.out.println(num3);
        // System.out.println(result);


                      //Assignment Operators

       // "="assignment, "<"lessthan, ">" greater than, "=="equal to, "!="not equal to, "<="less than equal to, ">="greater than equal to

       // int x = 6;
       // int y = 5;

        // boolean result = x < y;    // output false
        // boolean result = x <= y;   // output false
        // boolean result = x >= y;      // output true

        // boolean result = x != y;        // output true  // if two values are not equal
        // boolean result = x == y;           // output false // if two values are equal


        // System.out.println(result); 


                          // Logical operators
            // if we have two ralational operators and we want to combine them to check if it is true or false
        
        // x < y  and a > b // two conditions (we have and AND/OR)

        // And(&) Operator if both are true, then true, 
        // OR(|) Operator if one of them is true or fale(one true it will be true), 
        // NOT(!) Operator it is used to reverse 
        
        // shortcircuit (&&, ||, !) x < Y && a < b 
        // r = x < y && a < b, it will be true if both conditions are true
        // r = x < y || a < b, it is called shortcircuit because if one condition is true it will not even check second one(saving time)
        // instead of single we will used shortcircuit

        // code

        int x = 7;
        int y = 5;
        int a = 5;
        int b = 9;
        // logical AND(&&) operator

        // boolean result = x > y && a > b;      // output is false because one value is false
        // boolean result = x > y && a < b;      // ouput s true because both conditions are true

        // logical OR operator(||)

        // boolean result = x > y || a < b;      // output is true because both conditions are true
        // boolean result = x > y || a > b;      // output is true because one condition is true

        // logical NOT operator(!)
        
        // The NOt operator reverse the value of a boolean expression. 
        // Thus, if the expression is true, Not changes to false, and vice versa.

        // boolean result = a > b;      // output is false

        // System.out.println(!result);  // output is true
        // Anther example
        boolean z = true;
        if(z) { // prints this is true
            System.out.println("This is true.");
        } else {
            System.out.println("This is false.");
        }

        // if(!z){ // prints This is false
        //     System.out.println("This is true.");
        // } else {
        //     System.out.println("This is false.");
        // }


        //System.out.println(result);
    }



}