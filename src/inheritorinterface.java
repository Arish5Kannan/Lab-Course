interface demo1
{
    void hw();
    void Hw();
    void gm();
}
interface demo2 extends demo1
{
    void ge();
    void ga();
    void gn();
}
class dim implements demo2
{

    @Override
    public void hw() {
        System.out.println("Hello World!");
    }

    @Override
    public void Hw() {
        System.out.println("Hello world!!!");
    }

    @Override
    public void gm() {
        System.out.println("Good Morning");
    }

    @Override
    public void ge() {
        System.out.println("Good Evening");
    }

    @Override
    public void ga() {
        System.out.println("Good Afternoon");
    }

    @Override
    public void gn() {
        System.out.println("Good Night");
    }
}
class inheritorinterface
{
    public static void main(String[] args)
    {
        dim o1 = new dim();
        o1.ga();
        o1.hw();
        o1.ge();
        o1.Hw();
        o1.gn();
        o1.gm();
    }
}
