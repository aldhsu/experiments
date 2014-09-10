
public class Virus {
	static int virusCount = 0;
	static private String name = "dougie";
	
	public Virus() {
		virusCount++;
	}
	
	public String getName() {
		return name;
	}
	
	static int getVirusCount() {
		return virusCount;
	}
	
	static void changeName(String newname) {
		name = newname;
	}
	
}
