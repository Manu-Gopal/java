import java.util.Scanner;
public class search{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter the number of elements of the array : ");
    int n=sc.nextInt();

    System.out.println("Enter the elements of the array : ");
    int []ar=new int [n];

    for(int i=0;i<ar.length;i++){
        ar[i]=sc.nextInt();
    }
    System.out.println("Enter the element to search : ");
    int num=sc.nextInt();
    int f=-1;
    
    for(int i=0;i<ar.length;i++){
        if(ar[i]==num){
            f=i+1;
            break;
        }
    }
    if(f>-1){
        System.out.println(num+" is found at position "+f);
    }
    else{
        System.out.println(num+"not found");
    }
}
}