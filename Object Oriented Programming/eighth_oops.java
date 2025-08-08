// 5). Hierarchical Inheritance


// 1 parents - 2 Child


class A{   // Parnets

    public void parents(){

        System.out.println("Mummy + Papa");
    }
}

class B extends A{  // Son

    public void son(){

        System.out.println("Son");
    }
}






public class eighth_oops extends B {   // Daughter


    public void Daughter(){

        System.out.println("Daughter");
    }

    public static void main(String[] args) {

        eighth_oops obj = new eighth_oops();

        obj.parents();
        obj.son();
        obj.Daughter();
        
    }
    
}
