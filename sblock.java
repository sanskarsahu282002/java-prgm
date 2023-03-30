import java.util.jar.Attributes.Name;

class mobile{
    String price;
    String brand;
    static String name;
    public mobile(){
        brand="";
        price="2";
        String name="sanskar";
        System.out.println("in constructor");
    }
    static {
        name="samsung";
        System.out.println("in static block");

    }
     public void show(){
        System.out.println(name+ ":" +price+ ":" +brand );
     }
     }
public class sblock {
 public static void main(String[] args) {
    mobile obj=new mobile();
    mobile.name="apple";
    obj.price="23";
    obj.brand="american";
    

        mobile obj1= new mobile();
        obj.show();
         mobile.show(obj);
}
}