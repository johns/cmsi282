public class DoubleGenerator {
	public static void main (String args[]) {
		int NUMBER_OF_INTEGERS = Integer.parseInt(args[0]);
		for (int i = 0; i < NUMBER_OF_INTEGERS; i++) {
			//System.out.println((int) (Math.random() * 1000000 + 0));
			System.out.println((Double) (Math.random() * 1000000 + 0));
		}
	}
}
