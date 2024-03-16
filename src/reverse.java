import java.lang.*;
import java.util.Scanner;
public class reverse {
    public static void main(String args[])
    {

        int i;
        boolean printed=false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int n = sc.nextInt();

      int  a[] =  new int[n];
        System.out.println("Enter the integers:");
        for(i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        for(i=n-1;i>=0;i--)
        {
            if(a[i]%2==0)
            {
                System.out.println(a[i]);
                 printed=true;
            }
        }
        if(printed==false)
        {
            System.out.println("-1");
        }
    }


}
