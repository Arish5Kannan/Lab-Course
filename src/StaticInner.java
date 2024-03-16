 class outerClass
{
    static int a = 10;
    static int b = 16;
    static class innerClass
    {
        public void show()
        {
            System.out.println("Value of a:"+a);
            System.out.println("Value of b:"+b);
            System.out.println("Static inner class");
        }
    }

}
class StaticInner
{
    public static void main(String[] args) {
        outerClass.innerClass i =  new outerClass.innerClass();
        i.show();
    }
}