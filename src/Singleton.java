class ABC
{
    static ABC obj = null;
    private ABC(){

    }
    public static ABC display() {
        if (obj == null)
            obj = new ABC();
        return obj;
    }
    public void show()
    {
        System.out.println("Singleton class");
    }

}
class Singleton
{
    public static void main(String[] args) {
        ABC o = ABC.display();
        o.show();
        ABC o1 = ABC.display();
        o1.show();


    }
}