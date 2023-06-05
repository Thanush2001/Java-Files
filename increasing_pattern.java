import java.util.Scanner;
class plus{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n=in.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1,x=1;j<=i;j++,x++){ // declare in j loop
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
