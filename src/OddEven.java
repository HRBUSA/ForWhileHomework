import java.util.Scanner;

public class OddEven
{
    public static void main(String[] args)
    {
        int n, i, sum = 0;
        System.out.println("Enter range of the number");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        if (n % 2 ==0)
        {
            for (i = 0; i <= n; i++)
            {
                sum = sum + i;
            }
            System.out.println("Sum of even number : " + sum);
        }
        else
        {
            for (i = 1; i <= n; i++)
            {
                sum = sum + i;
            }
            System.out.println("Sum of odd number : " + sum);
        }
    }

}
