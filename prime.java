import java.util.*;
public class prime {
    public static void main(String ar[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=s.nextInt();
        int i=1,p,f=0;
        while(i<=n){
            p=n%i;
            if(p==0){
                f++;
            }
            i++;
        }
        if(f==2){
            System.out.println("The number is prime");
        }
        else{
            System.out.println("The number is not prime");
        }
    }
}
