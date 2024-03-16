//import java.lang.*;
import java.util.Scanner;
import java.util.Arrays;
  class B{
    public static int[]  sortfunction ()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit:");
        int n = sc.nextInt();
        int a[] =new int[n];
       System.out.println("Enter array elements:");
       for(int i=0;i<n;i++)
       {
           a[i]=sc.nextInt();
       }
       Arrays.sort(a);
       return a;
    }
}
/*class perfect{
      public static int square(int n){
          int mul=n,res=1,a=2;
       for(int i=1;i<=a;i++){
           res=res*mul;
       }



       return res;
      }
}*/
public class function_array {
    public static void main(String args[]) {

        B obj = new B();
        int a[] = obj.sortfunction();
        System.out.println("Sorted array:"+Arrays.toString(a));
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no to find Square:");
        int b=sc.nextInt();
        System.out.println("Square of "+ b +" : "+perfect.square(b));*/

    }
}