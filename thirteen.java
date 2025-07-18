// 2). MultiDimensional Array

// Matrix - Row and Coloumn
import java.util.*;
public class thirteen {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Matrix : ");

        int [][]a = new int[2][2];


        // Input

        for(int i=0; i<a.length; i++){   // Row


            for(int j=0; j<a.length; j++){   // Coloumn


                a[i][j] = sc.nextInt();
            }
        }

        // Output


        System.out.println("Matrix : ");
        for(int i=0; i<a.length; i++){   // Row


            for(int j=0; j<a.length; j++){   // Coloumn


                System.out.print(a[i][j]+" ");
            }

            System.out.println();
        }


        // H.W

        // Q1). 6 x 6 Matrix ?






        
    }
    
}
