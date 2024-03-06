

public class Chaining {
    public static void main(String[] args) {
		JavaDeveloper dev = new JavaDeveloper("java");

	}
}

class Employee {
	String name = "Dan Pickles";
	public Employee () {
		System.out.println("Employee");
	}
}

class JavaDeveloper extends Employee {
	String language;
	public JavaDeveloper() {
		super();   // Even if we don't put implicitly super class constructor will be called
		System.out.println(name + " JavaDeveloper");
	}
	
	public JavaDeveloper(String language) {
		this();
		this.language = language;
		System.out.println(language);
	}
}
