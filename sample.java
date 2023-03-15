import java.util.*;
public class sample{
    public static void main(String ar[]){
        try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter a string");
                String n=sc.next();
                int l=n.length();

                char[] s1 = new char[l]; 
                char[] s2 = new char[l];

                s2=n.toCharArray();
                int j=0;
                for(int i=l-1;i>=0;i--)
                {
                    s1[j] = s2[i];
                    j++;
                }
                    int f=0;
                for(int i=0;i<l;i=i+1)
                {
                    if (s1[i]==s2[i])
                    {
                        f=f+1;
                    }
                }
                if (f==l)
                    System.out.println("palindrome");
                else
                    System.out.println("not palidrome");
                sc.close();
         
        } 
        catch(Exception e)
        {
            System.out.println(e);
        }
           
    }
}