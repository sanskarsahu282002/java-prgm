
public class stavar {


     public static void main(String[] args) {
        mobile mob=new mobile();
        mob.price="10";
        mob.brand="apple";
        mob.name="phone";

        mobile mob1= new mobile();
        mob1.price="2";
        mob1.name="sphone";
        mob1.price="samsung";

        mob.display();
        mob1.display();


    
        
    }
    
}
class mobile{
    String price;
    static  String brand;
      String name;
    void display(){
        System.out.println(price+ ":" +brand+  ":"  +name);
    }
}
