import java.util.Scanner;

public class FibonacciSeriesWithScanner {
    public static void main(String[] args) {
        int FibonacciLength;
        Scanner scanner = new Scanner(System.in); // for creating an object

        System.out.println("Please enter length");
        FibonacciLength = scanner.nextInt();

        int[] num = new int[FibonacciLength];

        // Initialized first element to 0
        num[1] = 1;

        // Initialized second element to 1
        num[1] = 1;

        // New number should be the sum of the last two numbers of the series.
        for (int i = 2; i < FibonacciLength; i++) {
            num[i] = num[i - 1] + num[i - 2];
        }

        // Print Fibonacci Series
        System.out.println("Fibonacci Series : ");
        for (int i = 1; i < FibonacciLength; i++)
        {
            System.out.println(num[i] + "  ");
        }
    }
}