class fruits
{
    static
    {
        System.out.println("static blocks in fruit class");
        System.out.println("Block-3");
    }
    static
    {
        System.out.println("Block-4");
    }
    public void show()
    {
        System.out.println("Static Block");
    }
    static
    {
        System.out.println("Block-5");
    }
}
class staticblock
{
    static {
        System.out.println("Main static block");
        System.out.println("Block-1");
    }

    public static void main(String[] args) {
        System.out.println("Main method");
        fruits o = new fruits();
        o.show();
    }
    static {
        System.out.println("Block-2");
    }
}