class ax
{
    public void sUM(int a,int b)
    {
        System.out.printf("\nSum of %d and %d is %d",a,b,a+b);
    }
}
class SUB extends ax
{
    public void Sub(int a,int b)
    {
        System.out.printf("\nSubtraction of %d and %d is %d",a,b,a-b);
    }
}
class MUL extends SUB
{
    public void mul(int a,int b)
    {
        System.out.printf("\nMultiplication of %d and %d is %d",a,b,a*b);
    }
}
class Div extends MUL
{
    public void div(int a,int b)
    {
        System.out.printf("\nDivision of %d and %d is %d",a,b,a/b);
    }
}
class MOD extends Div
{
    public void mod(int a,int b)
    {
        System.out.printf("\nModulus of %d and %d is %d",a,b,a%b);
    }
}
class Arithmetic extends MOD
{
    public void arith()
    {
        System.out.println("Arithmetic operations are:");
    }
}
class multiinheritance
{
    public static void main(String[] args)
    {
        Arithmetic obj = new Arithmetic();
        obj.arith();
        obj.mod(3,7);
        obj.div(7,8);
        obj.mul(8,9);
        obj.sUM(3,90);
        obj.Sub(6,32);
        MUL obj1 = new MUL();
        obj1.mul(9,3);
        obj1.Sub(7,8);
        obj1.sUM(5,3);
    }
}