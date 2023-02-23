import tools.Calc;
import tools.AdvCalc;
import java.util.ArrayList;

// By default java.lang is imported even if we don't mention it
// so for System.out.println() no need to import
// Note: while importing * represent all the files not folder
// while creating a package reversing domain name e.g com.ashim.Calc to make it unique

public class Demo {
    
    public static void main(String[] args)
    {   
        
        ArrayList list = new ArrayList();  // e.g

        Calc obj = new Calc();
        AdvCalc obj1 = new AdvCalc();
        int result = obj.add(5, 6);
        System.out.println(result);
    }
}
