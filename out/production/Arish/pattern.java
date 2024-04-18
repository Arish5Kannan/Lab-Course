import java.util.*;
class ForwardReverse{
    public void printF()
    {
        System.out.print("\n-----Pattern Printing-Forward----");
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the number of rows: ");
        int rows = sc.nextInt();
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public void printR()
    {
        System.out.print("\n------Pattern Printing-Reverse------");
        Scanner sc = new Scanner(System.in);
        int rows;
        System.out.print("\nEnter the number of rows: ");
        rows = sc.nextInt();
        for(int i=rows;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
class pattern{
    public static void main(String[] args) {
        System.out.print("------Pattern Printing------");
        ForwardReverse o = new ForwardReverse();
        o.printF();
        o.printR();
    }
}