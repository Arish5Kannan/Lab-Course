import java.util.*;
class v
{
    public static void sum(int a,int b)
    {

        System.out.printf("Sum of %d and %d is %d",a,b,a+b);
    }
}
class Vin extends v
{
    public static void print(int a,int b)
    {

        System.out.printf("\nMultiply of %d and %d is %d",a,b,a*b);
    }
}
class single
{
    public static void main(String[] args)
    {
        Scanner  sc = new Scanner(System.in);
        Vin o = new Vin();
        o.sum(7,8);
        o.print(9,4);
    }
}