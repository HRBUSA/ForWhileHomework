import java.util.Scanner;

public class SumOfFirstAndLastDigit
{
    public static void main(String[] args)   // input number is 159 ------> 1+5+9=15
    {
        int n, r, sum = 0;     // n =  159
        System.out.println("Enter any number");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        while (n > 0)         // 159 > 0
        {
            r = n % 10;      // 159 % 0
            sum = sum + r;
            n = n / 10;
        }
        System.out.println("Sum of the digits : " + sum);
    }
}
