// 2). Polymorphism - English : Single Actions in different ways.

// Hindi : Naam ek kaam alag alag.


// Type 

// 1). Compile Time
// 2). Run Time


// 1). Compile Time Or Topic : Method Overloading Same

public class third_oops {

    public void kabir(){

        System.out.println("Company : Software Engineer");
    }

    public void kabir(String a){   // String a : Parameter

        System.out.println("Home : "+a);


    }

    public void kabir(String b, String c){   // String b and c : Parameter

        System.out.println("College : "+b+" "+c);
    }



    public static void main(String[] args) {



        third_oops obj = new third_oops();


        obj.kabir();
        obj.kabir("Son");
        obj.kabir("Friend","Student");

        


        
    }
    
}
