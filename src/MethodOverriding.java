 class Multiply
 {
     int a,b,c;
     Multiply(int a,int b,int c)
     {
         this.a = a;
         this.b = b;
         this.c = c;
     }
     public void pr()
     {
         System.out.println("Addition of three numbers:"+(a+b+c));

     }
 }
 class Multiply2 extends Multiply
 {
     Multiply2(int a,int b,int c)
     {

         super(a,b,c);
     }
     public void pr()
     {
         System.out.println("Addition of three numbers:"+(a+b+c));
         System.out.println("Subtraction of three numbers:"+(a-b-c));
         System.out.println("Multiplication of three numbers:"+(a*b*c));
         System.out.println("Division of three numbers:"+(a/b/c));
         System.out.println("Modulus of three numbers:"+(a%b%c));
     }
 }
 class MethodOverriding
 {
     public static void main(String[] args)
     {
         Multiply2 o = new Multiply2(2,5,9);
         o.pr();
         System.out.println("");
         Multiply2 o1 = new Multiply2(16,2,3);
          o1.pr();
     }
 }