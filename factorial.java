import java.util.*;
public class factorial {
    public static void main(String ar[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=s.nextInt();
        int i,f=1;
        for(i=1;i<=n;i++){
            f=f*i;
        }
        System.out.println("Factorial of the number is "+f);
    }
}
