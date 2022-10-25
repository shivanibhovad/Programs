import java.util.Scanner;

public class SecondLargestNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int [] arr = {10,5,15,2,1};
        int temp;

        for (int i =0; i<arr.length; i++)
        {
            for (int j =0; j<arr.length - 1; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    continue;
                }
                else
                {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int k=0; k<arr.length; k++)
        {
            System.out.println(arr[k]);
        }

        System.out.println("Second Largest element in array is " + arr[1]);


    }
}
