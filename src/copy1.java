import java.util.Scanner;
class sum
{
    int a,b;
    sum(int x,int y)
    {
        this.a = x;
        this.b = y;
    }

    public sum(sum o) {
        this.a = o.a;
        this.b = o.b;
    }

    public void print()
    {
        System.out.println("Sum : "+(a+b));
    }
}
 class copy1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        sum o = new sum(a,b);
        sum o1 = new sum(o);
        o1.print();
    }
}