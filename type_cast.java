public class type_cast
{
    public static void main(String[] args)
    {
     int a=10;
     float b=a; // implicit
     float y1=(float)a; // explicit
     System.out.println("Value of a(int)="+a);
        System.out.println("Value of b(float)="+b);
        System.out.println("Value of y1(float)="+y1);
        System.out.println(".................................");
        float x=10.35f;
        int y=(int)x;
        System.out.println("Value of x(float)="+x);
        System.out.println("Value of y(int)="+y);
        System.out.println(".................................");

        char ch='A';
        int z=ch;
        System.out.println("Value of ch(char)="+ch);
        System.out.println("Value of z(int)="+z);
        System.out.println(".................................");

        int x1=97;
        char ch1=(char)x1;
        System.out.println("Value of x1(int)="+x1);
        System.out.println("Value of ch1(char)="+ch1);
    }
}
