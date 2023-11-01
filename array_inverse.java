package jc;

import java.util.Scanner;

public class array_inverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] arr = new int[t];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        int[]arr2= inverse(arr);
        print(arr2);

    }
    
    public static void print(int arr[]) {
        for(int i:arr) {
            System.out.print(i+" ");
        }
    }
    
    
public static int[] inverse(int[]arr) {
    int []arr1 =new int [arr.length];
    for(int i=0;i<arr.length;i++) {
        int num=arr[i];
        arr1[num]=i;
        
    }
    return arr1;
    
    
}

}
