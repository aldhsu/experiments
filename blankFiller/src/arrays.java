class ArraysInJava {
	public static void main (String[] args) {
		String test = "My ball sand may contain some stray pubes";
		char[] testToChar = test.toCharArray();
		for (int i =0; i < testToChar.length; i++) {
			char current = testToChar[i];
			if (current !=' ') {
				System.out.print(testToChar[i]);
			} else {
				System.out.print('.');
			}
		}
	}
}