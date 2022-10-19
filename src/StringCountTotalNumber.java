import java.util.Scanner;

public class StringCountTotalNumber
{
    // input number 153---->3

    public static void main(String[] args)
    {
        int n, count = 0;  // n = 153 is 3 Digits

        System.out.println("Enter any number");

        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();

        while (n>0)          // 153 > 0
        {
            n = n / 10;     //  153 / 10

            count++;
        }
        System.out.println("Number of digits is 0");
    }
}
