public class encap2 
{
    public static void main( String agrs[])
     {
    Human obj= new Human();
      obj.setAge(30);
      obj.setName("sanskar");
      System.out.println(obj.setAge(10) + " : "+ obj.setName("sanskar"));
    
    }
}

class Human

    {
        private int age;
        private String name;
        public int setAge(int a)
        {
            age = a;
            return age;

        }
        public String setName( String b)
        {
            name=b;
            return name;

        }
    }

    

