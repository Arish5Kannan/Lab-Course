interface stud
{
    abstract void show();
    void hide();
    void details();
    }
interface sweet
{
    void login();
    void logout();
    void signup();
}
class SCHOOL
{
    public void sch()
    {
        System.out.println("Student Page");
    }
}
class inherit extends SCHOOL implements stud,sweet
{
    @Override
    public void show() {
        System.out.println("Click to show");
    }
    @Override
    public void hide() {
        System.out.println("Click to hide");
    }
    @Override
    public void details() {
        System.out.println("Click to get details");
    }
    @Override
    public void login() {
        System.out.println("Click to login");
    }
    @Override
    public void logout() {
        System.out.println("Click to logout");
    }
    @Override
    public void signup() {
        System.out.println("Click to signup");
    }
}
class Interfaces
{
    public static void main(String[] args)
    {
        inherit o1 = new inherit();
        o1.sch();
        o1.details();
        o1.hide();
        o1.login();
        o1.logout();
        o1.signup();
        o1.show();
    }
}