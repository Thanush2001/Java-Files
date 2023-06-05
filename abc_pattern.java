public class abc_pattern
{
    public static void main(String[] args)
    {
        int a=65,i,j;
        for(i=6;i>=1;i--)
        {
            for(j=1;j<i;j++)
            {
                System.out.print((char)a);
                a++;
            }
            System.out.println();
        }
    }
}
