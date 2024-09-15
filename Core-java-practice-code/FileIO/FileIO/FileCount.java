import java.io.File;
class FileCount {
	public static void main(String[] args) throws Exception {
		int count = 0;
		File f = new File("c:\\Users");
		String[] s = f.list();
		for(String s1: s) {
			count++;
			System.out.println(s1);
		}
		System.out.println("The Total count of file is: "+count);
    }
}