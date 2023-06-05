 import java.util.Scanner;
public class multipication
    {
        public static void main(String[] args)
        {
            Scanner in=new Scanner(System.in);
            System.out.println("Enter the Number : ");
            int n=in.nextInt();
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=n;j++)
                {
                    if (i==j || i+j==n+1)
                        System.out.print("*"); // 1 star 1 Spaces
                    else
                        System.out.print(" "); // 2 spaces
                }
                System.out.println();
            }
        }
    }

