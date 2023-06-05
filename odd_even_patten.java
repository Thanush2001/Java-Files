import java.util.Scanner;
class odd_even_patten{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n=in.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i%2==0)
                    System.out.print("2 ");
                else
                    System.out.print("1 ");
            }
            System.out.println();
        }}}
