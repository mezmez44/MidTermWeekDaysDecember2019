package math.problems;

public class PrimeNumber {


	public static boolean isPrimeNumber(int num) {
		int count = 0;//counting how many dividers
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count = count + 1;
			}
		}
		if (count != 2) {
			return false;

		} else
			return true;
	}

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */
		for (int i = 2; i < 100; i++) {
			if (isPrimeNumber(i)) {
				System.out.println(i + " ");
			}

		}

	}

}
