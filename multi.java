//import java.util.*;
//import java.lang.*;
public class multi {
     public static void main(String[] arg) {
        //Scanner s= new Scanner(System.in);
        //int p,q,r;
       // p=2;
        //q=6;
        //r=7;
        int n1[][]= new int[3][4];
        int random = 0;
       
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++)
            {
                n1[i][j] =(int) (Math.random()*10);
                System.out.print(n1[i][j] + "   ");
            }
            System.out.println();
        }
        for(int n[]:n1){
            for(int m:n){
                System.out.print(m + "  ");
            }
            System.out.println();
        }
    }
}


        
    

     