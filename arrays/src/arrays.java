class Arrays {
	public static void main( String[] args) {
		int[] multiples = new int[400];
		for (int i = 0; i <400; i++) {
			multiples[i] = i * 13;
			
		}
		for (int i = 0; i<multiples.length; i++) {
			System.out.println(multiples[i]);
		}
		System.out.println(multiples);
	}
}