import java.util.*;

class negative extends Exception{
    negative(String neg){
        System.out.println(neg);
    }
}

public class Exception_Average {
    public static void main(String[] args){
        int count,sum=0,num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number count : ");
        count = sc.nextInt();
        for(int i = 0;i<count;i++){
            System.out.println("Enter the numbers : ");
            num = sc.nextInt();
            if(num<0){
                try{
                    throw new negative("Its a negative number");
                }
                catch(negative e){
                    System.out.println(("Exception handled"));
                }
                i--;
            }
            else{
                sum = sum + num;
            }

        }
        double avg = sum/count;
        System.out.println("The Average is " + avg);
    }
}
