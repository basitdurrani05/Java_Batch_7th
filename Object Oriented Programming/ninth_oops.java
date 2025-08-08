// 2). Multiple Inheritance (Special type Access With Interface)

// Interface - two object between relation together...

// Ex - TV - Remote, Ac-Remote, Multiple Inheritance - Interface


// 2 child - 1 parents (Expectional Case)

// * Interface  - implements

interface A{   // Child Interface
 
    public void son(); // body
    public void daughter();
    
}




public class ninth_oops implements A {   // Parents

    public void son(){

        System.out.println("Beta");
    }

    public void daughter(){

        System.out.println("Beti");
    }

    public void parentskamethodhaiyae(){

        System.out.println("Mummy + Papa ");
    }



    public static void main(String[] args) {

        ninth_oops obj = new ninth_oops();

        obj.son();
        obj.daughter();
        obj.parentskamethodhaiyae();
        
    }
    
}
