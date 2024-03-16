class ADD
{
    int a,b;
    ADD(int x,int y)
    {
        this.a = x;
        this.b = y;
    }
    public void print()
    {
        System.out.println("*******************************");
        System.out.println("Sum : "+(a+b));
        System.out.println("*******************************");
    }
}
public class object
{
    public static void main(String[] args)
    {
        ADD[] o = new ADD[3];
        o[0]= new ADD(2,3);
        o[1]= new ADD(4,5);
        o[2] = new ADD(3,7);
        for (int i=0;i<o.length;i++)

            o[i].print();

    }
}