import java.util.Scanner;
public class While_loop
{
    public static void main(String[] args)
    {
     System.out.print("Enter the limit:");
     Scanner in=new Scanner(System.in);
     int n=in.nextInt();
     int i=1;
     while(i<=n)
     {
         System.out.print(i+" ");
         i++;  //i=i+1
     }
    }
}
