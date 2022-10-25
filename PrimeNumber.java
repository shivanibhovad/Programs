import java.util.Scanner;

public class PrimeNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        System.out.println("Prime Numbers from 2 to " + num + " : ");

        int count = 0;

        for (int i = 2; i<=num; i++)
        {
            if(i==2)
            {
                System.out.println(i);
            }
            else {
                for (int j=2; j<i; j++)
                {
                    if (i % j == 0)
                    {
                        count += 1;
                        break;
                    }
                }

                if (count != 1)
                {
                    System.out.println(i);
                }
                else
                {
                    count = 0;
                }

            }
        }


    }
}
