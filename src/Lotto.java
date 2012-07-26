import java.util.Random;

public class Lotto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		printLotto();

	}

	public static void printLotto() {
		for (int i = 0; i < 6; i++) {
			System.out.println(getNumber());
		}
	}

	static Random random = new Random();

	private static int getNumber() {
		return random.nextInt(45) + 1;
	}

}
