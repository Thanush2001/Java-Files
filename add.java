import java.util.*;
public class add
{
    // with-with
    /*static int kiran(int x,int y)
    {
        return(x+y);
    }
    public static void main(String[] args) {
        int a,b,c;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the 2 values");
        System.out.print("Enter the a value:");
        a=obj.nextInt();
        System.out.print("Enter the b value:");
        b=obj.nextInt();
        c=kiran(a,b);
        System.out.println("Sum="+c);
        // object
        int c;
        add obj=new add();
        c=obj.kiran(12,5);
        System.out.println("Sum="+c);

        // static
        c=add.kiran(23,5);
        System.out.println("Sum="+c);*/

    //without-with (or) return type without arguments
    /*public static void main(String[] args)
    {
        *//*int c;
        c=kiran();
        System.out.print("Sum="+c);*//*
        // object
        int c;
        add obj=new add();
        c=obj.kiran();
        System.out.println("Sum="+c);

        // static
        c=add.kiran();
        System.out.println("Sum="+c);
    }
    static int kiran()
    {
        int a,b;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the 2 value");
        System.out.print("Enter the a value:");
        a=obj.nextInt();
        System.out.print("Enter the b value:");
        b=obj.nextInt();
        return(a+b);
    }
*/

    /*// without-without
    static void kiran()
    {
        int a,b;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the 2 values");
        System.out.print("Enter the a value:");
        a = obj.nextInt();
        System.out.print("Enter the b value:");
        b = obj.nextInt();
        System.out.print("Sum="+(a+b));
    }
    public static void main(String[] args)
    {
        kiran();
    }*/

    // with-without (or) no return with argument
    static void kiran(int x,int y)
    {
        System.out.println("Sum="+(x+y));
    }
    public static void main(String[] args)
    {
        /*int a, b;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the 2 values");
        System.out.print("Enter the a value:");
        a = obj.nextInt();
        System.out.print("Enter the b value:");
        b = obj.nextInt();
        kiran(a,b);*/

        // object
        add obj=new add();
        obj.kiran(12,3);

        //Static
        add.kiran(4,6);

    }
}
