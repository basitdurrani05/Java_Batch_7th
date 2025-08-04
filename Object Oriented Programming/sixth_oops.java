// 3). Multilevel Inheritance


// Theory

/*
 *   Dadaji
 *     |
 *     v
 *   Papaji
 *     |
 *     v
 *    Me
 */


class A{

    public void dadaji(){

        System.out.println("DadaJii...");
    }
}


class B extends A{


    public void papaji(){

        System.out.println("Papajii");
    }

}

public class sixth_oops extends B {

    public void khan(){

        System.out.println("Me");
    }


    public static void main(String[] args) {


        sixth_oops obj = new sixth_oops();

        obj.dadaji();
        obj.papaji();
        obj.khan();


        
    }
    
}
