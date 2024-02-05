import java.util.*;

public class jagged1 {
    public static void main(String[] args) {
        int a[][], n, m, i, j;

        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter number of Rows:");
        n = s1.nextInt(); 

        a = new int[n][]; 

        for (i = 0; i < n; i++) {
            System.out.println("Enter Number of cols:");
            m = s1.nextInt(); 
            a[i] = new int[m]; 
        }

       
        for (i = 0; i < n; i++) {
            for (j = 0; j < a[i].length; j++) {
                System.out.println("Enter value for a=" + i + "-" + j );
                a[i][j] = s1.nextInt(); 
            }
        }

       
        System.out.println("Array:");
        for (i = 0; i < n; i++) {
            for (j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}
