import java.io.*;

public class Console {
	public static String readLine() {
		StringBuffer response = new StringBuffer();
		try {
			BufferedInputStream bin = new BufferedInputStream(System.in);
			int in = 0;
			char inChar;
			do {
				in = bin.read();
				inChar = (char) in;
				if (in != -1) {
					response.append(inChar);
				}
			}while ((in != -1) & (inChar != '\n'));
			bin.close();
			return response.toString();
		} catch (IOException e) {
			System.out.println("Exceptino " + e.getMessage());
			return null;
		}
	}
	
	public static void main(String[] args) {
		String[] textSetup = {
				"You are standing at the end of te road ",
				"before a samll brick building. Aroun you ",
				"is a forest. A small stream flows out of ",
				"the building and down a gully.\n"
		};
		for (String text: textSetup) {
			System.out.print(text);
		}
		String input = Console.readLine();
		System.out.println("You " + input +  "towards the building");
	}
}