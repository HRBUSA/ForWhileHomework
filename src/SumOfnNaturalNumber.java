import java.util.Scanner;

public class SumOfnNaturalNumber
{
    public static void main(String[] args) {

        int n, sum = 0;
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++)
        {
            sum = sum + i;
        }
        System.out.println("ADDITION : " + sum);
    }
}
