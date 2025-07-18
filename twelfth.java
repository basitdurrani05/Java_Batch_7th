// Array

// User Input 

// 1). One Dimensional

import java.util.Scanner;

public class twelfth {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);   // Input

        System.out.println("Enter Array Elements : ");
        int []a = new int[5];


        // Input

        for(int i=0; i<a.length; i++){

            a[i] = sc.nextInt();  // a - array variable 
                                  // i - loop variable
                                  // sc  - input varible
                                  // integer input - nextInt()
        }

        // Print

        System.out.println("This Is a Output : ");
        for(int i=0; i<a.length; i++){

            System.out.println(a[i]);
        }


        // H.W

        // Q1). Input 10 Elements
        // Q2). Input 100 Elements
        // Q3). Input 1000 Elements
        // Q4). Input 7 Elements
        // Q5). Print Array Elements. {1000,230,924,550}


        
    }
    
}
