// Topic : Switch Case : EK BAAR MAI BOHOT SAARE CASE LAE LETA HAI.


// Home Work

// a^2   - a square
// a^3    - a cube


import java.util.*;
public class tenth {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st Number : ");
        int a = sc.nextInt();

        System.out.println("Enter 2nd Number : ");
        int b = sc.nextInt();

        System.out.println("Enter Opeartion : \n1).Add\n2).Sub\n3).Mul\n4)Div\n5).Mod");
        int result = sc.nextInt();  // 1   2   3   4   5

        switch(result){    // 1   2   3    4    5

            case 1:
            result = a+b;
            System.out.println("Addition : "+result);
            break;

            case 2:
            result = a-b;
            System.out.println("Subtraction : "+result);
            break;

            case 3:
            result = a*b;
            System.out.println("Multiplication : "+result);
            break;

            case 4:
            result = a/b;
            System.out.println("Divide : "+result);
            break;

            case 5:
            result = a%b;
            System.out.println("Modulo : "+result);
            break;


            
           
        }
        
    }
    
}
