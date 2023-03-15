import java.util.*;
class fibonacci{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int a = 0,b=1,c;
        if(n==1){
            System.out.println(a);
        
        }
        else{
            int i=0;
            while(i<n){
                System.out.println(a);
                c=a+b;
                a=b;
                b=c;
                i++;
            }
        }
    }
}