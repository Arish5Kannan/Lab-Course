abstract class first
{
    abstract public void show();
}
class out
{
  public void display()
  {
      first o = new first() {
          @Override
          public void show() {
              System.out.println("Anonymous inner class");
          }
      };
    o.show();
  }
}
class AnonymousInner
{
    public static void main(String[] args) {
        out o1 = new out();
        o1.display();
    }
}