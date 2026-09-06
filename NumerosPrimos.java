
import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        // Keep asking until the user enters a valid number (2, 2000000)
        while (number < 2 || number > 2000000) {

            System.out.print(
                    "Please enter a positive integer greater than or equal to 2 and less than or equal to 2000000: ");

            number = scanner.nextInt();

            // Validate if the input is in the range
            if (number >= 2 && number <= 2000000) {
                int count = 0;

                // Count total divisors from 1 to number
                for (int i = 1; i <= number; i++) {
                    if (number % i == 0) {
                        count++;
                    }
                }

                // A prime number has exactly two positive divisors: 1 and itself
                if (count == 2) {
                    System.out.println("prime");
                } else {
                    System.out.println("not prime");
                }

            } else {
                // Notify user if input is out of the valid range
                System.out.println("Error! You add a 0, a negative number or bigger than 2000000, try again");
            }
        }

        scanner.close();
    }
}
