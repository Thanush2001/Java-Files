import java.util.Scanner;
public class Logical_operater
{
    public static void main(String[] args)
    {
     int a,b,c,d,e,f,g,h,i;
     Scanner obj=new Scanner(System.in);
     System.out.print("Enter the 8 values:");
     a=obj.nextInt();
     b=obj.nextInt();
     c=obj.nextInt();
     d=obj.nextInt();
     e=obj.nextInt();
     f=obj.nextInt();
     g=obj.nextInt();
     h=obj.nextInt();
     i=((a>b&&a>c&&a>d&&a>e&&a>f&&a>g&&a>h)?a:
             (b>c&&b>d&&b>e&&b>f&&b>g&&b>h)?b:
                     (c>d&&c>e&&c>f&&c>g&&c>h)?c:
                             (d>e&&d>f&&d>g&&d>h)?d:
                                     (e>f&&e>g&&e>h)?e:
                                             (f>g&&f>h)?f:
                                                     (g>h)?g:h);
System.out.print("Biggest values:"+i);
    }
}