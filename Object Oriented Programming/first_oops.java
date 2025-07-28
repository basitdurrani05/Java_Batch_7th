// Object Oriented Programming (OOPS)

// Ans - : Solving a problems by creating a object

// Class and Objects


class basit{   // new class

    public void basitkiclass(){

        System.out.println("Basit ek mahan person hai...");
    }
}


class kabir{   // new class

    public void second(){

        System.out.println("I am Second Object......");
    }



}

public class first_oops {   // Class

    public void first(){

        System.out.println("I am a First Object.....");
    }

    public static void main(String[] args) {


        first_oops obj = new first_oops();   // Object

        kabir abc = new kabir();  // Object

        basit tx = new basit();  // Object


        obj.first();
        
        abc.second();

        tx.basitkiclass();
        






        
    }
}