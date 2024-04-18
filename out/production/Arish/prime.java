class prime_no{
    void printN(){
        System.out.print("Prime numbers from 1 to 100:");

        for(int i=1;i<=100;i++)
        {
            int c = 0;
            int k = 1;
            while(k<=i){
                if(i%k==0)
                {
                    c++;
                }
                k++;
            }
            if(c==2)
            {
                System.out.print(i+" ");
            }
        }
    }
    void printR(){
        System.out.print("Prime numbers from 100 to 1 :");

        for(int i = 100; i>=1; --i)
        {
            int c = 0;
            int k = 1;
            while(k<=i){
                if(i%k==0)
                {
                    c++;
                }
                k++;
            }
            if(c==2)
            {
                System.out.print(i+" ");
            }
        }
    }
}
public class prime {
    public static void main(String[] args) {
        prime_no o = new prime_no();
        o.printN();
        System.out.println("");
        o.printR();
    }
}
