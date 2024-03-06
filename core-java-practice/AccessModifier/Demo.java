
import other.Test;

class C extends Test
{

}

public class Demo {
    
    public static void main(String[] args) {
        
        Test obj = new Test();
        System.out.println(obj.marks);
        System.out.println(Test.marks1);    //marks1 is protected and it is outside the package
        
        Test1 obj1 = new Test1();
        System.out.println(obj1.marks);
        
    }
}
