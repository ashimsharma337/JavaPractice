public class Casting{

   public static void main(String[] args){
       // byte b = 127; //works
       // byte b = 257;  // will not work too high
       
       // byte b = 127;
       // int a = b;      will work

    //    int a = 12;
    //    byte k = a;  // does not work
    //    System.out.println(k);

    // Type Casting 
    // int a = 12;      // if int a = 257 out of range output will be 1, it will perform a modulus operation
    // byte k = (byte) a;
    // System.out.println(k);

    // float f = 5.6f; //error
    // int t = f;
    //type casting        //casting is explicit conversion because we specify
    // float f = 5.6f;
    // int t = (int) f; //will work but we will loose value after . output 5 only

    // on the other hand conversion is automatic casting

    //Type promotion

    byte a = 10;
    byte b = 30;

    //if a*b value will be out of range
    int result = a*b; //type promotion

    System.out.println(result); // output 300


       // System.out.println(b);
   }

} 