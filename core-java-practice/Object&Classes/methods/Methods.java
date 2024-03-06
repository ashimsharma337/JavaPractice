
class Computer {

   public void playMusic() {      // this method is not returning anything so void is used

        System.out.println("Music Playing....");
   }

   public String getMeAPen(int cost) {   // this method is returning string so String is used
        if(cost >= 10)                   // to get pen value must be 10 or greater than 10
          return "Pen";
        else 
          return "Nothing";
   }

}

class Calculations {
    
    // this is example of method overloading, there is also method over riding which has inheritance as well
    // Both are example of polymorphism a) compile time (method overloading) b) run time (method overriding)

    public int add(int a, int b) {
        return a+b;
    }

    public int add(int a, int b, int c) {
        return a+b+c;
    }
}






public class Methods {
    public static void main(String[] args) {
         
    //    Computer obj = new Computer();
    //    obj.playMusic();
    //    String str = obj.getMeAPen(2);
    //    System.out.println(str);


          Calculations obj = new Calculations();
          int result = obj.add(3, 4);
          int result2 = obj.add(3, 4, 5);

          System.out.println("With two int: "+result);
          System.out.println("With two int: "+result2);
    }
}
