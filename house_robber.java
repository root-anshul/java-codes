package jc;
import java.util.Scanner;
public class house_robber {
static Scanner in = new Scanner(System.in);
public static void main (String args[]) {
    
    int []arr= {0,0,1,1,1,2,2,3,3,4};
    removeDuplicates(arr);
}
public static int removeDuplicates(int[] arr) {
    int k =0;
    for(int i=0;i<arr.length;i++) {
        for(int j =i+1;j<arr.length;j++) {
            if(arr[i]!=arr[j]) {
                k++;
            }
        }
    }
    System.out.println(k);
    
    
    return 0;
    
    
}

}