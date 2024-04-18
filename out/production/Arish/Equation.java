import java.lang.*;
import java.util.*;
class Equatio {
   int a,b;
     Equatio(int a,int b){
         this.a = a;
         this.b = b;
     }
     public void Eq()
     {
         // (a+b)^3 = a^3 + 3a^2b + 3b^2 + b^3
         int Rhs = (int)Math.pow(a , 3) + 3*(int)Math.pow(a,2)*b + 3*a*(int)Math.pow(b,2) + (int)Math.pow(b,3);
         System.out.println("RHS:  "+Rhs);
         int Lhs = ((int)Math.pow((a+b),3) );
         System.out.println("LHS : "+Lhs);
         if(Lhs == Rhs)
         {
             System.out.println("Equation Proved => LHS("+Lhs+") = RHS("+Rhs+")");
         }
     }
}
public class Equation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.print("Enter a value: ");
        a = sc.nextInt();
        System.out.print("Enter b value: ");
        b = sc.nextInt();
        Equatio o = new Equatio(a,b);
        o.Eq();
    }
}