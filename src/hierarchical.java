class arith
{
    int a,b;
    public void prin()
    {
        System.out.println("Arithmetic operations are: ");
    }
}
class s1 extends arith
{
    s1(int a,int b){
        this.a = a;
        this.b = b;
    }
    public void h1()
    {
        System.out.printf("\nAddition of %d and %d is %d",a,b,a+b);
    }
}
class s2 extends arith
{
    s2(int a,int b){
        this.a = a;
        this.b = b;
    }
    public void h2()
    {
        System.out.printf("\nSubtraction of %d and %d is %d",a,b,a-b);
    }
}
class s3 extends arith
{
    s3(int a,int b){
        this.a = a;
        this.b = b;
    }
    public void h3()
    {
        System.out.printf("\nMultiplication of %d and %d is %d",a,b,a*b);
    }
}
class s4 extends arith
{
    s4(int a,int b){
        this.a = a;
        this.b = b;
    }
    public void h4()
    {
        System.out.printf("\nModulus of %d and %d is %d",a,b,a%b);
    }
}
class s5 extends arith
{
    s5(int a,int b){
        this.a = a;
        this.b = b;
    }
    public void h5()
    {
        System.out.printf("\nDivision of %d and %d is %d",a,b,a/b);
    }
}
class hierarchical
{
    public static void main(String[] args)
    {
        arith obj = new arith();
        obj.prin();
        s1 o1 = new s1(7,5);
        o1.h1();
        s2 o2 = new s2(7,10);
        o2.h2();
        s3 o3 = new s3(7,6);
        o3.h3();
        s4 o4 = new s4(7,34);
        o4.h4();
        s5 o5 = new s5(7,4);
        o5.h5();

    }
}