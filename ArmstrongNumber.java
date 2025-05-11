import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int originalNumber = number;
        int sum = 0;

        // Count the number of digits
        int digits = 0;
        int temp = number;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        // Calculate the sum of digits raised to the power of 'digits'
        temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits); // Raise to the power of 'digits' and add to sum
            temp /= 10;
        }

        // Check if the sum is equal to the original number
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
}