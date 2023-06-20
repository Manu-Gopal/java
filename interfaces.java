import java.util.*;

interface Shape{
    double area();
    double perimeter();
}

class Circle implements Shape{
    double radius;

    Circle(double radius){
        this.radius=radius;
    }

    public double area(){
        return 3.14 * radius * radius;
    }

    public double perimeter(){
        return 2 * 3.14 * radius;
    } 
}

class Rectangle implements Shape{
    double length;
    double breadth;

    Rectangle(double length, double breadth){
        this.length=length;
        this.breadth=breadth;
    }

    public double area(){
        return length * breadth;
    }

    public double perimeter(){
        return 2 * (length + breadth);
    }
}

public class interfaces{
    public static void main(String[] args){

        int choice;
        double radius, length, breadth, result;

        do{
            System.out.println("MENU");
            System.out.println("1. Find area and perimeter of circle.");
            System.out.println("2. Find area and perimeter of rectangle.");
            System.out.println("3. Exit");
            System.out.println();
            System.out.println("Enter the choice : ");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            
            switch(choice){

                case 1 : 
                    System.out.println("Enter the radius of the circle : ");
                    radius = sc.nextDouble();
                    Circle c = new Circle(radius);
                    result = c.area();
                    System.out.println("Area : " + result);
                    result = c.perimeter();
                    System.out.println("Perimeter : " + result);
                    System.out.println();
                    break;

                case 2 :
                    System.out.println("Enter the length of the rectangle : ");
                    length = sc.nextDouble();
                    System.out.println("Enter the breadh of the rectangle : ");
                    breadth = sc.nextDouble();
                    Rectangle r = new Rectangle(length, breadth);
                    result = r.area();
                    System.out.println("Area : " + result);
                    result = r.perimeter();
                    System.out.println("Perimeter : " + result);
                    System.out.println();
                    break;

                case 3 :
                    System.out.println("Exiting the program.");
                    break;

                default : 
                    System.out.println("Invalid choice.");
                    break;

            }

        }while(choice != 3);
        
    }

}