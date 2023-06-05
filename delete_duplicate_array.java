import java.util.Scanner;
public class delete_duplicate_array
{
    public static void main(String[] args)
    {
        int a[]=new int[10],size,i,j,k;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the size of array:");
        size=in.nextInt();
        System.out.println("Enter the element of array:");
        for(i=0;i<size;i++)
        {
            a[i]=in.nextInt();
        }
        for(i=0;i<size;i++)
        {
            for(j=i+1;j<size;j++)
            {
                if(a[i]==a[j])
                {
                    for (k = j; k <size; k++)
                    {
                        a[k] = a[k + 1];
                    }
                    size--;
                }
            }
        }
        for(i=0;i<size;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
