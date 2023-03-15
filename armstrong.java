import java.util.*;
public class armstrong {
    public static void main(String ar[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=s.nextInt();
        int a,temp=n,p=0;
        while(temp>0){
            a=temp%10;
            p=p+a*a*a;
            temp=temp/10;
        }
        if(p==n){
            System.out.println("The number is armstrong");
        }
        else{
            System.out.println("The number is not armstrong");
        }
    }
}
