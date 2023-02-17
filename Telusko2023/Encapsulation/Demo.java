
class Human
{
    private int age;          // Every time we make instance variable we have to make it private
    private String name;      // This variable can only access within same class

    //using IDE shortcut
    public int getAge() {
        return age;
    }
    public void setAge(int age) { // this is the key word which represent current object or the object which is calling the method
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // public int getAge()       // getAge method is define inside a same class so we can access it
    // {
    //     return age;
    // }

    // public void setAge(int a)  // a is a local variable and age is a instance variable
    // {
    //     age = a;
    // }

    // public String getName()
    // {
    //     return name;
    // }

    // public void setName(String n) // n is a local variable and name is a instance variable
    // {
    //     name = n;
    // }

    
    
}

public class Demo {
    
    public static void main(String[] args)
    {
        Human obj = new Human();
        obj.setAge(30);
        obj.setName("Ashim");

        System.out.println(obj.getName() + " : " + obj.getAge());

    }
}
