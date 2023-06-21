import java.util.*;

class tooYoung extends Exception{
    tooYoung(String msg){
        System.out.println(msg);
    }
}

class tooOld extends Exception{
    tooOld(String msg){
        System.out.println(msg);
    }
}

class Exception_test{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("Enter the age : ");
        age = sc.nextInt();
        if(age > 60){
            try{
                throw new tooOld("Too old");
            }
            catch(tooOld e){
                System.out.println("Age over");
            }
        }
    }
}