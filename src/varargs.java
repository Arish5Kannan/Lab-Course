class d
{
    public void printl(int... a)
    {
        for( int x:a)
        {
            System.out.print(" "+x);
        }
    }
}
class varargs
{
    public static void main(String[] args)
    {
        d o1 = new d();
        o1.printl(1,4,8,5,6,7,0,5,2,1,5,4,4);
    }
}