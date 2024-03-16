import java.util.Scanner;
import java.lang.*;
class methoduser {
    public static void main(String args[]) {
        System.out.println("Enter the integer input for Multiplication,division and modulo:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integer:");
        int a = sc.nextInt();
        System.out.println("Enter the integer:");
        int b= sc.nextInt();

        A obj = new A();
        obj.add();
        int c=obj.sub(a,b);
        System.out.println("Subtraction:"+c);
        int d=obj.mul();
        System.out.println("Multiplication:"+d);
        obj.div(a,b);
        int f=obj.mod(a,b);
        System.out.println("Modulation:"+f);


    }
}
     class A{

        public void add(){
            Scanner sc=new Scanner(System.in);
            System.out.println("Addition purpose");
            System.out.println("Enter a value:");
            int a=sc.nextInt();
            System.out.println("Enter b value:");
            int b=sc.nextInt();
            int c=a+b;
            System.out.println("Addition:"+c);

    }
        public int sub(int a,int b){
            /*Scanner sc=new Scanner(System.in);
            System.out.print("Enter a value:");
            int a=sc.nextInt();
            System.out.print("Enter a value:");
            int b=sc.nextInt();*/
            int c=a-b;
            //System.out.println("Addition:"+c);
            return c;
        }

        public void div(int a,int b){
            //Scanner sc=new Scanner(System.in);
            //System.out.println("Division purpose");
           // System.out.println("Enter a value:");
            //int a=sc.nextInt();
            //System.out.println("Enter b value:");
           // int b=sc.nextInt();
            int c=a / b;
            System.out.println(c+" is the result of Division ");

        }
        public int mul(){
            Scanner sc=new Scanner(System.in);
            System.out.println("Multiplication purpose");
            System.out.println("Enter a value:");
            int a=sc.nextInt();
            System.out.println("Enter b value:");
            int b=sc.nextInt();
            int c=a * b;
            return c;

        }
        public int mod(int a,int b) {
            /*Scanner sc=new Scanner(System.in);
            System.out.print("Enter a value:");
            int a=sc.nextInt();
            System.out.print("Enter a value:");
            int b=sc.nextInt();*/
            int c = a % b;
            //System.out.println("Addition:"+c);
            return c;
        }

}