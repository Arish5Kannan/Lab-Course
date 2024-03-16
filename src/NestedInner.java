class outer
{
    int a = 78;
    class inner
    {
        int b=90;
        public void innerfunc()
        {
            System.out.println("A : "+a);
            System.out.println("B : "+b);
            outerfunc();
        }
    }
    public void outerfunc()
    {
        System.out.println("A*A is "+a*a);
        //inner o = new inner();
        //o.innerfunc();
    }
}
public class NestedInner
{
    public static void main(String[] args)
    {
        outer o = new outer();
        o.outerfunc();
        outer.inner o1 = new outer().new inner();
        o1.innerfunc();
    }
}