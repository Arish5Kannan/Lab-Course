class enumeration
{
    enum Options
    {
        CLOSE,
        OPEN,
        MINIMIZE,
        MAXIMIZE;
    }

    public static void main(String[] args) {
        Options a = Options.CLOSE;
        System.out.println("A:"+a);
        switch (a) {
            case CLOSE -> System.out.println("Close level");
            case OPEN -> System.out.println("Open level");
            case MINIMIZE -> System.out.println("Minimize level");
            case MAXIMIZE -> System.out.println("Maximize level");
        }
    }
}