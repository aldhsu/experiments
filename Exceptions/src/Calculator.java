public class Calculator {
	public static void main(String[] args) {
		float sum =0;
		for (String number:args) {
			try {
				Float num = Float.parseFloat(number);
				sum += num;
			} catch (Exception e) {
				System.out.println("Invalid argument" + e);
			}
		}
		System.out.println("Numbers add up to " + sum);
	}
}