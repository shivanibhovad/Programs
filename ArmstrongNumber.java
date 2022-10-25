import java.util.Scanner;

public class ArmstrongNumber
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        for (int i = 2; i<=n; i++)
        {
            int sum = 0, count = 0;
            int  number = i;
            while (number != 0)
            {
                number = number/10;
                count += 1;
            }

            int rem;
            int s=1;
            int number1 = i;
            while (number1 != 0)
            {
                rem = i%10;
                number1 = number1/10;
                for (int j=1; j<=count; j++)
                {
                    s *= rem;
                }
                sum += s;
            }

            if (sum == i)
            {
                System.out.println(i);
            }
        }


    }
}
