import java.util.Scanner;

public class one_array
{
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40, 50}; //Ascending order
        System.out.println(a[3]);

        for (int i = 0; i < a.length; i++)    // print all element using for loop
        {
            System.out.println(a[i]);
        }

        for (int element : a)         // print all element using enhanced for loop
        {
            System.out.println(element);
        }

        int b[];               //Declaring array
        b = new int[10];         //Allocating memory to array
        int c[] = new int[10];  //Combining both statement
        for(int element:b)
        {
            System.out.println(element);
        }
        for (int i=0;i<2;i++)
        {
            Scanner in= new Scanner(System.in);
            System.out.println("Enter the number:");
            c[i]=in.nextInt();
        }
        for(int element:c)
        {
            System.out.print(element);
        }
    }
}
