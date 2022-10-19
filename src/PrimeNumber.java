import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int n, count = 0;   //n=input any value to check if it's prime or not

        System.out.println("Enter any number");

        Scanner scanner = new Scanner(System.in);  //to get runtime input after any value using scanner class

        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;   //applying counter variable
            }
        }
        if (count == 2) {
            System.out.println("This is Prime Number");  //Prime number is divisible by zero or own number
        }
        else
        {
            System.out.println("This is not Prime Number");
        }
    }
}