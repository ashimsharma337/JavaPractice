import java.io.*;
class Account implements Serializable {
	String username = "durga";
	transient String pwd = "anushka";
	transient int pin = 1234;
	private void writeObject(ObjectOutputStream os) throws Exception {
		os.defaultWriteObject();
		String epwd = "123"+pwd;
		os.writeObject(epwd);
		int epin = 4444+pin;
		os.writeInt(epin);
	}
	private void readObject(ObjectInputStream is) throws Exception {
		is.defaultReadObject();
		String epwd = (String)is.readObject();
		pwd = epwd.substring(3);
		int epin = is.readInt();
		pin = epin-4444;
	}
}
class CustSerializationDemo2 {
	public static void main(String[] args) throws Exception {

		Account a1 = new Account();
		System.out.println(a1.username+"..."+a1.pwd+"..."+a1.pin);
		FileOutputStream fos = new FileOutputStream("abc2.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a1);

        FileInputStream fis = new FileInputStream("abc2.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Account a2 = (Account)ois.readObject();
        System.out.println(a2.username+"..."+a2.pwd+"..."+a2.pin);
	}
}
