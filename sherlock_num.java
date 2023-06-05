import java.util.Scanner;
class sherlock_number {
    public static void main(String[] args)
    {
        for(int i=1;i<=25;i++)
        {
            int n = i;
            int count = 0;
            while (n != 0)
            {
                int rem = n % 10;
                count = count + rem;
                n = n / 10;
            }
            if (count%2 == 0)
                System.out.print("\t"+i);
        }
    }
}