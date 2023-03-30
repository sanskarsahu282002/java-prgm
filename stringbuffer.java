public class stringbuffer {
     public static void main(String[] a) {
        StringBuffer sb = new StringBuffer("sanskar");
        sb.append("sahu");
        String str =sb.toString();
        sb.deleteCharAt(2);
        System.out.println(sb);


    }
    
}
