import java.util.Scanner;
public class aa
{
    // Write a program to check the given number is perfect number or not.
    public static void main(String[] args)
    {
        for (int i=1; i<=1000; i++)
        {
            int count=0;
            for (int j=1; j<i; j++)
            {
                if(i%j==0)
                {
                   count+=j;
                }
            }
            if (count==i)
            {
                System.out.print(i+"\t");
            }
        }
    }
}
