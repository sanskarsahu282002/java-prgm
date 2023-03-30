//import java.lang.*;
//import java.util.Scanner;
public class arr {
     public static void main(String a[] ) {
         //Scanner s = new Scanner(System.in);
        int nums[]= {1,2,3,4};
        int r,c;
        r=3;
        c=3;
        int arr [][] = new int[r][c];
        
        int arr2[][]= {{1,2,3},{1,3,4}};

        System.out.println(nums);

        for(int i=0;i<3;i++){
            for(int j=3;j<c;j++){
                System.out.println(nums[i]);
            }
        }

        int i;
        for(i=0;i<4;i++){
            System.out.println(nums[i]);
        }
        
    }
}
