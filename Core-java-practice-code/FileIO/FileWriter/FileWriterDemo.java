import java.io.*;
class FileWriterDemo {
	public static void main(String[] args) throws IOException {
		// FileWriter fw = new FileWriter("abc.txt"); // this is for overriding
		FileWriter fw = new FileWriter("abc.txt", true); // for append operation
		fw.write(97); //adding a single character
		fw.write("shim\nDev");
		fw.write('\n');
		char[] ch1 = {'a','b','c'};
		fw.write(ch1);
		fw.write('\n');
		fw.flush();
		fw.close();
	}
}