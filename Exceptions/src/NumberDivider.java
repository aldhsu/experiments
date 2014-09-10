public class NumberDivider {
	public static void main(String[] args) {
		if (args.length == 2) {
			int result =0;
			try {
				result = Integer.parseInt(args[0])/Integer.parseInt(args[1]);
				System.out.println(args[0] + " divided by " + args[1] + "equals " + result);
			} catch (Exception e) {
				throw e;
			}
		}
	}
}