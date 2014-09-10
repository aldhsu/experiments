class floatToInt {
	public static void main (String[] args) {
		if (args.length > 0) {
			float given_number = Float.parseFloat(args[0]);
			Float new_float = new Float(given_number);
			int int_float = (int) Math.round(new_float);
			
		}
	}
}