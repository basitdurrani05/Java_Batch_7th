// 4). Abstraction

// Answer : Hiding the implementation


abstract class A{

    abstract public void car();
    
}


public class tenth_oops extends A {

    public void car(){

        System.out.println("This is a Super Car........");
    }

   

    public static void main(String[] args) {


        tenth_oops obj = new tenth_oops();

        obj.car();
        
    }
    
}
