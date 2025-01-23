package ANP_D0453;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Prompt the user to enter a number
		System.out.print("Enter a number to check if it's a perfect number: ");
		int number = scanner.nextInt();

		// Check if the number is perfect
		if (isPerfectNumber(number)) {
			System.out.println(number + " is a perfect number.");
		} else {
			System.out.println(number + " is not a perfect number.");
		}

		scanner.close();
	}

	// Method to check if a number is a perfect number
	public static boolean isPerfectNumber(int num) {
		if (num <= 0) {
			return false;
		}

		int sum = 0;

		// Find all divisors of the number and calculate their sum
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}

		// A number is perfect if the sum of its divisors equals the number itself
		return sum == num;

	}

}
