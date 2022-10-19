import java.util.Scanner;

public class PalindromeNumber
{
    public static void main(String[] args) {

        int n, s = 0, c, r;   // n = 111 & c = n.
        System.out.println("Enter any number ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        c = n;

        while (n>0)
        {
            r = n % 10;         // 111/10 reminder 1
            s = (s * 10) + r;
            n = n / 10;
        }
        if (c == s)
        {
            System.out.println("This is Palindrome number : ");
        }
        else
        {
            System.out.println("This is not Palindrome number : ");
        }
    }
}
