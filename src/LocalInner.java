import static java.lang.System.*;

class outercls
{
    public void display()
    {
        class localcls
        {
            int a = 10;
            public void  innerfunc()
            {

                out.println("Inner class called"+" A : "+a);
            }
        }
        localcls o1 = new localcls();
        o1.innerfunc();
    }
}
class LocalInner
{
    public static void main(String[] args) {
        outercls o = new outercls();
        o.display();
    }
}