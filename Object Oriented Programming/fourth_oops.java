// 2). Run Time or Topic : Method Overriding

class A{    // 1st Company

public void kabir(){

    System.out.println("Company : FrontEnd Developer , TIMING 10:00 AM TO 5:00 PM");
}


}

public class fourth_oops extends A{   // 2nd Company


    @Override
    public void kabir(){

        System.out.println("Buisness : TIMING 8:00 PM TO 11:00 PM");
    }



    public static void main(String[] args) {   // Main gate

        fourth_oops obj = new fourth_oops();

        A sss = new A();

        obj.kabir();
    
        sss.kabir();




        
    }
    
}
