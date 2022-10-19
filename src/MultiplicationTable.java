import java.util.Scanner;

public class MultiplicationTable
{
    // input any number for example number is 7.  Then it will print 7 * 1 = 7, 7 * 2 = 14,-------- 7 * 10 = 70.

    public static void main(String[] args)
    {
        int num;
        System.out.println("Enter any number");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        for (int i = 1; i <=10; i++)
        {
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }
}
