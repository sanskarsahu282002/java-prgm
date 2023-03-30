class human
{
  private int age=39;
  private  String name="sanskar";

  public  int getAge()
  {
    return age;
  }
  public String getName()
  {
    return name;
  }
}

public class encap
 {
  public static void main(String a[ ]) {
    human hum= new human();
    hum.getAge();
    hum.getName();
    System.out.println(hum.getAge()+ ":"  +hum.getName() );
  }
}

