// 4). Hybrid Inheritance

// Theory

/*
 *   Dadaji              
 *     |
 *     v
 *   Papaji
 *     |
 *     v    
 *    Me     
 * 
 *    ....... Repeat this cycle Infinity
 */


class A{

    public void dadajii(){

        System.out.println("Dadajii");
    }
}

class B extends A{

    public void papaji(){

        System.out.println("Papajii");
    }
}



public class seventh_oops extends B{

    public void me(){

        System.out.println("Me");
    }

    public static void main(String[] args) {

        seventh_oops obj = new seventh_oops();

        obj.dadajii();
        obj.papaji();
        obj.me();
        
    }
    
}
