import java.util.Scanner;

public class ArmstrongNumber
{
    public static void main(String[] args)
    {

        int n, rem, arm = 0, c;  // c is temporary variable
        System.out.println("Enter any number");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        c = n;

        while (n > 0)                           //111 > 0
        {
            rem = n % 10;
            arm = (rem * rem * rem) + arm;
            n = n / 10;                         // 111 % 10
        }
        if (c == arm)
        {
            System.out.println("This is Armstrong number");
        }
        else
        {
            System.out.println("This is not Armstrong number");
        }
    }
}
