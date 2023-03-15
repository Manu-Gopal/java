import java.util.*;
public class palindrome{
    public static void main(String ar[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=s.nextInt();
        int i,rev=0,temp=n;
        while(temp>0){
            i=temp%10;
            rev=rev*10+i;
            temp=temp/10;
        }
        if(rev==n){
            System.out.println("The number is palindrome");
        }
        else{
            System.out.println("The number is not palindrome");
        }
}
}
