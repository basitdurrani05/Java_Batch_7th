// 1). Encapsulation - Wrapping the data into a single unit.

// Ex : Capsule

// Topic : Getter and Setter   - Private


// Getter - Read the Value

// Setter - Update / Set the value


public class second_oops {

    private int roll_no;    // Private
    private String name;    
    private String company;

    public void setA(int c){    // Set the value

        roll_no = c;

    }


    public int getA(){   // Read the value
 
        return roll_no;
    }


    public void setB(String b){

        name = b;
    }

    public String getB(){

        return name;
    }

    public void setE(String e){

        company = e;


    }

    public String getE(){

        return company;
    }





    public static void main(String[] args) {

        second_oops obj = new second_oops();

        obj.setA(30);

        System.out.println(obj.getA());

        obj.setB("Kabir");

        System.out.println(obj.getB());

        obj.setE("Google");

        System.out.println(obj.getE());


        obj.setA(31);

        System.out.println(obj.getA());

         obj.setB("Basit");

        System.out.println(obj.getB());

         obj.setE("Microsoft");

        System.out.println(obj.getE());

        

       
       
        
    }
}