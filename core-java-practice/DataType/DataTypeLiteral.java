class DatatypePrimitive {

public static void main(String[] args)
{
    //literals

    int num1 = 0b101; // yes binary format works
    int num2 = 0x7E; //  yes hexadecimal works
    int num3 = 100_000_000; // yes underscore between numbers works

    char c = 'a';
    c++;
    System.out.println(c); //output b | charcters can be incremented
    
    System.out.println(num1);
}

}