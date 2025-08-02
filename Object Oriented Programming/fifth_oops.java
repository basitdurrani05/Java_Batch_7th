// 3). Inheritance  -: 

// Types : 

// 1). Single
// 2). Multiple  (Special Types Access)
// 3). Multilevel
// 4). Hierarchical
// 5). Hybrid


// 1). Single Inheritance  - 1 Parents Class - 1 child Class

// Extends Keyword use hota hai kisi class ko copy kerne kae liye.


class A{     // Parent Class

    
    public void parents(){

        System.out.println("Mummy + Papa");


    }
}


public class fifth_oops extends A {  // Child Class
    

    
    public void child(){

        System.out.println("Son/Daughter");
    }

    public static void main(String[] args) {


        fifth_oops obj = new fifth_oops();

        obj.parents();
        obj.child();
        
    }
    
}
