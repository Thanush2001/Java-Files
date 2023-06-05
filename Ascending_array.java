import java.util.Arrays;
public class Ascending_array
{
    public static void main(String[] args)
    {
       int a[]=new int[]{8,2,9,7,33,3,87};  //Ascending order
       System.out.print("Before sort:");
       for (int element:a)
       {
           System.out.println(element);
       }
        System.out.println("Before sort:"+ Arrays.toString(a));
       int temp;
       for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])  // > Ascending order  or < descending order
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.print("After sort:"+ Arrays.toString(a));
    }
}
