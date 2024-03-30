import java.util.*;
public class charpattern{
    public static void main(String[] args)
    {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        int c = 0;
        for(int i=1;i<=a;i++)
        {
            c++;
            for(int j=1;j<=a;j++)
            {


                System.out.print("*  ");

            }
            System.out.println();
        }

    }
}