import java.lang.*;
class toogle{
    public static void main(String[] args)
    {
        StringBuilder a = new StringBuilder("TutoJOEs can UNDERstand the ConCEPTS of GK Questions");
        System.out.println("Original string:"+a);
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)>=97&&a.charAt(i)<=122)
            {
                int c= (int)a.charAt(i)-32;
                a.setCharAt(i,(char)c);
            }
            else if(a.charAt(i)>=65&&a.charAt(i)<=90)
            {

                int c= (int)a.charAt(i)+32;
                a.setCharAt(i,(char)c);
            }
        }
       System.out.println("ToGGleD string:"+a);
    }
}