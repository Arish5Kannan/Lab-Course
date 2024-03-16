interface interDemo
{
    public static int sum(int a ,int b)
    {
        return a+b;
    }
    final static int a = 10;
}
class Interface1
{
    public static void main(String[] args)
    {
        System.out.println("Sum of 2 and 7:"+interDemo.sum(2,7));
        System.out.println("Value of a:"+interDemo.a);
    }
}