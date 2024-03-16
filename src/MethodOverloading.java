class Mathop
{
    public int multiply(int a,int b)
    {
        return a*b;
    }
    public float multiply(float a,float b)
    {
        return a*b;
    }
    public double multiply(double a,double b)
    {
        return a*b;
    }
    public boolean multiply(float a,int b)
    {
        return a==b;
    }
    public short multiply(byte a, byte b)
    {
        return (short) (a*b);
    }
}
class MethodOverloading
{
    public static void main(String[] args)
    {
        Mathop o = new Mathop();

        System.out.println("Returned value:"+o.multiply(160,170));
        System.out.println("Returned value:"+o.multiply(8.78f,4));
        System.out.println("Returned value:"+o.multiply(8.7767,4.8796));
        System.out.println("Returned value:"+o.multiply(8.5f,4.6f));
        System.out.println("Returned value:"+o.multiply(8,4));
        System.out.println();
    }
}