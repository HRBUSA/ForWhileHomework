import java.util.Scanner;

public class SumOfEachDigit
{
    public static void main(String[] args)
    {
        int n, r, sum = 0;
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        while (n > 0)         // 123>0
        {
             r = n % 10;     // 123 % 10
             sum = sum + r;
             n = n/10;
        }
        System.out.println("Sum of digits : " + sum);
    }


}
