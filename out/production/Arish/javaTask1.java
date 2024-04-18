class dog1
{
    String breed = "German";
    int age = 23;
    String color = "Red";
    void printAttr()
    {
        System.out.println("Breed:"+breed);
        System.out.println("Age:"+age);
        System.out.println("Color:"+color);
    }
    void bark()
    {
        System.out.println("Barking");
    }
    void sleep()
    {
        System.out.println("Sleeping");
    }
    void eat()
    {
        System.out.println("Eating");
    }

}
class dog2
{
   String breed = "Russia";
   int age = 33;
   String color = "Blue";
    void printAttr()
    {
        System.out.println("Breed:"+breed);
        System.out.println("Age:"+age);
        System.out.println("Color:"+color);
    }
   void bark()
   {
       System.out.println("Barking");
   }
   void sleep()
   {
       System.out.println("Sleeping");
   }
   void eat()
   {
       System.out.println("Eating");
   }
}
class dog3
{
    String breed = "Greece";
    int age = 63;
    String color = "Black";
    void printAttr()
    {
        System.out.println("Breed:"+breed);
        System.out.println("Age:"+age);
        System.out.println("Color:"+color);
    }
    void bark()
    {
        System.out.println("Barking");
    }
    void sleep()
    {
        System.out.println("Sleeping");
    }
    void eat()
    {
        System.out.println("Eating");
    }
}

class dog4
{
    String breed = "france";
    int age = 73;
    String color = "Brown";
    void printAttr()
    {
        System.out.println("Breed:"+breed);
        System.out.println("Age:"+age);
        System.out.println("Color:"+color);
    }
    void bark()
    {
        System.out.println("Barking");
    }
    void sleep()
    {
        System.out.println("Sleeping");
    }
    void eat()
    {
        System.out.println("Eating");
    }
}

class javaTask1
{
    public static void main(String[] args) {
        System.out.println("*******Java Task 1******");
        System.out.println("\t****Dog1****");
        dog1 s = new dog1();
        s.printAttr();
        s.bark();
        s.eat();

        System.out.println("\t****Dog2****");
        dog2 t = new dog2();
        t.printAttr();
        t.bark();
        t.eat();
        t.sleep();
        System.out.println("\t****Dog3****");
        dog3 p = new dog3();
        p.printAttr();
        p.bark();
        p.eat();
        p.sleep();
        System.out.println("\t****Dog4****");
        dog4 q = new dog4();
        q.printAttr();
        q.bark();
        q.eat();
        q.sleep();

    }
}