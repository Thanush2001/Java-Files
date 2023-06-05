import java.util.Scanner;

public class adam_array
{
    public static void main(String[] args)
    {
        int a[] = new int[10], size, i, x, x1, r, r1, s, s1, adam = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        size = in.nextInt();
        System.out.println("Enter the element of array");
        for (i = 0; i < size; i++)
        {
            a[i] = in.nextInt();
        }
        for (i = 0; i < size; i++)
        {
            x = a[i] * a[i];
            s = 0;
            while (a[i] > 0)
            {
                r = a[i] % 10;
                s = s * 10 + r;
                a[i] = a[i] / 10;
            }
            x1 = s * s;
            s1 = 0;
            while (x1 > 0)
            {
                r1 = x1 % 10;
                s1 = s1 * 10 + r1;
                x1 = x1 / 10;
            }
            if (s1 == x) {
                adam++;
            }
        }
        System.out.print("Total adam no:" + adam);
    }
}