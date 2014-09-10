import java.io.*;

public class TestFile {
	public static void main(String[] args) {
		try {
			File folder = new File(args[0]);
		
			File[] files = folder.listFiles();
			for (File file: files) {
				System.out.println(file.getAbsolutePath());
			}
		}catch (Exception e){
			System.out.print(e);
		}
	}
			
}
