import java.io.*;
class FileMerger {
	public static void main(String[] args) throws Exception {
		PrintWriter pw = new PrintWriter("file3.txt");
		BufferedReader br = new BufferedReader(new FileReader("file1.txt"));
		String line = br.readLine();
		while(line != null) {
			pw.println(line);
			line = br.readLine();
		}
		br = new BufferedReader(new FileReader("file2.txt"));
		line = br.readLine();
		while(line != null) {
			pw.println(line);
			line = br.readLine();
		}
		pw.flush();
		br.close();
		pw.close();
	}
}