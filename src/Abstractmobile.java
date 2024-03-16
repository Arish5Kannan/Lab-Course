abstract class mobile
{
    void voiceCall()
    {
        System.out.println("You can make voice call");
    }
    abstract void Camera();
    abstract void Display();
}
class Samsung extends mobile
{
    void finger()
    {
        System.out.println("Fast finger print sensor");
    }

    @Override
    void Camera() {
        System.out.println("3.5 mega pixels camera");
    }

    @Override
    void Display() {
        System.out.println("7.8 Display Screen");
    }
}
class Nokia extends mobile
{


    @Override
    void Camera() {
        System.out.println("8.5 mega pixels camera");
    }

    @Override
    void Display() {
        System.out.println("10.8 Display Screen");
    }
}
class Abstractmobile
{
    public static void main(String[] args)
    {
        Nokia o2 = new Nokia();
        o2.Display();
        o2.Camera();
        o2.voiceCall();
        Samsung o1 = new Samsung();
        o1.Camera();
        o1.Display();
        o1.finger();
        o1.voiceCall();
    }
}