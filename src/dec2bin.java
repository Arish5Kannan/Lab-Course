import java.util.Scanner;
public class dec2bin{
    public void dec_bin(int n)
    {
        int a[]=new int[10];
        int i=0;
        while(n>0)
        {
            a[i]=n%2;
            n/=2;
            i++;
        }

        System.out.print("\nBinary number: ");
        for(int j=i-1;j>=0;j--)
        {
            System.out.print(a[j]);
        }
    }
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the decimel number:");
       int n=sc.nextInt();
       dec2bin obj = new dec2bin();
       obj.dec_bin(n);

    }
}
