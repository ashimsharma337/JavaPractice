
class Person {
    private int age;
    private String name;
    

    public void code () {}

    public void setAge(int age) {
        if(age < 1)
        System.out.println("Please enter proper age");
        else
        this.age = age;
    }

    public int getAge() {
        return age;
    }

  }

public class Demo {
    
    public static void main(String[] args) {

        Person person = new Person();
        // person.setAge(-1);
        person.setAge(32);
        int returnedAge = person.getAge();
        
        System.out.println(returnedAge);
    }
}
