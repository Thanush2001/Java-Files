import java.util.Scanner;
public class abcd
{
    protected int rno, m[] = new int[10], tot;
    protected String name;
    protected float avg;
    Scanner sc = new Scanner(System.in);
    void get1()
    {
        System.out.print("Enter the roll no:");
        rno = sc.nextInt();
        System.out.print("Enter the name:");
        name = sc.next();
    }
}
class chan extends abcd
{
    int i;
    void get2()
    {
        int s=0;
        System.out.println("Enter the marks:");
        for (i=0;i<5;i++)
        {
            m[i]=sc.nextInt();
            s=s+m[i];
        }
        tot=s;
        avg=tot/5;
    }
    void show()
    {
        System.out.println(rno+" "+name);
        System.out.println("Total:"+tot);
        for(i=0;i<5;i++)
        {
            System.out.println("Marks:"+m[i]);
        }
        System.out.println("Average:"+avg);
    }
}
class appu
{
    public static void main(String[] args)
    {
        chan obj= new chan(); // pqr is called because of pqr extends abcd
        obj.get1();
        obj.get2();
        obj.show();
    }
}

