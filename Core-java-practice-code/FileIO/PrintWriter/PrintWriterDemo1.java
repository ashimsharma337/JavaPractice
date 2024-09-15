import java.io.*;
class PrintWriterDemo1 {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("abc.txt");
		PrintWriter out = new PrintWriter(fw);
		out.write(97);
		out.println(97);
		out.println(true);
		out.println('c');
		out.println("ashim");
		out.flush();
		out.close();
	}
}