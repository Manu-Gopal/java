import java.util.*;
class Madd {
    Scanner sc = new Scanner(System.in);
    int [][]ar1 = new int[3][3];
    int [][]ar2 = new int[3][3];
    int [][]ar3 = new int[3][3];


    void readArray()
    {
        System.out.println("Enter the elements of 1st matrix : ");
        for(int i=0;i<ar1.length;i++)
        {
            for(int j=0;j<ar1.length;j++)
            {
                ar1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the elements of 2nd matrix : ");
        for(int i=0;i<ar1.length;i++)
        {
            for(int j=0;j<ar1.length;j++)
            {
                ar2[i][j]=sc.nextInt();
            }
        } }
    void addArray()
    {
        System.out.println("Matrix after adding : ");
        
        for(int i=0;i<ar1.length;i++)
        {
            System.out.print("[");

            for(int j=0;j<ar1.length;j++)
            {
                ar3[i][j]=ar1[i][j]+ar2[i][j];
                System.out.print(" "+ar3[i][j]);
            }
            System.out.print("]\n");
        }
        
    }
    public static void main(String args[])
    {
        Madd m= new Madd();
        m.readArray();
        m.addArray();
    }
}
