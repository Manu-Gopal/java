import graphics.*;
import java.util.*;

public class packages{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        graphics.rectangle r = new graphics.rectangle();
        graphics.square s = new graphics.square();
        graphics.triangle t = new graphics.triangle();
        graphics.circle c = new graphics.circle();

        System.out.println("Enter the required shape");
        System.out.println("1. Rectangle");
        System.out.println("2. Triangle");
        System.out.println("3. Square");
        System.out.println("4. Circle");

        int choice,l,b,h;
        double rad;
        choice=sc.nextInt();

        switch(choice){
            case 1:
                System.out.println("Enter the length : ");
                l=sc.nextInt();
                System.out.println("Enter the breadth : ");
                b=sc.nextInt();
                r.area(l,b);
                break;

            case 2:
                System.out.println("Enter the base length : ");
                b=sc.nextInt();
                System.out.println("Enter the height : ");
                h=sc.nextInt();
                t.area(b,h);
                break;

            case 3:
                System.out.println("Enter the length of the side : ");
                l=sc.nextInt();
                s.area(l);
                break;

            case 4:
                System.out.println("Enter the radius : ");
                rad=sc.nextDouble();
                c.area(rad);
                break;

            default: System.out.println("Invalid choice");
        }

    }
}