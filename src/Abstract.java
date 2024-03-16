abstract class Venomous
{
    abstract void drop();
    public void msg()
    {
        System.out.println("Dont spill your vengeance in the new year");
    }
}
class pro extends Venomous
{

    @Override
    void drop() {
        System.out.println("Hii I am abstract from the base class");
    }
}
class Abstract
{
    public static void main(String[] args)
    {
        pro o = new pro();
        o.drop();
        o.msg();
    }
}