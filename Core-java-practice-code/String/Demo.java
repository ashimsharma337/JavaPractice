

public class Demo {
    
    public static void main(String[] args)
    {
        // String name = new String("Ashim");
        // String name = "Ashim"; // This will work too behind the scene it will create object this is used more
        
        // System.out.println(name); // prints ashim
        // System.out.println(name.hashCode()); // prints 63558138

        // System.out.println("Hello " + name); // prints Hello Ashim
        // System.out.println(name.charAt(0)); // prints A
        // System.out.println(name.concat(" Sharma")); // prints Ashim Sharma
        
        // String name = "Ashim";
        // name = name + " Sharma";
        // System.out.println("Hello " + name);

        // String s1 = "Ashim";
        // String s2 = "Ashim";  // we got two refrences but not two object

        // String pool constant 

        // Why Strings are immutable in nature?

        // The key benefits of keeping this class as immutable are caching, security, synchronization, and performance.

        // The String pool cannot be possible if String is not immutable in Java. 
        // A lot of heap space is saved by JRE. 
        // The same string variable can be referred to by more than one string variable in the pool. 
        // String interning can also not be possible if the String would not be immutable.
        // If we don’t make the String immutable, it will pose a serious security threat to the application. 
        // For example, database usernames, passwords are passed as strings to receive database connections. 
        // The socket programming host and port descriptions are also passed as strings. 
        // The String is immutable, so its value cannot be changed. 
        // If the String doesn’t remain immutable, any hacker can cause a security issue in the application by changing the reference value.

        // Mutable string & Immutable string
        //--By default string are Immutable
        // If we use String Buffer or String Builder we can make it Mutable 

        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());     // 16 character
        StringBuffer sb1 = new StringBuffer("Ashim");
        System.out.println(sb1.capacity());    // 21 because it is added to 16
        sb1.append(" Sharma");
        sb1.deleteCharAt(2);
        System.out.println(sb1);
        
        // string builder has similar method like string buffer
        // string buffer is thread safe but string builder is not
        


    }
}
