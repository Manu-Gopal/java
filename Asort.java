import java.util.*;

public class Asort
{
    Scanner sc = new Scanner(System.in);
    int []ar = new int [7];

    void read_Array()
    {
        System.out.println("enter the elements of the array : ");
        for(int i=0;i<ar.length;i++)
        {
            ar[i] = sc.nextInt();
        }
    }
 
            // Swap the found minimum element with the first
            // element
    void print_Array()
    {
        System.out.println("\n array : ");
        for(int x:ar)
        {
            System.out.println(x);
        }
    }


    void sort_Array()
    {
        int n = ar.length;
        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (ar[j] < ar[min_idx])
                    min_idx = j;

            int temp = ar[min_idx];
            ar[min_idx] = ar[i];
            ar[i] = temp;
        }
    }

    public static void main(String args[]) {
        Asort a = new Asort();
        a.read_Array();
        System.out.println("\n before sorting array : ");
        a.print_Array();
        a.sort_Array();
        System.out.println("\n after sorting array : ");
        a.print_Array();

    }
}