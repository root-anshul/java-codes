package jc;

import java.util.Scanner;

public class target_sum {
  static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int t = in.nextInt();
        int[] arr = new int[t];
        
        input(arr);
        target(arr);
    }

public static int[] input(int []arr) {
    for(int i=0;i<arr.length;i++) {
        arr[i]=in.nextInt(); 
    }
    for(int i=0;i<arr.length;i++) {
        for(int j=i+1;j<arr.length;j++) {
            if(arr[i]>arr[j]) {
                int temp =arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
  //  for(int i =0;i<arr.length;i++) {
    //    System.out.println(arr[i]);
    //}
    return arr;
}
public static void target(int []arr) {
    int num =in.nextInt() ;
    for(int i=0;i<arr.length;i++) {
        for(int j=i;j<arr.length;j++) {
            if(arr[i]+arr[j]==num && arr[i]!=arr[j]&&arr[j]!=arr[i] && arr[i]<=arr[j]) {
                System.out.println(arr[i]+" and "+arr[j]);
                                  
        }
        }
              
    }
    if(num<=1) {
        System.out.println(num);
    }
    
    
}

}
