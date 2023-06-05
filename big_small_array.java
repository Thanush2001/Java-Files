import java.util.Scanner;

public class big_small_array
{
    public static void main(String[] args)
    {
        int a[]={12,4,8,9,15,2,20,6};
        int bigCount=0;
        int smallCount=0;
        for(int i=0;i<a.length;i++) {
            if (a[i] > 10) {
                bigCount++;
                System.out.println(a[i]);
            } else {
                smallCount++;
            }
        }
        System.out.println("Number of big number:"+bigCount);
        System.out.println("Number of small number:"+smallCount);
    }
}